package org.dbest.core.sqlobject;

public class CreateSchemaQuery  implements  SqlConvertible{
    private static final long serialVersionUID = 4782855939144167491L;

    String schemaName;

    boolean ifNotExists = false;

    public CreateSchemaQuery(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public boolean isIfNotExists() {
        return ifNotExists;
    }

    public void setIfNotExists(boolean ifNotExists) {
        this.ifNotExists = ifNotExists;
    }
}
