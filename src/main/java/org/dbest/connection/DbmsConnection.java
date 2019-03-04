package org.dbest.connection;

import org.dbest.exception.DBEstDbmsException;

public abstract class DbmsConnection implements MetaDataProvider{
    /**
     * Executes a query (or queries). If the result exists, return it.
     *
     * <p>If a query includes multiple queries separated by semicolons, issue them separately in
     * order.
     *
     * @param sql
     * @return
     * @throws DBEstDbmsException
     */

    public abstract DbmsQueryResult execute(String sql) throws DBEstDbmsException;



}
