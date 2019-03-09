package org.dbest;

import org.apache.commons.lang3.RandomStringUtils;
import org.dbest.commons.DbestLogger;
import org.dbest.commons.DbestStrings;
import org.dbest.connection.CachedDbmsConnection;
import org.dbest.connection.DbmsConnection;
import org.dbest.connection.SparkConnection;
import org.dbest.coordinator.ExecutionContext;
import org.dbest.core.model.ModelMetaSet;
import org.dbest.exception.DbestDbmsException;
import org.dbest.exception.DbestException;
import org.dbest.metastore.CachedModelMetaStore;
import org.dbest.metastore.DbestMetaStore;
import org.dbest.metastore.DbestOption;
import org.dbest.metastore.ModelMetaStore;


import java.util.LinkedList;
import java.util.List;

public class DbestContext {

    private DbmsConnection conn;
    private boolean isClosed=false;
    private DbestMetaStore metaStore;
    private final String contextId;
    private long executionSerialNumber=0;
    private DbestOption option;

    private static final DbestLogger log = DbestLogger.getLogger(DbestContext.class);

    /**
     * Maintains the list of open executions. Each query is processed on a separate execution context.
     */
    private List<ExecutionContext> executionContexts = new LinkedList<>();

    public DbestContext(DbmsConnection conn) throws DbestException {
        this.conn = new CachedDbmsConnection(conn);
        this.contextId= RandomStringUtils.randomAlphabetic(5);
        this.option= new DbestOption();
        this.metaStore=getCachedMetaStore(conn,option);
        initialize(option);
    }

    public DbestContext(DbmsConnection conn,DbestOption option) throws DbestException {
        this.conn = new CachedDbmsConnection(conn);
        this.contextId= RandomStringUtils.randomAlphabetic(5);
        this.option= option;
        this.metaStore=getCachedMetaStore(conn,option);
        initialize(option);
    }

    private DbestMetaStore getCachedMetaStore(DbmsConnection conn, DbestOption option){
        CachedModelMetaStore metaStore = new CachedModelMetaStore(new ModelMetaStore(conn,option));
        metaStore.refreshCache();
        return metaStore;
    }

    /**
     * Creates the schema for temp models.
     *
     * @throws DbestException
     */
    private void initialize(DbestOption option) throws DbestException {
        String schema = option.getDbestTempSchemaName();
        String sql= "CREATE  SCHEMA IF NOT EXISTS "+schema;
        conn.execute(sql);
    }


    public static DbestContext fromSparkSession(Object sparkSession) throws DbestException{
        DbmsConnection conn = new SparkConnection(sparkSession);
        return new DbestContext(conn);
    }

    public static DbestContext fromSparkSession(Object sparkSession,DbestOption option) throws DbestException{
        DbmsConnection conn = new SparkConnection(sparkSession);
        return new DbestContext(conn,option);
    }


    public DbmsConnection getConnection() {
        return conn;
    }

    public void setDefaultSchema(String schema){
        try{
            conn.setDefaultSchema(schema);
        } catch (DbestDbmsException e){
            log.error("Encounter errors while setting up the default schema " +e.getMessage());
            System.exit(DbestStrings.EXIT_ABNORMAL);
        }
    }

    public void setLogLevel(String level){ option.setDbestConsoleLogLevel(level);}

    /** terminates all open execution context.
     *
     * */
    public void abort(){
        for (ExecutionContext executionContext: executionContexts){
            executionContext.terminate();
        }
    }

    public void close(){
        this.abort();
        conn.close();
        isClosed=true;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public String getContextId() {
        return contextId;
    }

    public DbestOption getOption() {
        return option;
    }

    public ExecutionContext createNewExecutionContext(){
        long execSerialNumber = getNextExecutionSerialNumber();
        ExecutionContext exec = new ExecutionContext(conn,metaStore,contextId,execSerialNumber,option.copy());
        executionContexts.add(exec);
        return exec;
    }

    private synchronized long getNextExecutionSerialNumber() {
        executionSerialNumber++;
        return executionSerialNumber;
    }

    public ModelMetaSet getModelMetaSet(){return  metaStore.retrieve();}
    public DbestMetaStore getMetaStore(){return metaStore;}

    private void removeExecutionContext(ExecutionContext exec){
        exec.terminate();
        executionContexts.remove(exec);
    }



    /**
     * Returns a reliable result set as an answer. Right now, simply returns the first batch of
     * Continuous results.
     * @param sql a select query for create model query
     * @return
     * @throws DbestException
     */
    public DbestSingleResult sql(String sql) throws DbestException{
        ExecutionContext exec = createNewExecutionContext();
        DbestSingleResult result = exec.sql(sql, false);
        removeExecutionContext(exec);
        return result;
    }




}
