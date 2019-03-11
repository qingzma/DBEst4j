package org.dbest.core.sqlobject;

import java.io.Serializable;

public abstract class DbestQuery implements Serializable {

    public abstract String getSql();

    public abstract void parse();

    public abstract void execute();

    public abstract void execute(boolean getResult);

    public String stripQuote(String expr) {
        return expr.replace("\"", "").replace("`", "");
    }

}
