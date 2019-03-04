package org.dbest.sqlreader;


import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.lang3.tuple.Pair;

import org.dbest.core.sqlobject.AbstractRelation;
import org.dbest.core.sqlobject.CreateModelQuery;
import org.dbest.parser.DBEstSQLLexer;
import org.dbest.parser.DBEstSQLParser;


public class SqlParserEntry {

    private String queryInString;

    public SqlParserEntry(){}

    public static DBEstSQLParser parse(String text){
        DBEstErrorListener dbestErrorListener = new DBEstErrorListener();
        DBEstSQLLexer l = new DBEstSQLLexer(new ANTLRInputStream(text));
        l.removeErrorListeners();
        l.addErrorListener(dbestErrorListener);

        DBEstSQLParser p = new DBEstSQLParser(new CommonTokenStream(l));
        p.removeErrorListeners();
        p.addErrorListener(dbestErrorListener);
        return p;
    }

//    public AbstractRelation toRelation(String sql){
//        DBEstSQLParser p = parse(sql);
//
//    }

    public CreateModelQuery toCreateModelQuery(String sql){
        DBEstSQLParser p = parse(sql);
        ModelQueryGenerator generator = new ModelQueryGenerator();
        CreateModelQuery query = generator.visit(p.create_model_statement());
        setQueryInString(generator.toString());
        return query;
    }


    public String getQueryInString() {
        return queryInString;
    }

    public void setQueryInString(String queryInString) {
        this.queryInString = queryInString;
    }
}
