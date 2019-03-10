package org.dbest.sqlparser;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import org.dbest.core.sqlobject.CreateModelQuery;
import org.dbest.parser.DbestSQLLexer;
import org.dbest.parser.DbestSQLParser;



public class SqlParser {

    private String sql;

    public SqlParser(){}

    public static DbestSQLParser parse(String sql){
        DbestErrorListener dbestErrorListener = new DbestErrorListener();
//        DbestSQLLexer l = new DbestSQLLexer(new ANTLRInputStream(text));
        DbestSQLLexer l = new DbestSQLLexer(CharStreams.fromString(sql));
        l.removeErrorListeners();
        l.addErrorListener(dbestErrorListener);

        DbestSQLParser p = new DbestSQLParser(new CommonTokenStream(l));
        p.removeErrorListeners();
        p.addErrorListener(dbestErrorListener);
        return p;
    }


    public CreateModelQuery toCreateModelQuery(String sql){
        DbestSQLParser p = parse(sql);
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
