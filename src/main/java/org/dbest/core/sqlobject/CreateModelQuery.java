package org.dbest.core.sqlobject;

import org.dbest.commons.DBEstStrings;
import org.dbest.exception.DBEstValueException;

public class CreateModelQuery implements SqlConvertible{
    private static final long serialVersionUID = -8997917557004208809L;

    private String newSchema;
    private String newModel;
    private String originalSchema;
    private String originalTable;
    private String method;
    protected boolean ifNotExists = false;



    // the condition used to create the model
    private UnamedColumn where = null;
    // the independentColumn of the model
    private UnamedColumn independentColumn= null;
    // the dependentColumn of the model
    private BaseColumns depedentColumns = null;
    // the sampling probability to create te sample
    private double ratio = 1.0;

    public CreateModelQuery() { }

    public CreateModelQuery(
            String newSchema,
            String newModel,
            String originalSchema,
            String originalTable,
            UnamedColumn where,
            UnamedColumn independentColumn,
            BaseColumns depedentColumns,
            String method,
            double ratio) {
        super();
        this.newSchema = newSchema;
        this.newModel = newModel;
        this.originalSchema = originalSchema;
        this.originalTable = originalTable;
        this.method = method;
        this.where = where;
        this.independentColumn = independentColumn;
        this.depedentColumns = depedentColumns;
        this.ratio = ratio;
    }

    public void checkIfValuesProper() throws DBEstValueException {
        if (method.equalsIgnoreCase(DBEstStrings.METHOD_UNIFORM)
                || method.equalsIgnoreCase(DBEstStrings.METHOD_HASH)) {
        } else {
            throw new DBEstValueException(
                    String.format(DBEstStrings.EXCEPTION_METHOD, method));

        }

        if (ratio <=0 || ratio>1){
            throw new DBEstValueException(
                    String.format(DBEstStrings.EXCEPTION_RATIO,ratio)
            );
        }
    }

    public String getNewSchema() {
        return newSchema;
    }

    public void setNewSchema(String newSchema) {
        this.newSchema = newSchema;
    }

    public String getNewModel() {
        return newModel;
    }

    public void setNewModel(String newModel) {
        this.newModel = newModel;
    }

    public String getOriginalSchema() {
        return originalSchema;
    }

    public void setOriginalSchema(String originalSchema) {
        this.originalSchema = originalSchema;
    }

    public String getOriginalTable() {
        return originalTable;
    }

    public void setOriginalTable(String originalTable) {
        this.originalTable = originalTable;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public UnamedColumn getWhere() {
        return where;
    }

    public void setWhere(UnamedColumn where) {
        this.where = where;
    }

    public UnamedColumn getIndependentColumn() {
        return independentColumn;
    }

    public void setIndependentColumn(UnamedColumn independentColumn) {
        this.independentColumn = independentColumn;
    }

    public BaseColumns getDepedentColumns() {
        return depedentColumns;
    }

    public void setDepedentColumn(BaseColumns depedentColumn) {
        this.depedentColumns = depedentColumns;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public boolean isIfNotExists() {
        return ifNotExists;
    }

    public void setIfNotExists(boolean ifNotExists) {
        this.ifNotExists = ifNotExists;
    }
}
