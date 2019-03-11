package org.dbest.core.sqlobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dbest.commons.Config;
import org.dbest.commons.DbestStrings;
import org.dbest.commons.io.DbestFileSystem;
import org.dbest.parser.DbestSQLParser;
import org.dbest.parser.DbestSQLParser.Use_statementContext;
import org.dbest.sqlparser.SqlParser;

public class UseQuery extends DbestQuery {
    private static final long serialVersionUID= 8626554562524809884L;
    private Logger log = LogManager.getLogger(getClass());
    private static DbestFileSystem fileSystem= new DbestFileSystem();

    private String schema;
    private String sql;

    public UseQuery(String sql) {
        this.sql = sql;
        this.parse();
//        config = new Config();
        execute();
    }

    public void visit(Use_statementContext use_databaseContext){
        try{
            this.schema = use_databaseContext.database.getText();
        }catch (NullPointerException e){
            this.schema= DbestStrings.DEFAULT_MODEL_SCHEMA;
            log.debug(DbestStrings.EXCEPTION_MODEL_SCHEMA_NOT_PROVIDED);
        }
//        log.debug(this.schema);
    }


    @Override
    public String getSql() {
        return sql;
    }

    @Override
    public void parse() {
        DbestSQLParser p = SqlParser.parse(this.sql);
        visit(p.use_statement());
    }

    @Override
    public void execute() {
        fileSystem.setWorkingDirecotry(fileSystem.getWarehouseDir()+"/"+schema);
        log.info("OK");
    }

    @Override
    public void execute(boolean getResult) {

    }
}
