package org.dbest.connection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.dbest.exception.DbestDbmsException;


/**
 * Offers the same functionality as DbmsConnection; however, returns cached metadata whenever
 * possible to speed up query processing.
 *
 *
 */
public class CachedDbmsConnection extends DbmsConnection implements MetaDataProvider {

    DbmsConnection originalConn;

    public DbmsConnection getOriginalConn() {
        return originalConn;
    }

    public CachedDbmsConnection(DbmsConnection conn) {
        //    super(conn);
        this.originalConn = conn;
    }

    @Override
    public DbmsQueryResult execute(String query) throws DbestDbmsException {
        return originalConn.execute(query);
    }



    @Override
    public void abort() {
        originalConn.abort();
    }

    @Override
    public void close() {
        originalConn.close();
    }

    public DbmsConnection getOriginalConnection() {
        return originalConn;
    }

    @Override
    public DbmsConnection copy() throws DbestDbmsException {
        CachedDbmsConnection newConn = new CachedDbmsConnection(originalConn.copy());
        return newConn;
    }

    //  private String defaultSchema = null;

    private List<String> schemaCache = new ArrayList<>();

    private HashMap<String, List<String>> tablesCache = new HashMap<>();

    private HashMap<Pair<String, String>, List<String>> partitionCache = new HashMap<>();

    // Get column name and type
    private HashMap<Pair<String, String>, List<Pair<String, String>>> columnsCache = new HashMap<>();


    public void clearCache() {
        schemaCache.clear();
        tablesCache.clear();
        partitionCache.clear();
        columnsCache.clear();
    }

    @Override
    public List<String> getSchemas() throws DbestDbmsException {
        if (!schemaCache.isEmpty()) {
            return schemaCache;
        }
        synchronized (this) {
            List<String> schemas = new ArrayList<>();
            schemaCache.clear();
            schemaCache.addAll(originalConn.getSchemas());
            schemas.addAll(schemaCache);
            return schemas;
        }
    }

    @Override
    public List<String> getTables(String schema) throws DbestDbmsException {
        if (tablesCache.containsKey(schema) && !tablesCache.get(schema).isEmpty()) {
            return tablesCache.get(schema);
        }
        return getTablesWithoutCaching(schema);
    }

    public List<String> getTablesWithoutCaching(String schema)
            throws DbestDbmsException {
        synchronized (this) {
            List<String> tables = new ArrayList<>();
            tablesCache.put(schema, originalConn.getTables(schema));
            tables.addAll(tablesCache.get(schema));
            return tables;
        }
    }

    @Override
    public List<Pair<String, String>> getColumns(String schema, String table)
            throws DbestDbmsException {
        Pair<String, String> key = new ImmutablePair<>(schema, table);
        if (columnsCache.containsKey(key) && !columnsCache.get(key).isEmpty()) {
            return columnsCache.get(key);
        }
        synchronized (this) {
            List<Pair<String, String>> columns = new ArrayList<>();
            columnsCache.put(key, originalConn.getColumns(schema, table));
            columns.addAll(columnsCache.get(key));
            return columns;
        }
    }

    /**
     * Only needed for the DBMS that supports partitioning.
     *
     * @param schema
     * @param table
     * @return
     * @throws DbestDbmsException
     */
    @Override
    public List<String> getPartitionColumns(String schema, String table)
            throws DbestDbmsException {
        //    if (!syntax.doesSupportTablePartitioning()) {
        //      throw new DbestDbmsException("Database does not support table partitioning");
        //    }
        Pair<String, String> key = new ImmutablePair<>(schema, table);
        if (columnsCache.containsKey(key) && !partitionCache.isEmpty()) {
            return partitionCache.get(key);
        }
        synchronized (this) {
            List<String> columns = new ArrayList<>();
            partitionCache.put(key, originalConn.getPartitionColumns(schema, table));
            columns.addAll(partitionCache.get(key));
            return columns;
        }
    }

    public String getDefaultSchema() {
        String schema = originalConn.getDefaultSchema();
        return schema;
    }

    public void setDefaultSchema(String schema) throws DbestDbmsException {
        originalConn.setDefaultSchema(schema);
    }

    @Override
    public List<String> getPrimaryKey(String schema, String table) throws DbestDbmsException {
        return originalConn.getPrimaryKey(schema, table);
    }
}