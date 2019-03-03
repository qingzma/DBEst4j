package org.dbest.core.sqlobject;

public class CreateTableQuery implements SqlConvertible{
    private static final long serialVersionUID = -3597394499947816808L;

    protected String schemaName;
    protected String tableName;
    protected boolean ifNotExists=false;

    public static CreateTableQuery create(String schemaName, String tableName) {
        CreateTableQuery q=new CreateTableQuery();
        q.schemaName = schemaName;
        q.tableName = tableName;
        q.ifNotExists = true;
        return q;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public boolean isIfNotExists() {
        return ifNotExists;
    }

    public void setIfNotExists(boolean ifNotExists) {
        this.ifNotExists = ifNotExists;
    }
}
