package org.dbest.core.sqlobject;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dbest.commons.Config;
import org.dbest.commons.DbestStrings;
import org.dbest.commons.io.DbestFileSystem;
import org.dbest.parser.DbestSQLParser;
import org.dbest.parser.DbestSQLParser.Drop_model_statementContext;
import org.dbest.sqlparser.SqlParser;



public class DropModelQuery extends DbestQuery{
    private static final long serialVersionUID= 8411765163560707481L;
//    private String schema;
    private String model;
    private String originalTable;
    private String sql;
    private Logger log = LogManager.getLogger(getClass());
    private static Config config;
    private static DbestFileSystem fileSystem;



    public DropModelQuery(String sql) {
        this.sql = sql;
        this.parse();
        config = new Config();
        execute(false);
    }



    public void visit(Drop_model_statementContext drop_model_statementContext){
        try{
            this.model = drop_model_statementContext.model_name.getText();
        }catch (NullPointerException e){
            log.debug("Model name is not provided.");
        }

        try{
            this.originalTable = drop_model_statementContext.original_table.getText();
        }catch (NullPointerException e){
            log.debug("Original table is not provided in the model dropping statement.");
        }



//        log.debug(this.schema);
    }

    @Override
    public void parse(){
        DbestSQLParser p = SqlParser.parse(this.sql);
        visit(p.drop_model_statement());
    }




    @Override
    public String getSql() {
        return null;
    }

    @Override
    public synchronized void execute(boolean getResult) {
        if (! getResult){
            fileSystem = new DbestFileSystem();
            fileSystem.dropModel(model);
            fileSystem.close();
        }
    }
}
