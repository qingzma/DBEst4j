package org.dbest.core.sqlobject;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dbest.commons.Config;
import org.dbest.commons.DbestStrings;
import org.dbest.commons.io.DbestFileSystem;
import org.dbest.parser.DbestSQLParser;
import org.dbest.parser.DbestSQLParser.Create_databaseContext;
import org.dbest.sqlparser.SqlParser;



public class CreateSchemaQuery extends DbestQuery{
    private static final long serialVersionUID= 5727614063174752579L;
    private String schema;
    private String sql;
    private Logger log = LogManager.getLogger(getClass());
    private static Config config;
    private static DbestFileSystem fileSystem;



    public CreateSchemaQuery(String sql) {
        this.sql = sql;
        this.parse();
        config = new Config();
        execute(false);
    }



    public void visit(Create_databaseContext create_databaseContext){
        try{
            this.schema = create_databaseContext.database.getText();
        }catch (NullPointerException e){
            this.schema= DbestStrings.DEFAULT_MODEL_SCHEMA;
            log.debug(DbestStrings.EXCEPTION_MODEL_SCHEMA_NOT_PROVIDED);
        }
//        log.debug(this.schema);
    }

    @Override
    public void parse(){
        DbestSQLParser p = SqlParser.parse(this.sql);
        visit(p.create_database());
    }



    @Override
    public String getSql() {
        return null;
    }

    @Override
    public synchronized void execute(boolean getResult) {
        if (! getResult){
            fileSystem = new DbestFileSystem();
            fileSystem.createSchema(schema);
            fileSystem.close();
        }

    }
}
