package org.dbest.sqlwriter;

import org.apache.commons.lang3.tuple.Pair;
import org.dbest.commons.DBEstLogger;
import org.dbest.commons.DBEstStrings;
import org.dbest.core.sqlobject.CreateModelDefinitionQuery;
import org.dbest.core.sqlobject.CreateModelQuery;
import org.dbest.exception.DBEstException;
import org.dbest.exception.DBEstTypeException;
import org.dbest.sqlsyntax.SqlSyntax;

import java.util.List;

public class CreateModelQueryToSql {

    protected SqlSyntax syntax;

    public CreateModelQueryToSql(SqlSyntax syntax) {
        this.syntax = syntax;
    }

    public String toSql(CreateModelQuery query) throws DBEstException{
        DBEstLogger logger = DBEstLogger.getLogger(this.getClass());
        logger.debug(DBEstStrings.LOGGER_CONVERT_SQL_TO_STRING+query);

        String sql;

        if (query instanceof CreateModelQuery ){
            sql=createModeToSql((CreateModelDefinitionQuery) query);
        } else {
            throw new DBEstTypeException(query);
        }
        return sql;
    }

    public String createModeToSql(CreateModelDefinitionQuery query){
        StringBuilder sql= new StringBuilder();

        String schemaName = query.getNewSchema();
        String modelName = query.getNewModel();
        List<Pair<String, String>> columnAndTypes = query.getColumnNameAndTypes();

        sql.append(DBEstStrings.SQL_CREATE_MODEL);
        if (query.isIfNotExists()){
            sql.append(DBEstStrings.SQL_IF_NOT_EXISTS);
        }

        return sql.toString();

    }
}
