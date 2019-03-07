package org.dbest.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang3.tuple.Pair;
import org.dbest.commons.DBEstLogger;
import org.dbest.exception.DBEstDbmsException;
import org.dbest.sqlsyntax.SqlSyntax;
import org.dbest.sqlsyntax.SqlSyntaxList;

/**
 * Maintains a pool of multiple java.sql.Connections to provide concurrent execution of queries to
 * the backend database.
 *
 * @author Yongjoo Park
 */
public class ConcurrentJdbcConnection extends DbmsConnection {

    private static final int CONNECTION_POOL_SIZE = 10;

    private List<JdbcConnection> connections = new ArrayList<>();

    private int nextConnectionIndex = 0;

    private String url;

    private Properties info;

    private  DBEstLogger logger =  DBEstLogger.getLogger(getClass());

    public ConcurrentJdbcConnection(List<JdbcConnection> connections) {
        this.connections.addAll(connections);
    }

    public ConcurrentJdbcConnection(String url, Properties info, SqlSyntax syntax)
            throws  DBEstDbmsException {
        logger.debug(
                String.format("Creating %d JDBC connections with this url: " + url, CONNECTION_POOL_SIZE));
        this.url = url;
        this.info = info;
        for (int i = 0; i < CONNECTION_POOL_SIZE; i++) {
            try {
                Connection c;
                if (info == null) {
                    c = DriverManager.getConnection(url);
                } else {
                    c = DriverManager.getConnection(url, info);
                }
                connections.add(JdbcConnection.create(c));
            } catch (SQLException e) {
                throw new  DBEstDbmsException(e);
            }
        }
    }

    public static ConcurrentJdbcConnection create(String connectionString, Properties info)
            throws  DBEstDbmsException {
        SqlSyntax syntax = SqlSyntaxList.getSyntaxFromConnectionString(connectionString);
        return new ConcurrentJdbcConnection(connectionString, info, syntax);
    }

    public static ConcurrentJdbcConnection create(String connectionString)
            throws  DBEstDbmsException {
        SqlSyntax syntax = SqlSyntaxList.getSyntaxFromConnectionString(connectionString);
        return new ConcurrentJdbcConnection(connectionString, null, syntax);
    }

    public JdbcConnection getNextConnection() {
        JdbcConnection c;
        // prevent multiple thread increase index at same time
        synchronized (this) {
            c = connections.get(nextConnectionIndex);
            nextConnectionIndex++;
            if (nextConnectionIndex >= connections.size()) {
                nextConnectionIndex = 0;
            }
        }
        return c;
    }

    @Override
    public List<String> getSchemas() throws  DBEstDbmsException {
        return getNextConnection().getSchemas();
    }

    @Override
    public List<String> getTables(String schema) throws  DBEstDbmsException {
        return getNextConnection().getTables(schema);
    }

    @Override
    public List<Pair<String, String>> getColumns(String schema, String table)
            throws  DBEstDbmsException {
        return getNextConnection().getColumns(schema, table);
    }

    @Override
    public List<String> getPartitionColumns(String schema, String table)
            throws  DBEstDbmsException {
        return getNextConnection().getPartitionColumns(schema, table);
    }

    @Override
    public String getDefaultSchema() {
        return getNextConnection().getDefaultSchema();
    }

    @Override
    public void setDefaultSchema(String schema) throws  DBEstDbmsException {
        for (JdbcConnection c : connections) {
            c.setDefaultSchema(schema);
        }
    }

    @Override
    public List<String> getPrimaryKey(String schema, String table) throws  DBEstDbmsException {
        return getNextConnection().getPrimaryKey(schema, table);
    }

    @Override
    public DbmsQueryResult execute(String query) throws  DBEstDbmsException {
        return getNextConnection().execute(query);
    }

    @Override
    public SqlSyntax getSyntax() {
        return getNextConnection().getSyntax();
    }

    @Override
    public void abort() {
        for (JdbcConnection c : connections) {
            c.abort();
        }
    }

    @Override
    public void close() {
        for (JdbcConnection c : connections) {
            c.close();
        }
    }

    @Override
    public DbmsConnection copy() {
        ConcurrentJdbcConnection copy = new ConcurrentJdbcConnection(connections);
        copy.url = url;
        copy.info = info;
        return copy;
    }

    public void reinitiateConnection() throws  DBEstDbmsException {
        for (JdbcConnection connection : connections) {
            try {
                // Timeout 1s
                if (!connection.getConnection().isValid(1)) {
                    Connection c;
                    if (info != null) {
                        c = DriverManager.getConnection(url, info);
                    } else {
                        c = DriverManager.getConnection(url);
                    }
                    connections.set(connections.indexOf(connection), JdbcConnection.create(c));
                }
            } catch (SQLException e) {
                logger.info("Failed to reinitiate connection");
            }
        }
    }
}