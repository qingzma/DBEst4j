package org.dbest.sqlparser;

import java.io.Serializable;

public abstract class DBEstQuery implements Serializable {

    public abstract String getSql();

    public String stripQuote(String expr) {
        return expr.replace("\"", "").replace("`", "");
    }

}
