package org.dbest.sqlparser;


import org.dbest.commons.DBEstLogger;
import org.dbest.commons.DBEstStrings;
import org.dbest.parser.DBEstSQLParser.Create_model_statementContext;
import org.dbest.parser.DBEstSQLParser.Table_nameContext;
import org.dbest.parser.DBEstSQLParser.Sampling_method_nameContext;
import org.dbest.parser.DBEstSQLParser.Column_nameContext;


import java.util.ArrayList;
import java.util.List;

public class CreateModelQuery extends DBEstQuery{
    private static final long serialVersionUID= 4147244294300305985L;
    private String newSchema;
    private String newModel;
    private String originalSchema;
    private String originalTable;
    private String samplingMethod;
    private String independent;
    private List<String> dependents=new ArrayList<>();
    private double samplingRatio;
    private String groupby;
    private DBEstLogger logger= DBEstLogger.getLogger(this.getClass());



    public void visit(Create_model_statementContext create_model_statement){
        Table_nameContext model = create_model_statement.model_name;
        Table_nameContext original_table = create_model_statement.original_table;
        Sampling_method_nameContext sampling_method = create_model_statement.sampling_method;

        try{
            newSchema = stripQuote(model.schema.getText());
        } catch (NullPointerException e){
            newSchema=DBEstStrings.DEFAULT_MODEL_SCHEMA;
            logger.debug(DBEstStrings.EXCEPTION_MODEL_SCHEMA_NOT_PROVIDED);
        }
        try{
            newModel = stripQuote(model.table.getText());
        }catch (NullPointerException e){
            logger.error(e.getMessage());
            System.exit(DBEstStrings.EXIT_ABNORMAL);
        }

        try{
            originalSchema = stripQuote(original_table.schema.getText());
        }catch (NullPointerException e){
            logger.error(DBEstStrings.EXCEPTION_ORIGINAL_SCHEMA_NOT_PROVIDED);
            System.exit(DBEstStrings.EXIT_ABNORMAL);
        }

        try{
            originalTable = stripQuote(original_table.table.getText());
        }catch (NullPointerException e){
            logger.error(DBEstStrings.EXCEPTION_ORIGINAL_TABLE_NOT_PROVIDED);
            System.exit(DBEstStrings.EXIT_ABNORMAL);
        }

        try{
            independent =create_model_statement.independent_value.getText();
        } catch (NullPointerException e){
            logger.error(DBEstStrings.EXCEPTION_INDEPENDENT_NOT_PROVIDED);
            System.exit(DBEstStrings.EXIT_ABNORMAL);
        }


        try{
            List<Column_nameContext> column_name_list=create_model_statement.column_name_list().column_name();
            for (Column_nameContext cnc:column_name_list){
                dependents.add(cnc.id().getText());
            }
        } catch (NullPointerException e){
            logger.error(DBEstStrings.EXCEPTION_DEPENDENTS_NOT_PROVIDED);
            System.exit(DBEstStrings.EXIT_ABNORMAL);
        }


        System.out.println(dependents);

        try{
            samplingMethod = create_model_statement.sampling_method.getText();
        } catch (NullPointerException e){
            samplingMethod=DBEstStrings.METHOD_UNIFORM;
            logger.debug(DBEstStrings.EXCEPTION_SAMPLING_METHOD_NOT_PROVIDED);
        }


        try{
            String samplingRatioInString =create_model_statement.percent.getText();
            samplingRatio = Double.valueOf(samplingRatioInString);
        } catch (NullPointerException e){
            samplingRatio=1.0;
            logger.debug(DBEstStrings.EXCEPTION_SAMPLING_RATIO_NOT_PROVIDED);
        }


        try{
            groupby=create_model_statement.group_by_item().getText();
            System.out.println(groupby);
        } catch (NullPointerException e){
            groupby=null;
            logger.debug(DBEstStrings.EXCEPTION_GROUPBY_NOT_EXISTS);
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

}
