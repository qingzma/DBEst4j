package org.dbest.sqlreader;


import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.lang3.tuple.Pair;

import org.dbest.parser.DBEstSQLLexer;
import org.dbest.parser.DBEstSQLParser;


public class SQLParserEntry {
    public SQLParserEntry(){}

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




}
