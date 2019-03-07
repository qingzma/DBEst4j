package org.dbest.metastore;


import org.apache.commons.lang3.tuple.Pair;
import org.dbest.DBEstSingleResult;
import org.dbest.commons.DBEstLogger;
import org.dbest.commons.DBEstOption;
import org.dbest.commons.DBEstStrings;
import org.dbest.commons.DBEstTimestamp;
import org.dbest.connection.DbmsConnection;
import org.dbest.connection.DbmsQueryResult;
import org.dbest.coordinator.DBEstSingleResultFromDbmsQueryResult;
import org.dbest.core.model.ModelMeta;
import org.dbest.core.model.ModelMetaSet;
import org.dbest.core.sqlobject.*;
import org.dbest.exception.DBEstException;
import org.dbest.sqlwriter.QueryToSql;
import scala.reflect.internal.Trees;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ModelMetaStore  extends DBEstMetaStore{

    private static final String DEFAULT_SCHEMA= DBEstStrings.DRIVER_DEFAULT_META_SCHEMA_NAME;
    private static final String ORIGINAL_SCHEMA= DBEstStrings.DRIVER_DEFAULT_ORIGINAL_SCHEMA;
    private static final String ORIGINAL_TABLE= DBEstStrings.DRIVER_DEFAULT_ORIGINAL_TABLE;
    private static final String MODEL_SCHEMA= DBEstStrings.DRIVER_DEFAULT_MODEL_SCHEMA;
    private static final String MODEL_TABLE= DBEstStrings.DRIVER_DEFAULT_MODEL_TABLE;
    private static final String MODEL_SAMPLING_METHOD= DBEstStrings.DRIVER_DEFAULT_SAMPLING_METHOD;
    private static final String INDEPENDENT= DBEstStrings.DRIVER_DEFAULT_INDEPENDENT;
    private static final List<String> DEPENDENTS= DBEstStrings.DRIVER_DEFAULT_DEPENDENTS;
    private static final String DELETED="DELETED";
    private static final String DATA_COLUMN="data";
    private static final String ADDED_AT = "added_at";


    private DbmsConnection conn;
    private String schema;
    private static final DBEstLogger logger = DBEstLogger.getLogger(ModelMetaStore.class);

    public ModelMetaStore(DbmsConnection conn, DBEstOption option) {
        this(conn,option.getDbestMetaSchemaName());
    }

    public ModelMetaStore(DbmsConnection conn, String schema) {
        this.conn = conn;
        this.schema = schema;
    }

    public static String getDefaultSchema() { return DEFAULT_SCHEMA;    }

    public static String getOriginalSchema() { return ORIGINAL_SCHEMA;    }

    public static String getOriginalTable() { return ORIGINAL_TABLE;    }

    public static String getModelSchema() { return MODEL_SCHEMA;    }

    public static String getModelTable() { return MODEL_TABLE;    }

    public static String getModelSamplingMethod() { return MODEL_SAMPLING_METHOD;    }

    public static String getINDEPENDENT() { return INDEPENDENT;    }

    public static List<String> getDEPENDENTS() { return DEPENDENTS;    }

    public static String getDELETED() { return DELETED;    }

    public static String getDataColumn() { return DATA_COLUMN;    }

    public static String getAddedAt() { return ADDED_AT;    }

    public String getSchema() { return schema;    }



    public void addToMeta(ModelMeta modelMeta) throws DBEstException{
        ModelMetaSet modelMetaSet = new ModelMetaSet();
        modelMetaSet.addModelMeta(modelMeta);
        addToMeta(modelMetaSet);
    }

    /**
     * This will add on top of existing entries. A new metastore table is created if not exists.
     *
     * @param modelMetaSet
     * @throws DBEstException
     */
    public void addToMeta(ModelMetaSet modelMetaSet) throws DBEstException{
        String sql;
        // create a schema if not exists
        if (!conn.getSchemas().contains(schema)){
            CreateSchemaQuery createSchemaQuery = new CreateSchemaQuery(schema);
            createSchemaQuery.setIfNotExists(true);
            sql= QueryToSql.convert(conn.getSyntax(),createSchemaQuery);
            conn.execute(sql);
        }

        //create a table if not exists
        if (!conn.getTables(schema).contains(getMetastoreModelName())){
            CreateModelDefinitionQuery createModelQuery = createModelMetaStoreTableStatements();
            sql=QueryToSql.convert(conn.getSyntax(),createModelQuery);
            conn.execute(sql);
        }

        // insert a new entry
        StringBuilder insertSqls = new StringBuilder();
        for (ModelMeta meta: modelMetaSet){
            InsertValuesQuery q = createInsertMetaQuery(meta);
            String s = QueryToSql.convert(conn.getSyntax(),q);
            logger.debug("Adding a new scramble meta entry with the query: {}", s);
            insertSqls.append(s);
            insertSqls.append("; ");
        }
        conn.execute(insertSqls.toString());


    }

    private CreateModelDefinitionQuery createModelMetaStoreTableStatements(){
        // create table
        String schemaAndTableColumnType = conn.getSyntax().getGenericStringDataTypeName();
        String addedAtColumnType = "TIMESTAMP";
        String dataColumnType = conn.getSyntax().getGenericStringDataTypeName();

        CreateModelDefinitionQuery query = new CreateModelDefinitionQuery();
        query.setNewSchema(schema);
        query.setNewModel(getMetastoreModelName());
        query.addColumnNameAndType(Pair.of(ORIGINAL_SCHEMA,schemaAndTableColumnType));
        query.addColumnNameAndType(Pair.of(ORIGINAL_TABLE,schemaAndTableColumnType));
        query.addColumnNameAndType(Pair.of(MODEL_SCHEMA,schemaAndTableColumnType));
        query.addColumnNameAndType(Pair.of(MODEL_TABLE,schemaAndTableColumnType));
        query.addColumnNameAndType(Pair.of(INDEPENDENT,schemaAndTableColumnType));
//        query.addColumnNamesAndTypes(Pair.of(DEPENDENTS,schemaAndTableColumnType));
        query.addColumnNameAndType(Pair.of(MODEL_SAMPLING_METHOD,schemaAndTableColumnType));

        query.setIfNotExists(true);
        return query;

    }

    private InsertValuesQuery createInsertMetaQuery(ModelMeta meta){
        InsertValuesQuery query = new InsertValuesQuery();
        query.setSchemaName(getSchema());
        query.setModelName(getMetastoreModelName());

        String originalSchema = meta.getOriginalSchemaName();
        String originalTable = meta.getOriginalTableName();
        String modelSchema = meta.getSchemaName();
        String modelTable = meta.getModelName();
        String modelMethod = meta.getMethod();
        DBEstTimestamp timestamp = new DBEstTimestamp(new Date());

        String jsonString = meta.toJsonString();
        query.setValues(
                Arrays.<Object>asList(
                        originalSchema,
                        originalTable,
                        modelSchema,
                        modelTable,
                        modelMethod,
                        timestamp,
                        jsonString
                )
        );
        return query;
    }

    public ModelMeta retrieveExistingModel(String schema, String model){
        try{
            String storeModel = METASTORE_MODEL_NAME;

            List<String> existingSchemas = conn.getSchemas();
            if (!existingSchemas.contains(this.schema)){
                return null;
            }

            List<String> existingModels=conn.getTables(this.schema);
            if (!existingModels.contains(storeModel)) {
                return null;
            }


            //now ready to retrieve
            /**
             *
             *
             * need implementation
             *
             *
             */

            return null;



        } catch (DBEstException e){
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public ModelMetaSet retrieve() {
        return retrieve(conn,getSchema());
    }

    public static ModelMetaSet retrieve(DbmsConnection conn,String storeSchema){
        /**
         *
         *
         * need implementation
         *
         *
         */
        return null;
    }

    public DBEstSingleResult showModels() throws DBEstException{
        String modelAlias="t";
        SelectQuery query=SelectQuery.create(
                Arrays.<SelectItem>asList(
                        new BaseColumn(modelAlias, ORIGINAL_SCHEMA),
                        new BaseColumn(modelAlias, ORIGINAL_TABLE),
                        new BaseColumn(modelAlias, MODEL_SCHEMA),
                        new BaseColumn(modelAlias,MODEL_TABLE)),
                        new BaseModel(schema, METASTORE_MODEL_NAME, modelAlias));
        query.addOrderby(new OrderbyAttribute(ADDED_AT, "desc"));
        String sql = QueryToSql.convert(conn.getSyntax(), query);
        DbmsQueryResult result = conn.execute(sql);

        return new DBEstSingleResultFromDbmsQueryResult(result);
    }
}
