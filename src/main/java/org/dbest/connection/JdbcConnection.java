package org.dbest.connection;

/*
 *    Copyright 2018 University of Michigan
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.dbest.commons.StringSplitter;
import org.dbest.commons. DBEstLogger;
import org.dbest.exception. DBEstDbmsException;
import org.dbest.sqlsyntax.SparkSyntax;
import org.dbest.sqlsyntax.SqlSyntax;
import org.dbest.sqlsyntax.SqlSyntaxList;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class JdbcConnection extends DbmsConnection {

    Connection conn;

    SqlSyntax syntax;

    String currentSchema = null;

    JdbcQueryResult jrs = null;

    protected boolean outputDebugMessage = false;

    protected Statement runningStatement = null;

    protected  DBEstLogger log;

    protected boolean isAborting = false;

    public static JdbcConnection create(String jdbcConnectionString, Properties info)
            throws  DBEstDbmsException {
        try {
            Connection c;
            if (info == null) {
                c = DriverManager.getConnection(jdbcConnectionString);
            } else {
                c = DriverManager.getConnection(jdbcConnectionString, info);
            }
            return JdbcConnection.create(c);
        } catch (SQLException e) {
            throw new  DBEstDbmsException(e);
        }
    }

    public static JdbcConnection create(String jdbcConnectionString) throws  DBEstDbmsException {
        try {
            Connection c = DriverManager.getConnection(jdbcConnectionString);
            return JdbcConnection.create(c);
        } catch (SQLException e) {
            throw new  DBEstDbmsException(e);
        }
    }

    public static JdbcConnection create(Connection conn) throws  DBEstDbmsException {
        String connectionString = null;
        try {
            connectionString = conn.getMetaData().getURL();
        } catch (SQLException e) {
            throw new  DBEstDbmsException(e);
        }

        SqlSyntax syntax = SqlSyntaxList.getSyntaxFromConnectionString(connectionString);
        JdbcConnection jdbcConn = null;

        jdbcConn = new JdbcConnection(conn, syntax);


        return jdbcConn;
    }

    public JdbcConnection(Connection conn, SqlSyntax syntax) {
        this.conn = conn;
        try {
            this.currentSchema = conn.getSchema();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // set a default value if an inappropriate value is set.
        if (currentSchema == null || currentSchema.length() == 0) {
            currentSchema = syntax.getFallbackDefaultSchema();
        }

        this.syntax = syntax;
        this.log =  DBEstLogger.getLogger(this.getClass());
    }

    @Override
    public void abort() {
        log.trace("Aborts a statement if running.");
        isAborting = true;
        try {
            synchronized (this) {
                // having isClosed() check seems to block this statement.
                if (runningStatement != null) {
                    //        if (runningStatement != null && !runningStatement.isClosed()) {
                    log.trace("Aborts a running statement.");
                    runningStatement.cancel();
                    runningStatement.close();
                    runningStatement = null;
                }
            }

            isAborting = false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        log.debug("Closes a JDBC connection.");
        abort();
        try {
            this.conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public DbmsQueryResult execute(String sql) throws  DBEstDbmsException {
        String quoteChars = "'\"";
        List<String> sqls = StringSplitter.splitOnSemicolon(sql, quoteChars);
        DbmsQueryResult finalResult = null;
        for (String s : sqls) {
            finalResult = executeSingle(s);
        }
        return finalResult;
    }

    protected void setRunningStatement(Statement stmt) {
        synchronized (this) {
            runningStatement = stmt;
        }
    }

    protected Statement getRunningStatement() {
        synchronized (this) {
            return runningStatement;
        }
    }

    public DbmsQueryResult executeSingle(String sql) throws  DBEstDbmsException {
        log.debug("Issues the following query to DBMS: " + sql);

        try {
            Statement stmt = conn.createStatement();
            setRunningStatement(stmt);
            JdbcQueryResult jrs = null;
            boolean doesResultExist = stmt.execute(sql);
            if (doesResultExist) {
                ResultSet rs = stmt.getResultSet();
                jrs = new JdbcQueryResult(rs);
                rs.close();
            } else {
                jrs = null;
            }
            setRunningStatement(null);
            stmt.close();
            return jrs;
        } catch (SQLException e) {
            if (isAborting) {
                return null;
            } else {
                String msg = "Issued the following query: " + sql + "\n" + e.getMessage();
                throw new  DBEstDbmsException(msg);
            }
        }
    }

    public DbmsQueryResult executeQuery(String sql) throws  DBEstDbmsException {
        return execute(sql);
    }

    @Override
    public SqlSyntax getSyntax() {
        return syntax;
    }

    public Connection getConnection() {
        return conn;
    }

    @Override
    public List<String> getSchemas() throws  DBEstDbmsException {
        List<String> schemas = new ArrayList<>();
        DbmsQueryResult queryResult = executeQuery(syntax.getSchemaCommand());

        while (queryResult.next()) {
            schemas.add(queryResult.getString(syntax.getSchemaNameColumnIndex()));
        }

        return schemas;
    }

    @Override
    public List<String> getTables(String schema) {
        List<String> tables = new ArrayList<>();
        try {
            DbmsQueryResult queryResult = executeQuery(syntax.getTableCommand(schema));
            while (queryResult.next()) {
                tables.add(queryResult.getString(syntax.getTableNameColumnIndex()));
            }
        } catch ( DBEstDbmsException e) {
            log.debug(e.getMessage());
        }
        return tables;
    }

    @Override
    public List<Pair<String, String>> getColumns(String schema, String table)
            throws  DBEstDbmsException {
        List<Pair<String, String>> columns = new ArrayList<>();
        String sql = syntax.getColumnsCommand(schema, table);

        try {
            DbmsQueryResult queryResult = executeQuery(sql);
            while (queryResult.next()) {
                String type;

                type = queryResult.getString(syntax.getColumnTypeColumnIndex());

                type = type.toLowerCase();

                columns.add(
                        new ImmutablePair<>(queryResult.getString(syntax.getColumnNameColumnIndex()), type));
            }

        } catch (Exception e) {

            throw e;

        }

        return columns;
    }

    @Override
    public List<String> getPartitionColumns(String schema, String table)
            throws  DBEstDbmsException {
        List<String> partition = new ArrayList<>();

        if (!syntax.doesSupportTablePartitioning()) {
            return partition;
        }

        DbmsQueryResult queryResult;

        queryResult = executeQuery(syntax.getPartitionCommand(schema, table));




        while (queryResult.next()) {
            String column = queryResult.getString(0);
            if (column != null) {
                partition.add(queryResult.getString(0));
            }
        }


        return partition;
    }

    @Override
    public String getDefaultSchema() {
        return currentSchema;
    }

    @Override
    public void setDefaultSchema(String schema) throws  DBEstDbmsException {
        try {


            conn.setCatalog(schema);

        } catch (SQLException e) {
            throw new  DBEstDbmsException(e);
        }
        currentSchema = schema;
    }

    public DatabaseMetaData getMetadata() throws  DBEstDbmsException {
        try {
            return conn.getMetaData();
        } catch (SQLException e) {
            throw new  DBEstDbmsException(e);
        }
    }

    public boolean isOutputDebugMessage() {
        return outputDebugMessage;
    }

    public void setOutputDebugMessage(boolean outputDebugMessage) {
        this.outputDebugMessage = outputDebugMessage;
    }

    @Override
    public DbmsConnection copy() throws  DBEstDbmsException {
        JdbcConnection newConn = new JdbcConnection(conn, syntax);
        newConn.setDefaultSchema(currentSchema);
        newConn.jrs = this.jrs;
        newConn.outputDebugMessage = this.outputDebugMessage;
        return newConn;
    }

    /** @return a list of column names of primary key columns. (0-indexed) */
    @Override
    public List<String> getPrimaryKey(String schema, String table) throws  DBEstDbmsException {
        List<Integer> primaryKeyIndexList = new ArrayList<>();
        List<String> primaryKeyColumnName = new ArrayList<>();
        SqlSyntax syntax = getSyntax();
        if (syntax.getPrimaryKey(schema, table) != null) {
            DbmsQueryResult result = execute(syntax.getPrimaryKey(schema, table));
            while (result.next()) {
                primaryKeyIndexList.add(result.getInt(3) - 1);
            }
            List<String> columns = new ArrayList<>();
            result = execute(syntax.getColumnsCommand(schema, table));
            while (result.next()) {
                columns.add(result.getString(0));
            }
            for (int idx : primaryKeyIndexList) {
                primaryKeyColumnName.add(columns.get(idx));
            }
        }

        return primaryKeyColumnName;
    }
}
