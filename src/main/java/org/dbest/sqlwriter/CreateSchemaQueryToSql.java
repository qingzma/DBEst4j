package org.dbest.sqlwriter;

import org.dbest.commons.DBEstStrings;
import org.dbest.core.sqlobject.CreateSchemaQuery;
import org.dbest.exception.DBEstException;
import org.dbest.sqlsyntax.SqlSyntax;

public class CreateSchemaQueryToSql {
    protected SqlSyntax syntax;

    public CreateSchemaQueryToSql(SqlSyntax syntax) {
        this.syntax = syntax;
    }

    public String toSql(CreateSchemaQuery query) throws DBEstException {
         StringBuilder sql = new StringBuilder();
         sql.append(DBEstStrings.SQL_CREATE_SCHEMA);
         if (query.isIfNotExists()){
             sql.append(DBEstStrings.SQL_IF_NOT_EXISTS);
         }
         sql.append(query.getSchemaName());
         return sql.toString();
    }
}
