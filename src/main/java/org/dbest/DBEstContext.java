package org.dbest;


import org.apache.commons.lang3.RandomStringUtils;
import org.dbest.commons.DBEstLogger;
import org.dbest.commons.DBEstOption;
import org.dbest.connection.CachedDbmsConnection;
import org.dbest.connection.ConcurrentJdbcConnection;
import org.dbest.connection.DbmsConnection;
import org.dbest.connection.SparkConnection;
import org.dbest.coordinator.ExecutionContext;
import org.dbest.core.model.ModelMetaSet;
import org.dbest.core.sqlobject.CreateSchemaQuery;
import org.dbest.exception.DBEstException;
import org.dbest.jdbc.DBEstConnection;
import org.dbest.metastore.CachedModelMetaStore;
import org.dbest.metastore.DBEstMetaStore;
import org.dbest.metastore.ModelMetaStore;
import org.dbest.sqlsyntax.SparkSyntax;
import org.dbest.sqlsyntax.SqlSyntax;
import org.dbest.sqlsyntax.SqlSyntaxList;
import org.iq80.leveldb.DB;


import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

public class DBEstContext {
    private DbmsConnection conn;
    private boolean isClosed=false;
    private DBEstMetaStore metaStore;
    private final String contextId;
    private long executionSerialNumber = 0;
    private DBEstOption options;

    private static final DBEstLogger logger= DBEstLogger.getLogger(DBEstContext.class);

    /**
     * Maintains the list of open executions. Each query is processed on a separate execution context.
     */
    private List<ExecutionContext> executionContexts =new LinkedList<>();

    public DBEstContext(DbmsConnection conn) throws DBEstException {
        this.conn = new CachedDbmsConnection(conn);
        this.contextId= RandomStringUtils.randomAlphabetic(5);
        this.options=new DBEstOption();
        this.metaStore=getCachedMetaStore(conn,options);
        initialize(options);
    }

    public DBEstContext(DbmsConnection conn,DBEstOption options) throws DBEstException {
        this.conn = new CachedDbmsConnection(conn);
        this.contextId= RandomStringUtils.randomAlphabetic(5);
        this.options=options;
        this.metaStore=getCachedMetaStore(conn,options);
        initialize(options);
    }

    private DBEstMetaStore getCachedMetaStore(DbmsConnection conn, DBEstOption option){
        CachedModelMetaStore metaStore = new CachedModelMetaStore(new ModelMetaStore(conn,options));
        metaStore.refreshCache();
        return metaStore;
    }

    /**
     * Creates the schema for temp tables.
     * @param option
     * @throws DBEstException
     */
    private void initialize(DBEstOption option) throws DBEstException{
        String schema=option.getDbestTempSchemaName();
        CreateSchemaQuery query = new CreateSchemaQuery(schema);
        query.setIfNotExists(true);
        conn.execute(query);
    }


    /**
     * Initializes DBEstContext from a SparkSession instance.
     * @param spark The actual type must be SparkSession; however, the type must not explicitly appear
     *    *     in this file. If it does, it causes a ClassNotFound error when DBEstContext is used for
     *    *     JDBC connection (i.e., when not submitted to any Spark cluster) because SparkSession is
     *    *     imported as "provided" scope in our maven dependency list.
     * @return
     * @throws DBEstException
     */
    public static DBEstContext fromSparkSession(Object spark) throws DBEstException{
        DbmsConnection conn = new SparkConnection(spark);
        return new DBEstContext(conn);
    }
    public static DBEstContext fromSparkSession(Object spark,DBEstOption options) throws DBEstException{
        DbmsConnection conn = new SparkConnection(spark);
        return new DBEstContext(conn,options);
    }

    private static String removeDBEstKeywordIfExists(String connectionString) {
        String[] tokens = connectionString.split(":");
        if (tokens[1].equalsIgnoreCase("dbest")) {
            StringBuilder newConnectionString = new StringBuilder();
            for (int i = 0; i < tokens.length; i++) {
                if (i != 1) {
                    newConnectionString.append(tokens[i]);
                }
            }
            connectionString = newConnectionString.toString();
        } else {
            // do nothing
        }
        return connectionString;
    }

    /**
     * Uses a connection pool.
     *
     * @param jdbcConnectionString
     * @return
     * @throws DBEstException
     */
    public static DBEstContext fromConnectionString(String jdbcConnectionString)
            throws DBEstException {
        jdbcConnectionString = removeDBEstKeywordIfExists(jdbcConnectionString);
        if (!attemptLoadDriverClass(jdbcConnectionString)) {
            throw new DBEstException(
                    String.format(
                            "JDBC driver not found for the connection string: %s", jdbcConnectionString));
        }
        DBEstOption options = new DBEstOption();
        options.parseConnectionString(jdbcConnectionString);
        return new DBEstContext(ConcurrentJdbcConnection.create(jdbcConnectionString), options);

    }

    /**
     * Uses a connection pool.
     *
     * @param jdbcConnectionString
     * @param info
     * @return

     * @throws  DBEstException
     */
    public static  DBEstContext fromConnectionString(String jdbcConnectionString, Properties info)
            throws  DBEstException {
        jdbcConnectionString = removeDBEstKeywordIfExists(jdbcConnectionString);
        if (!attemptLoadDriverClass(jdbcConnectionString)) {
            throw new  DBEstException(
                    String.format(
                            "JDBC driver not found for the connection string: %s", jdbcConnectionString));
        }
         DBEstOption options = new  DBEstOption();
        options.parseConnectionString(jdbcConnectionString);
        options.parseProperties(info);
        options.parseConnectionString(jdbcConnectionString);

        return new  DBEstContext(ConcurrentJdbcConnection.create(jdbcConnectionString, info), options);

        //    Connection jdbcConn = DriverManager.getConnection(jdbcConnectionString, info);
        //    return fromJdbcConnection(jdbcConn);
    }

    /**
     * Uses a connection pool.
     *
     * @param jdbcConnectionString
     * @param user
     * @param password
     * @return
     * @throws  DBEstException
     */
    public static  DBEstContext fromConnectionString(
            String jdbcConnectionString, String user, String password) throws  DBEstException {
        jdbcConnectionString = removeDBEstKeywordIfExists(jdbcConnectionString);
        if (!attemptLoadDriverClass(jdbcConnectionString)) {
            throw new  DBEstException(
                    String.format(
                            "JDBC driver not found for the connection string: %s", jdbcConnectionString));
        }
        Properties info = new Properties();
        info.setProperty("user", user);
        info.setProperty("password", password);
         DBEstOption options = new  DBEstOption();
        options.parseConnectionString(jdbcConnectionString);

        return new  DBEstContext(ConcurrentJdbcConnection.create(jdbcConnectionString, info), options);

    }

    public static  DBEstContext fromConnectionString(
            String jdbcConnectionString,  DBEstOption options) throws  DBEstException {
        jdbcConnectionString = removeDBEstKeywordIfExists(jdbcConnectionString);
        attemptLoadDriverClass(jdbcConnectionString);
        options.parseConnectionString(jdbcConnectionString);
        return new  DBEstContext(ConcurrentJdbcConnection.create(jdbcConnectionString), options);

    }
    

    private static boolean attemptLoadDriverClass(String jdbcConnectionString) {
        SqlSyntax syntax = SqlSyntaxList.getSyntaxFromConnectionString(jdbcConnectionString);
        if (syntax == null) return false;
        Collection<String> driverClassNames = syntax.getCandidateJDBCDriverClassNames();
        for (String className : driverClassNames) {
            try {
                Class.forName(className);
                logger.debug(className + " has been loaded into the classpath.");
            } catch (ClassNotFoundException e) {
            }
        }
        return true;
    }

    public DbmsConnection getConnection(){return conn;}

    public void setDefaultSchema(String schema){
        try{
            conn.setDefaultSchema(schema);
        }catch(DBEstException e){
            e.printStackTrace();
        }
    }

    public void setLoglevel(String level) {
        options.setDbestConsoleLogLevel(level);
    }

    public void close() {
        this.abort(); // terminates all ExecutionContexts first.
        conn.close();
        isClosed = true;
    }

    public boolean isClosed() {
        return isClosed;
    }


    public String getContextId() {
        return contextId;
    }

    public DBEstOption getOptions() {
        return options;
    }

    public ExecutionContext createNewExecutionContext() {
        long execSerialNumber = getNextExecutionSerialNumber();
        ExecutionContext exec = null;
//      exec =
//          new ExecutionContext(conn.copy(), metaStore, contextId, execSerialNumber, options.copy());
        // Yongjoo: testing without copy().
        exec = new ExecutionContext(conn, metaStore, contextId, execSerialNumber, options.copy());
        executionContexts.add(exec);
        return exec;
    }

    private synchronized long getNextExecutionSerialNumber() {
        executionSerialNumber++;
        return executionSerialNumber;
    }

    public ModelMetaSet getScrambleMetaSet() {
        return metaStore.retrieve();
    }

    public DBEstMetaStore getMetaStore() {
        return metaStore;
    }

    private void removeExecutionContext(ExecutionContext exec) {
        exec.terminate();
        executionContexts.remove(exec);
    }

    /** terminates all open execution context. */
    public void abort() {
        for (ExecutionContext context : executionContexts) {
            context.terminate();
        }
    }

    public void scramble(String originalSchema, String originalTable) {}

    public void scramble(
            String originalSchema, String originalTable, String newSchema, String newTable) {}

    /**
     * Returns a reliable result set as an answer. Right now, simply returns the first batch of
     * Continuous results.
     *
     * <p>Automatically spawns an independent execution context, then runs a query using it.
     *
     * @param query Either a select query or a create-scramble query
     * @return A single query result is returned. If the query is a create-scramble query, the number
     *     of inserted rows are returned.
     * @throws VerdictDBException
     */
    public VerdictSingleResult sql(String query) throws VerdictDBException {
        ExecutionContext exec = createNewExecutionContext();
        VerdictSingleResult result = exec.sql(query, false);
        removeExecutionContext(exec);
        return result;
    }

    /**
     * @param query Either a select query or a create-scramble query.
     * @return Reader enables progressive query result consumption. If this is a create-scramble
     *     query, the number of inserted rows are returned.
     * @throws VerdictDBException
     */
    public VerdictResultStream streamsql(String query) throws VerdictDBException {
        ExecutionContext exec = createNewExecutionContext();
        VerdictResultStream stream = exec.streamsql(query);
        return stream;
    }




}
