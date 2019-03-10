package org.dbest.core.sqlobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.plexus.logging.LoggerManager;
import org.dbest.commons.Config;
import org.dbest.commons.DbestStrings;
import org.dbest.parser.DbestSQLParser;
import org.dbest.parser.DbestSQLParser.Create_databaseContext;
import org.dbest.sqlparser.SqlParser;

public class CreateSchemaQuery extends DbestQuery{
    private String schema;
    private String sql;
    private Logger log = LogManager.getLogger(getClass());
    private Config config;
    private String dbestFs;


    public CreateSchemaQuery(String sql) {
        this.sql = sql;
        this.parse();
        config = new Config();
        dbestFs=config.getConfigs().getString("dbest.fs");
        log.trace("Enter "+getClass()+ ": File system is "+dbestFs);
    }
git 


    public void visit(Create_databaseContext create_databaseContext){
        try{
            this.schema = create_databaseContext.database.getText();
        }catch (NullPointerException e){
            this.schema= DbestStrings.DEFAULT_MODEL_SCHEMA;
            log.debug(DbestStrings.EXCEPTION_MODEL_SCHEMA_NOT_PROVIDED);
        }
        log.debug(this.schema);
    }

    private void parse(){
        DbestSQLParser p = SqlParser.parse(this.sql);
        visit(p.create_database());
    }

    private void execute(){

    }

    @Override
    public String getSql() {
        return null;
    }

    @Override
    public void execute(boolean getResult) {

    }
}
