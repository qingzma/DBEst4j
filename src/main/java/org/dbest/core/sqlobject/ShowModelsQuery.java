package org.dbest.core.sqlobject;

public class ShowModelsQuery extends DbestQuery {
    private static final long serialVersionUID= -7641681874286445828L;

    @Override
    public String getSql() {
        return "SHOW MODELS";
    }
}