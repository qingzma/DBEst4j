package org.dbest.sqlreader;

import org.dbest.core.sqlobject.BaseColumn;
import org.dbest.core.sqlobject.BaseColumns;
import org.dbest.core.sqlobject.CreateModelQuery;
import org.dbest.core.sqlobject.UnnamedColumn;
import org.dbest.parser.DBEstSQLParser.Create_model_statementContext;
import org.dbest.parser.DBEstSQLParser.Table_nameContext;
import org.dbest.parser.DBEstSQLParser.Sampling_method_nameContext;
import org.dbest.parser.DBEstSQLParser.Column_nameContext;

import java.util.ArrayList;
import java.util.List;

public class ModelQueryGenerator {
    private String newSchema;
    private String newModel;
    private String originalSchema;
    private String originalTable;
    private String method;
    private String independentInString;
    private List<String> dependentsInString=new ArrayList<>();
    private BaseColumns dependents;
    private String ratioInString;



    public CreateModelQuery visit(Create_model_statementContext create_model_statement){
        Table_nameContext model = create_model_statement.model_name;
        Table_nameContext original_table = create_model_statement.original_table;
        Sampling_method_nameContext sampling_method = create_model_statement.sampling_method;

        newSchema = stripQuote(model.schema.getText());

        newModel = stripQuote(model.table.getText());

        originalSchema = stripQuote(original_table.schema.getText());

        originalTable = stripQuote(original_table.table.getText());

        independentInString =create_model_statement.independent_value.getText();
        UnnamedColumn independent = new BaseColumn(independentInString);


        List<Column_nameContext> column_name_list=create_model_statement.column_name_list().column_name();
        for (Column_nameContext cnc:column_name_list){
            System.out.println(cnc.id().getText());
            dependentsInString.add(cnc.id().getText());
        }
        System.out.println(dependentsInString.toString());
        dependents = new BaseColumns(dependentsInString);

        method = create_model_statement.sampling_method.getText();

        ratioInString =create_model_statement.percent.getText();

        double ratio = Double.valueOf(ratioInString);


        CreateModelQuery q =new CreateModelQuery(
              newSchema,
                newModel,
                originalSchema,
                originalTable,
                null,
                independent,
                dependents,
                method,
                ratio
        );
        return q;
    }


    private String stripQuote(String expr) {
        return expr.replace("\"", "").replace("`", "");
    }

    public String toString(){
        return "CREATE MODEL "+ newSchema+"."+ newModel + " FROM "+originalSchema+"."+originalTable+
                " INDEPENDENT "+independentInString+ " DEPENDENT  "+ dependents.toString()+" METHOD " + method +
                " RATIO "+ratioInString;
    }

}
