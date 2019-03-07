package org.dbest.connection;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.dbest.exception.DBEstDbmsException;
import org.dbest.sqlsyntax.SqlSyntax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *  the same as Dbmsconnection, but offer faster query processing.
 */
public class CachedDbmsConnection extends DbmsConnection implements MetaDataProvider {
    DbmsConnection originalConnection;

    public DbmsConnection getOriginalConnection() {
        return originalConnection;
    }

    public CachedDbmsConnection(DbmsConnection originalConnection) {
        this.originalConnection = originalConnection;
    }

    @Override
    public DbmsQueryResult execute(String sql) throws DBEstDbmsException {
        return originalConnection.execute(sql);
    }

    @Override
    public SqlSyntax getSyntax() {
        return originalConnection.getSyntax();
    }

    @Override
    public void close() {
        originalConnection.close();
    }

    @Override
    public void abort() {
        originalConnection.abort();
    }

    @Override
    public DbmsConnection copy() throws DBEstDbmsException {
        CachedDbmsConnection newConn = new CachedDbmsConnection(originalConnection.copy());
        return newConn;
    }

    private List<String> schemaCache = new ArrayList<>();
    private HashMap<String,List<String>> tablesCache = new HashMap<>();
    private HashMap<Pair<String, String>, List<String>> partitionCache = new HashMap<>();

    // Get column name and type
    private HashMap<Pair<String, String>, List<Pair<String, String>>> columnsCache = new HashMap<>();

    public void clearCache(){
        schemaCache.clear();
        tablesCache.clear();
        partitionCache.clear();
        columnsCache.clear();
    }

    @Override
    public List<String> getSchemas() throws DBEstDbmsException {
        if (!schemaCache.isEmpty()){
            return schemaCache;
        }
        synchronized (this){
            List<String> schema = new ArrayList<>();
            schemaCache.clear();
            schemaCache.addAll(originalConnection.getSchemas());
            schema.addAll(schemaCache);
            return schema;
        }
    }

    @Override
    public List<String> getTables(String schema) throws DBEstDbmsException {
        if (tablesCache.containsKey(schema) && !tablesCache.get(schema).isEmpty()){
            return tablesCache.get(schema);
        }
        return getTablesWithoutCaching(schema);
    }

    public List<String> getTablesWithoutCaching(String schema) throws DBEstDbmsException{
        synchronized (this) {
            List<String> tables =new ArrayList<>();
            tablesCache.put(schema,originalConnection.getTables(schema));
            tables.addAll(tablesCache.get(schema));
            return tables;
        }
    }


    @Override
    public List<Pair<String, String>> getColumns(String schema, String table) throws DBEstDbmsException {
        Pair<String, String> key = new ImmutablePair<>(schema,table);
        if (columnsCache.containsKey(key) && !columnsCache.get(key).isEmpty()){
            return columnsCache.get(key);
        }
        synchronized (this){
            List<Pair<String, String>> columns = new ArrayList<>();
            columnsCache.put(key,originalConnection.getColumns(schema,table));
            columns.addAll(columnsCache.get(key));
            return columns;
        }
    }


    /**
     * only needed for DBMS that supports partitioning
     * @param schema
     * @param table
     * @return
     * @throws DBEstDbmsException
     */
    @Override
    public List<String> getPartitionColumns(String schema, String table) throws DBEstDbmsException {
        //    if (!syntax.doesSupportTablePartitioning()) {
        //      throw new VerdictDBDbmsException("Database does not support table partitioning");
        //    }
        Pair<String, String> key = new ImmutablePair<>(schema, table);
        if (columnsCache.containsKey(key) && !partitionCache.isEmpty()) {
            return partitionCache.get(key);
        }
        synchronized (this) {
            List<String> columns = new ArrayList<>();
            partitionCache.put(key, originalConnection.getPartitionColumns(schema, table));
            columns.addAll(partitionCache.get(key));
            return columns;
        }
    }

    @Override
    public String getDefaultSchema() {
        String schema= originalConnection.getDefaultSchema();
        return schema;
    }

    @Override
    public void setDefaultSchema(String schema) throws DBEstDbmsException {
        originalConnection.setDefaultSchema(schema);
    }

    @Override
    public List<String> getPrimaryKey(String schema, String table) throws DBEstDbmsException {
        return originalConnection.getPrimaryKey(schema, table);
    }
}
