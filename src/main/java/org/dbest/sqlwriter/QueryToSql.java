package org.dbest.sqlwriter;

import org.dbest.commons.DBEstStrings;
import org.dbest.core.sqlobject.CreateModelQuery;
import org.dbest.core.sqlobject.CreateSchemaQuery;
import org.dbest.core.sqlobject.SqlConvertible;
import org.dbest.exception.DBEstException;
import org.dbest.exception.DBEstTypeException;
import org.dbest.exception.DBEstValueException;
import org.dbest.sqlsyntax.SqlSyntax;

public class QueryToSql {

    public static String convert(SqlSyntax syntax, SqlConvertible query) throws DBEstException{
        if (query == null){
            throw new DBEstValueException(DBEstStrings.EXCEPTION_NULL_VALUE);
        }

        if (query instanceof CreateModelQuery){
            CreateModelQueryToSql tosql = new CreateModelQueryToSql(syntax);
            return tosql.toSql((CreateModelQuery) query);
        } else if(query instanceof CreateSchemaQuery){
            CreateSchemaQueryToSql tosql = new CreateSchemaQueryToSql(syntax);
            return tosql.toSql((CreateSchemaQuery) query);
        }
        else{
            throw new DBEstTypeException(query);
        }

    }
}
