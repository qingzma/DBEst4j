package org.dbest.sqlparser;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import org.dbest.parser.DBEstSQLLexer;
import org.dbest.parser.DBEstSQLParser;



public class SqlParser {

    private String sql;

    public SqlParser(){}

    private static DBEstSQLParser parse(String sql){
        DBEstErrorListener dbestErrorListener = new DBEstErrorListener();
//        DBEstSQLLexer l = new DBEstSQLLexer(new ANTLRInputStream(text));
        DBEstSQLLexer l = new DBEstSQLLexer(CharStreams.fromString(sql));
        l.removeErrorListeners();
        l.addErrorListener(dbestErrorListener);

        DBEstSQLParser p = new DBEstSQLParser(new CommonTokenStream(l));
        p.removeErrorListeners();
        p.addErrorListener(dbestErrorListener);
        return p;
    }


    public CreateModelQuery toCreateModelQuery(String sql){
        DBEstSQLParser p = parse(sql);
        CreateModelQuery createModelQuery = new CreateModelQuery();
        createModelQuery.visit(p.create_model_statement());
        setSql(createModelQuery.getSql());
        return createModelQuery;
    }


    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
