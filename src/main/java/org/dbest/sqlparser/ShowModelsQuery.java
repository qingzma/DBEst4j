package org.dbest.sqlparser;

public class ShowModelsQuery extends DBEstQuery{
    private static final long serialVersionUID= -7641681874286445828L;

    @Override
    public String getSql() {
        return "SHOW MODELS";
    }
}
