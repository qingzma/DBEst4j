package org.dbest.sqlreader;

import org.dbest.core.sqlobject.BaseColumn;
import org.dbest.core.sqlobject.CreateModelQuery;
import org.dbest.core.sqlobject.UnamedColumn;
import org.dbest.parser.DBEstSQLParser;
import org.dbest.parser.DBEstSQLParser.Create_model_statementContext;
import org.dbest.parser.DBEstSQLParser.Table_nameContext;
import org.dbest.parser.DBEstSQLParser.Sampling_method_nameContext;

public class ModelQueryGenerator {
    private String newSchema;
    private String newModel;
    private String originalSchema;
    private String originalTable;
    private String method;
    private String independentInString;
    private String dependentInString;
    private String ratioInString;



    public CreateModelQuery visit(Create_model_statementContext create_model_statement){
        Table_nameContext model = create_model_statement.model_name;
        Table_nameContext original_table = create_model_statement.original_table;
        Sampling_method_nameContext sampling_method = create_model_statement.sampling_method;

        newSchema = stripQuote(model.schema.getText());
        System.out.println(newSchema);
        newModel = stripQuote(model.table.getText());
        System.out.println(newModel);
        originalSchema = stripQuote(original_table.schema.getText());
        System.out.println(originalSchema);
        originalTable = stripQuote(original_table.table.getText());
        System.out.println(originalTable);
        independentInString =create_model_statement.independent_value.getText();
        UnamedColumn independent = new BaseColumn(independentInString);
        System.out.println(independentInString);
        dependentInString =create_model_statement.dependent_value.getText();
        UnamedColumn dependent = new BaseColumn(dependentInString);
        System.out.println(dependentInString);
        method = create_model_statement.sampling_method.getText();
        System.out.println(method);
        ratioInString =create_model_statement.percent.getText();
        System.out.println(ratioInString);
        double ratio = Double.valueOf(ratioInString);


        CreateModelQuery q =new CreateModelQuery(
              newSchema,
                newModel,
                originalSchema,
                originalTable,
                null,
                independent,
                dependent,
                method,
                ratio
        );
        System.out.println(toString());
        return q;
    }


    private String stripQuote(String expr) {
        return expr.replace("\"", "").replace("`", "");
    }

    public String toString(){
        return "CREATE MODEL "+ newSchema+"."+ newModel + " FROM "+originalSchema+"."+originalTable+
                " INDEPENDENT "+independentInString+ " DEPENDENT  "+dependentInString+" METHOD " + method +
                " RATIO "+ratioInString;
    }
}
