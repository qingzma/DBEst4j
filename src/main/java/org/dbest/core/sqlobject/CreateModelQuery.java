package org.dbest.core.sqlobject;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dbest.commons.Config;
import org.dbest.commons.DbestStrings;
import org.dbest.commons.io.DbestFileSystem;
import org.dbest.parser.DbestSQLParser;
import org.dbest.parser.DbestSQLParser.Create_model_statementContext;
import org.dbest.parser.DbestSQLParser.Table_nameContext;
import org.dbest.parser.DbestSQLParser.Sampling_method_nameContext;
import org.dbest.parser.DbestSQLParser.Column_nameContext;
import org.dbest.sqlparser.SqlParser;


import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to parse the CREATE MODEL query.
 */
public class CreateModelQuery extends DbestQuery {
    private static final long serialVersionUID= -2708012449533315800L;
    private String newSchema;
    private String newModel;
    private String originalSchema;
    private String originalTable;
    private String samplingMethod;
    private String independent;
    private List<String> dependents=new ArrayList<>();
    private double samplingRatio;
    private String groupby;
    private Logger logger = LogManager.getLogger(getClass());
    private static DbestFileSystem fileSystem;

    private String sql;

    public CreateModelQuery(String sql) {
        this.sql = sql;
        this.parse();
//        config = new Config();
        execute(false);
    }

    public void visit(Create_model_statementContext create_model_statement){
        Table_nameContext model = create_model_statement.model_name;
        Table_nameContext original_table = create_model_statement.original_table;
        Sampling_method_nameContext sampling_method = create_model_statement.sampling_method;

        try{
            newSchema = stripQuote(model.schema.getText());
        } catch (NullPointerException e){
            newSchema= DbestStrings.DEFAULT_MODEL_SCHEMA;
            logger.debug(DbestStrings.EXCEPTION_MODEL_SCHEMA_NOT_PROVIDED);
        }
        try{
            newModel = stripQuote(model.table.getText());
        }catch (NullPointerException e){
            logger.error(e.getMessage());
            System.exit(DbestStrings.EXIT_ABNORMAL);
        }

        try{
            originalSchema = stripQuote(original_table.schema.getText());
        }catch (NullPointerException e){
            logger.error(DbestStrings.EXCEPTION_ORIGINAL_SCHEMA_NOT_PROVIDED);
            System.exit(DbestStrings.EXIT_ABNORMAL);
        }

        try{
            originalTable = stripQuote(original_table.table.getText());
        }catch (NullPointerException e){
            logger.error(DbestStrings.EXCEPTION_ORIGINAL_TABLE_NOT_PROVIDED);
            System.exit(DbestStrings.EXIT_ABNORMAL);
        }

        try{
            independent =create_model_statement.independent_value.getText();
        } catch (NullPointerException e){
            logger.error(DbestStrings.EXCEPTION_INDEPENDENT_NOT_PROVIDED);
            System.exit(DbestStrings.EXIT_ABNORMAL);
        }


        try{
            List<Column_nameContext> column_name_list=create_model_statement.column_name_list().column_name();
            for (Column_nameContext cnc:column_name_list){
                dependents.add(cnc.id().getText());
            }
        } catch (NullPointerException e){
            logger.error(DbestStrings.EXCEPTION_DEPENDENTS_NOT_PROVIDED);
            System.exit(DbestStrings.EXIT_ABNORMAL);
        }




        try{
            samplingMethod = create_model_statement.sampling_method.getText();
        } catch (NullPointerException e){
            samplingMethod= DbestStrings.METHOD_UNIFORM;
            logger.debug(DbestStrings.EXCEPTION_SAMPLING_METHOD_NOT_PROVIDED);
        }


        try{
            String samplingRatioInString =create_model_statement.percent.getText();
            samplingRatio = Double.valueOf(samplingRatioInString);
        } catch (NullPointerException e){
            samplingRatio=1.0;
            logger.debug(DbestStrings.EXCEPTION_SAMPLING_RATIO_NOT_PROVIDED);
        }


        try{
            groupby=create_model_statement.group_by_item().getText();
            System.out.println(groupby);
        } catch (NullPointerException e){
            groupby=null;
            logger.debug(DbestStrings.EXCEPTION_GROUPBY_NOT_EXISTS);
        }


    }




    @Override
    public String getSql(){
        String sql="CREATE MODEL "+ newSchema+"."+ newModel + " FROM "+originalSchema+"."+originalTable+
                " INDEPENDENT "+independent+ " DEPENDENT  "+ String.join(", ", dependents)+" METHOD " +
                samplingMethod + " RATIO "+samplingRatio;

        if(groupby !=null){
            sql = sql + " GROUP BY "+groupby;
        }
        return sql;
    }

    @Override
    public void parse() {
        DbestSQLParser p = SqlParser.parse(this.sql);
        visit(p.create_model_statement());
    }




    @Override
    public synchronized void execute(boolean getResult) {
        if (! getResult){
            fileSystem = new DbestFileSystem();
            fileSystem.createModelDir(newModel);
            fileSystem.close();
        }
    }

}
