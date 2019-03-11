package org.dbest.core.sqlobject;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dbest.commons.Config;
import org.dbest.commons.DbestStrings;
import org.dbest.commons.io.DbestFileSystem;
import org.dbest.parser.DbestSQLParser;
import org.dbest.parser.DbestSQLParser.Drop_databaseContext;
import org.dbest.sqlparser.SqlParser;



public class DropSchemaQuery extends DbestQuery{
    private static final long serialVersionUID= 8411765163560707481L;
    private String schema;
    private String sql;
    private Logger log = LogManager.getLogger(getClass());
    private static Config config;
    private static DbestFileSystem fileSystem= new DbestFileSystem();



    public DropSchemaQuery(String sql) {
        this.sql = sql;
        this.parse();
        config = new Config();
        execute();
    }



    public void visit(Drop_databaseContext drop_databaseContext){
        try{
            this.schema = drop_databaseContext.database.getText();
        }catch (NullPointerException e){
            log.debug(DbestStrings.EXCEPTION_MODEL_SCHEMA_NOT_PROVIDED);
        }
//        log.debug(this.schema);
    }

    @Override
    public void parse(){
        DbestSQLParser p = SqlParser.parse(this.sql);
        visit(p.drop_database());
    }

    @Override
    public void execute() {
        fileSystem.dropSchema(schema);
    }

    @Override
    public String getSql() {
        return null;
    }

    @Override
    public void execute(boolean getResult) {

    }
}
