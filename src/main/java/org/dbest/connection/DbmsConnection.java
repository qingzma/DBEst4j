package org.dbest.connection;

import org.dbest.core.sqlobject.SqlConvertible;
import org.dbest.exception.DBEstDbmsException;
import org.dbest.exception.DBEstException;
import org.dbest.sqlsyntax.SqlSyntax;
import org.dbest.sqlwriter.QueryToSql;

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

    public DbmsQueryResult execute(SqlConvertible query) throws DBEstException{
        String sql = QueryToSql.convert(getSyntax(), query);
        DbmsQueryResult result = execute(sql);
        return result;
    }



    public abstract SqlSyntax getSyntax();

    //  public Connection getConnection();

    public abstract void close();

    public abstract void abort();

    public abstract DbmsConnection copy() throws DBEstDbmsException;



}
