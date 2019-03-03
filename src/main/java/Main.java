import org.dbest.sqlreader.SQLParserEntry;
import org.dbest.parser.DBEstSQLParser;


public class Main {
    public static void main(String[] args){

        System.out.println("DBEst");
        SQLParserEntry sql =  new SQLParserEntry();
        DBEstSQLParser result = sql.parse("SELECT * from table");
        System.out.println("DBEst");

        sql.toCreateModelQuery("CREATE model  ss from tablex INDEPENDENT y DEPENDENT x METHOD uniform RATIO 0.5");


    }
}
