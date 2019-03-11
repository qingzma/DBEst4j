package org.dbest.coordinator;

import org.dbest.DbestSingleResultFromDbms;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dbest.commons.DbestStrings;
import org.dbest.connection.CachedDbmsConnection;
import org.dbest.connection.DbmsConnection;
import org.dbest.core.sqlobject.*;
import org.dbest.exception.DbestDbmsException;
import org.dbest.exception.DbestException;
import org.dbest.exception.DbestTypeException;
import org.dbest.metastore.DbestMetaStore;
import org.dbest.metastore.DbestOption;
import org.dbest.parser.DbestSQLParser;
import org.dbest.parser.DbestSQLParserBaseVisitor;
import org.dbest.sqlparser.SqlParser;


public class ExecutionContext {
    private DbmsConnection conn;
    private DbestMetaStore metaStore;
    private QueryContext queryContext;
    private Coordinator coordinator=null;
    private final long serialNumber;
    private final Logger log = LogManager.getLogger(getClass());
    private DbestOption option;
    private SqlParser sqlParser=new SqlParser();

    public enum QueryType{
        select,
        create_model,
        show_models,
        drop_model,
        drop_models,
        drop_database,
        create_database, // create the model db
        show_databases,
        show_tables,
        describe_table,
        use_schema,
        unknown
    }

    public ExecutionContext() {
        this.serialNumber=1;
    }

    public ExecutionContext(DbmsConnection conn,
                            DbestMetaStore metaStore,
                            String contextId,
                            long serialNumber,
                            DbestOption option) {
        this.conn = conn;
        this.metaStore = metaStore;
        this.queryContext = new QueryContext(contextId,serialNumber);
        this.serialNumber = serialNumber;
        this.option = option;
    }

    public static QueryType identifyQueryType(String sql){
        DbestSQLParser parser= SqlParser.parse(sql);
        DbestSQLParserBaseVisitor<QueryType> visitor= new DbestSQLParserBaseVisitor<QueryType>() {
            @Override
            public QueryType visitUse_statement(DbestSQLParser.Use_statementContext ctx) {
                return QueryType.use_schema;
            }

            @Override
            public QueryType visitCreate_model_statement(DbestSQLParser.Create_model_statementContext ctx) {
                return QueryType.create_model;
            }

            @Override
            public QueryType visitDrop_model_statement(DbestSQLParser.Drop_model_statementContext ctx) {
                return QueryType.drop_model;
            }

            @Override
            public QueryType visitDrop_all_models_statement(DbestSQLParser.Drop_all_models_statementContext ctx) {
                return QueryType.drop_models;
            }

            @Override
            public QueryType visitShow_models_statement(DbestSQLParser.Show_models_statementContext ctx) {
                return QueryType.show_models;
            }

            @Override
            public QueryType visitCreate_database(DbestSQLParser.Create_databaseContext ctx) {
                return QueryType.create_database;
            }

            @Override
            public QueryType visitDrop_database(DbestSQLParser.Drop_databaseContext ctx) {
                return QueryType.drop_database;
            }

            @Override
            public QueryType visitSelect_statement(DbestSQLParser.Select_statementContext ctx) {
                return QueryType.select;
            }

            @Override
            public QueryType visitShow_databases_statement(DbestSQLParser.Show_databases_statementContext ctx) {
                return QueryType.show_databases;
            }

            @Override
            public QueryType visitShow_tables_statement(DbestSQLParser.Show_tables_statementContext ctx) {
                return QueryType.show_tables;
            }
        };

        QueryType type = visitor.visit(parser.dbest_statement());
        if (type==null){
            type=QueryType.unknown;
        }
        return type;
    }

    /**
     * Check whether given sql contains 'bypass' keyword at the beginning
     * @param sql
     * @return if the query starts with bypass, return the subquery. Otherwise null.
     */
    private String checkBypass(String sql){
        if (sql.trim().toLowerCase().startsWith("bypass")){
            return sql.trim().substring(6);
        }
        return null;
    }

    private DbestSingleResultFromDbms convertResultsFromDbms(String sql) throws DbestDbmsException{
        return new SingleResultFromDbms(conn.execute(sql));
    }

    public DbestSingleResultFromDbms sql(String sql) throws DbestException{
        return this.sql(sql,true);
    }

    public DbestSingleResultFromDbms sql(String sql, boolean getResult) throws DbestException{

        String bypassSql= checkBypass(sql);
        if (bypassSql!=null){
            return convertResultsFromDbms(bypassSql);
        }

        QueryType queryType = identifyQueryType(sql);

        if ((
//                queryType == QueryType.unknown
        queryType != QueryType.select
        && queryType != QueryType.show_databases
        && queryType != QueryType.show_models
//        && queryType != QueryType.create_model
//        && queryType != QueryType.drop_model
//        && queryType != QueryType.drop_models
//        && queryType != QueryType.drop_database
        )
                && getResult)
        {
            throw new DbestException(DbestStrings.EXCEPTION_SQL_NOT_SUPPORTED);
        }

        if (queryType.equals(QueryType.select)){
            log.debug("Query type: select "+sql);
            return null;
        }

        // for other types of queries, we invalidate cached metadata for expected data
        // manipulations
        if (conn instanceof CachedDbmsConnection) {
            ((CachedDbmsConnection) conn).clearCache();
        }



        if(queryType.equals(QueryType.create_database)){
            log.info("Query type: create database - " +sql);
//            System.out.println("Query type: create database - " +sql);
            CreateSchemaQuery createSchemaQuery = new CreateSchemaQuery(sql);
            return null;
        }
        else if(queryType.equals(QueryType.drop_database)){
            log.info("Query type: drop schema "+sql);
            DropSchemaQuery dropSchemaQuery = new DropSchemaQuery(sql);
            return null;
        }
        else if(queryType.equals(QueryType.use_schema)){
            log.debug("Query type: USE SCHEMA - "+sql);
            UseQuery useQuery = new UseQuery(sql);
            return null;
        }
        else if(queryType.equals(QueryType.create_model)){
            log.debug("Query type: CREATE MODEL - "+sql);
            CreateModelQuery createModelQuery = new CreateModelQuery(sql);
            return null;
        }
        else if(queryType.equals(QueryType.show_models)){
            log.debug("Query type: show models - "+sql);
            ShowModelsQuery showModelsQuery = new ShowModelsQuery(sql);
            return null;
        }
        else if(queryType.equals(QueryType.drop_model)){
            log.debug("Query type: DROP MODELS - "+sql);
            DropModelQuery dropModelQuery = new DropModelQuery(sql);
            return null;
        }
        else if(queryType.equals(QueryType.show_databases)){
            log.debug("Query type: show models "+sql);
            ShowSchemaQuery showSchemaQuery = new ShowSchemaQuery(sql);
            return null;
        } else {
            DbestTypeException e= new DbestTypeException("Unexpected query type :" + sql);
            throw e;
        }
    }

    public void abort(){
        log.trace("Abort an Execution Context.");
        if (coordinator != null){
            Coordinator c = coordinator;
            coordinator = null;
            c.abort();
        }
    }

    /**
     * not implemented yet.
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */
    public void terminate(){
        abort();

//        try{
//
//
//        } catch (DbestDbmsException e){
//            e.printStackTrace();
//        }
    }


}
