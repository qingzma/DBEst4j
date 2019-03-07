import org.dbest.sqlparser.SqlParser;


public class Main {
    public static void main(String[] args){

//        System.out.println("DBEst");
        SqlParser parser =  new SqlParser();
//        DBEstSQLParser result = SqlParser.parse("SELECT * from table");
//        System.out.println("DBEst");
        parser.toCreateModelQuery("CREATE model  ss.modl from ha.tablex INDEPENDENT y DEPENDENT x,z METHOD uniform RATIO 0.5");// group by groups");
        parser.toCreateModelQuery("CREATE model  ss.modl from ha.tablex INDEPENDENT y DEPENDENT x,z");// group by groups");
        System.out.println(parser.getSql());

        parser.toCreateModelQuery("CREATE model  ss.modl from ha.tablex INDEPENDENT y DEPENDENT x,z group by groups");
        System.out.println(parser.getSql());
    }
}
