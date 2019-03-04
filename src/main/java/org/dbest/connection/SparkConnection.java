package org.dbest.connection;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.dbest.commons.DBEstLogger;
import org.dbest.commons.StringSplitter;
import org.dbest.core.sqlobject.SqlConvertible;
import org.dbest.exception.DBEstDbmsException;
import org.dbest.exception.DBEstException;
import org.dbest.sqlsyntax.SparkSyntax;
import org.dbest.sqlsyntax.SqlSyntax;

import java.util.ArrayList;
import java.util.List;

public class SparkConnection  extends DbmsConnection {
    private SparkSession sc;
    private SqlSyntax syntax;
    private String currentSchema;
    private DBEstLogger logger = DBEstLogger.getLogger(this.getClass());

    public SparkConnection(Object sc){
        this.sc = (SparkSession) sc;
        this.syntax= new SparkSyntax();
    }

    public SparkConnection(SparkSession sc) {
        this.sc = sc;
    }

    public SparkConnection(SparkSession sc, SqlSyntax syntax) {
        this.sc = sc;
        this.syntax = syntax;
    }


    @Override
    public List<String> getSchemas() throws DBEstDbmsException {
        List<String> schemas = new ArrayList<>();
        DbmsQueryResult queryResult = execute(syntax.getSchemaCommand());
        while (queryResult.next()) {
            schemas.add((String) queryResult.getValue(syntax.getSchemaNameColumnIndex()));
        }
        return schemas;
    }

    @Override
    public List<String> getTables(String schema) throws DBEstDbmsException {
        List<String> tables = new ArrayList<>();
        try {
            DbmsQueryResult queryResult = execute(syntax.getTableCommand(schema));
            while (queryResult.next()) {
                tables.add((String) queryResult.getValue(syntax.getTableNameColumnIndex()));
            }
        } catch (Exception e) {
            if (e.getMessage().contains("not found")) {
                // do nothing
            } else {
                throw e;
            }
        }
        return tables;
    }

    @Override
    public List<Pair<String, String>> getColumns(String schema, String table) throws DBEstDbmsException {
        List<Pair<String, String>> columns = new ArrayList<>();
        DbmsQueryResult queryResult = execute(syntax.getColumnsCommand(schema, table));
        while (queryResult.next()) {
            String name = queryResult.getString(syntax.getColumnNameColumnIndex());
            String type = queryResult.getString(syntax.getColumnTypeColumnIndex());
            type = type.toLowerCase();

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
    public void setDefaultSchema(String schema) throws DBEstDbmsException {
        currentSchema=schema;
    }

    @Override
    public List<String> getPrimaryKey(String schema, String table) throws DBEstDbmsException {
        return null;
    }

    @Override
    public List<String> getPartitionColumns(String schema, String table) throws DBEstDbmsException {
        List<String> partition = new ArrayList<>();

        DbmsQueryResult queryResult = execute(syntax.getPartitionCommand(schema, table));
        boolean hasPartitionInfoStarted = false;
        while (queryResult.next()) {
            String name = queryResult.getString(0);
            if (hasPartitionInfoStarted && (name.equalsIgnoreCase("# col_name") == false)) {
                partition.add(name);
            } else if (name.equalsIgnoreCase("# Partition Information")) {
                hasPartitionInfoStarted = true;
            }
        }

        return partition;
    }


    @Override
    public DbmsQueryResult execute(String sql) throws DBEstDbmsException {
        String quoteChars = "'\"";
        List<String> sqls = StringSplitter.splitOnSemicolon(sql, quoteChars);
        DbmsQueryResult finalResult = null;
        for (String s : sqls) {
            finalResult = executeSingle(s);
        }
        return finalResult;
    }

    public DbmsQueryResult executeSingle(String sql) throws DBEstDbmsException {
        sql = sql.replace(";", "");   // remove semicolons
        logger.debug("Issues the following query to Spark: " + sql);

        try {
            SparkQueryResult srs = null;
            Dataset<Row> result = sc.sql(sql);
            if (result != null) {
                srs = new SparkQueryResult(result);
            }
            return srs;
        } catch (Exception e) {
            String msg = "Issued the following query: " + sql + "\n" + e.getMessage();
            throw new DBEstDbmsException(msg);
        }
    }

//    @Override
//    public DbmsQueryResult execute(SqlConvertible query) throws DBEstException {
//        return super.execute(query);
//    }

    @Override
    public SqlSyntax getSyntax() {
        return syntax;
    }

    @Override
    public void close() {
        try {
            this.sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void abort() {

    }

    @Override
    public DbmsConnection copy() throws DBEstDbmsException {
        SparkConnection newConn = new SparkConnection(sc, syntax);
        newConn.setDefaultSchema(currentSchema);
        return newConn;
    }

    public SparkSession getSparkSession() {
        return sc;
    }
}
