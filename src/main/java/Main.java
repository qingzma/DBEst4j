import org.dbest.sqlreader.SqlParserEntry;
import org.dbest.parser.DBEstSQLParser;


public class Main {
    public static void main(String[] args){

        System.out.println("DBEst");
        SqlParserEntry sql =  new SqlParserEntry();
        DBEstSQLParser result = SqlParserEntry.parse("SELECT * from table");
        System.out.println("DBEst");
        sql.toCreateModelQuery("CREATE model  ss.modl from ha.tablex INDEPENDENT y DEPENDENT x METHOD uniform RATIO 0.5");
    }
}
