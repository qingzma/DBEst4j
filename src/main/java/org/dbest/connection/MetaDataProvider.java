package org.dbest.connection;

import org.apache.commons.lang3.tuple.Pair;
import org.dbest.exception.DBEstDbmsException;

import java.util.List;

public interface MetaDataProvider {
    public List<String> getSchemas() throws DBEstDbmsException;

    List<String> getTables(String schema) throws DBEstDbmsException;

    public List<Pair<String, String>> getColumns(String schema, String table)
            throws DBEstDbmsException;

    public String getDefaultSchema();

    public void setDefaultSchema(String schema) throws DBEstDbmsException;

    public List<String> getPrimaryKey(String schema, String table) throws DBEstDbmsException;

    public List<String> getPartitionColumns(String schema, String table)
            throws DBEstDbmsException;
}
