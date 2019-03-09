package org.dbest.connection;

import org.dbest.exception.DbestDbmsException;

public abstract class DbmsConnection implements MetaDataProvider {

    public abstract DbmsQueryResult execute(String sql) throws DbestDbmsException;

    public abstract void close();

    public abstract void abort();

    public abstract DbmsConnection copy() throws DbestDbmsException;
}
