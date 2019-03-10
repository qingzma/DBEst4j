package org.dbest.connection;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dbest.commons.StringSplitter;
import org.dbest.exception.DbestDbmsException;

import java.util.ArrayList;
import java.util.List;

public class SparkConnection extends DbmsConnection{

    public SparkSession sc;

    private String currentSchema;

    private Logger log = LogManager.getLogger(getClass());

    public SparkConnection(SparkSession sc) {
        this.sc = sc;
    }

    public SparkConnection(Object sc) {
        this.sc = (SparkSession) sc;
    }

    @Override
    public List<String> getSchemas() throws DbestDbmsException {
        List<String> schemas=new ArrayList<>();
        DbmsQueryResult queryResult=execute("SHOW DATABASES");
        while (queryResult.next()){
            schemas.add((String)queryResult.getValue(0));
        }
        return schemas;
    }

    @Override
    public List<String> getTables(String schema) throws DbestDbmsException {
        List<String> tables = new ArrayList<>();
        try{
            DbmsQueryResult queryResult =execute("SHOW TABLES IN "+ quoteName(schema));
        } catch(Exception e){
            if (e.getMessage().contains("not found")) {
                // do nothing
            } else {
                throw new DbestDbmsException("Error to get tables from spark:" + e.getMessage());
            }
        }
        return tables;
    }


    @Override
    public List<Pair<String, String>> getColumns(String schema, String table) throws DbestDbmsException {
        List<Pair<String, String>> columns = new ArrayList<>();
        DbmsQueryResult queryResult = execute("DESCRIBE " + quoteName(schema) + "." + quoteName(table));
        while(queryResult.next()){
            String name =queryResult.getString(0);
            String type =queryResult.getString(1);
            type=type.toLowerCase();

            // when there exists partitions in a table, this extra information will be returned.
            // we should ignore this.
            if (name.equalsIgnoreCase("# Partition Information")) {
                break;
            }
            columns.add(new ImmutablePair<>(name, type));
        }
        return columns;
    }

    @Override
    public String getDefaultSchema() {
        return currentSchema;
    }

    @Override
    public void setDefaultSchema(String schema) throws DbestDbmsException {
        currentSchema=schema;
    }

    @Override
    public List<String> getPartitionColumns(String schema, String table) throws DbestDbmsException {
        List<String> partition = new ArrayList<>();
        DbmsQueryResult queryResult = execute("DESCRIBE " + quoteName(schema) + "." + quoteName(table));
        boolean hasPartitionInfoStarted = false;
        while (queryResult.next()) {
            String name = queryResult.getString(0);
            if (hasPartitionInfoStarted && (name.equalsIgnoreCase("# col_name")==false)){
                partition.add(name);
            }else if (name.equalsIgnoreCase("# Partition Information")) {
                hasPartitionInfoStarted = true;
            }
        }
        return partition;
    }

    /**
     * This method has not been implemented yet.
     * @param schema
     * @param table
     * @return
     * @throws DbestDbmsException
     */
    @Override
    public List<String> getPrimaryKey(String schema, String table) throws DbestDbmsException {
        return null;
    }


    @Override
    public DbmsQueryResult execute(String sql) throws DbestDbmsException {
        String quoteChars = "'\"";
        List<String> sqls = StringSplitter.splitOnSemicolon(sql,quoteChars);
        DbmsQueryResult finalResult=null;
        for (String s:sqls){
            finalResult=executeSingle(s);
        }
        return finalResult;
    }

    public DbmsQueryResult executeSingle(String sql) throws DbestDbmsException {
        sql = sql.replace(";","");
        log.debug("Issue the following query to spark: "+sql);

        try{
            SparkQueryResult srs=null;
            Dataset<Row> result=sc.sql(sql);
            if (result != null){
                srs = new SparkQueryResult(result);
            }
            return srs;
        } catch (Exception e){
            String msg = "Error occurs while issuing the following query: "+ sql +e.getMessage();
            throw new DbestDbmsException(msg);
        }
    }

    @Override
    public void close() {
        try{
            this.sc.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void abort() {

    }

    @Override
    public DbmsConnection copy() throws DbestDbmsException {
        SparkConnection newConn  = new SparkConnection(sc);
        newConn.setCurrentSchema(currentSchema);
        return newConn;
    }


    public void setSc(SparkSession sc) {
        this.sc = sc;
    }

    public void setCurrentSchema(String currentSchema) {
        this.currentSchema = currentSchema;
    }

    public SparkSession getSc() {
        return sc;
    }

    public String getCurrentSchema() {
        return currentSchema;
    }

    public String quoteName(String name) {
        String quoteString = "`";
        return quoteString + name + quoteString;
    }
}
