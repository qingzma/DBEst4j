package org.dbest.connection;

import org.apache.commons.lang3.tuple.Pair;
import org.dbest.exception.DbestDbmsException;

import java.util.List;

public interface MetaDataProvider {

    public List<String> getSchemas() throws DbestDbmsException;

    List<String> getTables(String schema) throws DbestDbmsException;

    public List<Pair<String, String>> getColumns(String schema, String table)
            throws DbestDbmsException;

    public String getDefaultSchema();

    public void setDefaultSchema(String schema) throws DbestDbmsException;

    public List<String> getPartitionColumns(String schema, String table)
            throws DbestDbmsException;

    public List<String> getPrimaryKey(String schema, String table) throws DbestDbmsException;

}
