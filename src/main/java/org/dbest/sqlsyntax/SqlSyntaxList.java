package org.dbest.sqlsyntax;

import java.util.Map;
import java.util.TreeMap;

public class SqlSyntaxList {
    static Map<String, SqlSyntax> nameToSyntax = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    static {
//        nameToSyntax.put("Impala", new ImpalaSyntax());
//        nameToSyntax.put("H2", new H2Syntax());
//        nameToSyntax.put("Hive", new HiveSyntax());
//        nameToSyntax.put("Presto", new PrestoHiveSyntax()); // uses Hive only for now.
//        nameToSyntax.put("MySQL", new MysqlSyntax());
//        nameToSyntax.put("PostgreSQL", new PostgresqlSyntax());
//        nameToSyntax.put("Redshift", new RedshiftSyntax());
        nameToSyntax.put("Spark", new SparkSyntax());
//        nameToSyntax.put("SQLite", new SqliteSyntax());
    }

    public static SqlSyntax getSyntaxFor(String name){return nameToSyntax.get(name);}

    public static SqlSyntax getSyntaxFromConnectionString(String connectionString){
        String dbName = connectionString.split(":")[1];
        SqlSyntax syntax = SqlSyntaxList.getSyntaxFor(dbName);
        if (syntax == null) {
            dbName = connectionString.split(":")[0];
            syntax = SqlSyntaxList.getSyntaxFor(dbName);
        }
        return syntax;
    }

}
