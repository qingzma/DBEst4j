package org.dbest.core.sqlobject;

import org.dbest.parser.DbestSQLParser;
import org.dbest.parser.DbestSQLParserBaseVisitor;

public class SelectQuery extends DbestSQLParserBaseVisitor<String> {
    private static final long serialVersionUID= 5278965007529265061L;

    @Override
    public String visitSelect_statement(DbestSQLParser.Select_statementContext ctx) {
        return super.visitSelect_statement(ctx);
    }

    //    @Override
//    public String getSql() {
//        return null;
//    }
}
