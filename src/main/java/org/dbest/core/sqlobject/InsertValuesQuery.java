package org.dbest.core.sqlobject;

import java.util.ArrayList;
import java.util.List;

public class InsertValuesQuery implements SqlConvertible {
    private static final long serialVersionUID = 3840189437594316730L;

    protected String schemaName;
    protected String modelName;
    protected List<Object> values = new ArrayList<>();

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public List<Object> getValues() {
        return values;
    }

    public void setValues(List<Object> values) {
        this.values = values;
    }
}
