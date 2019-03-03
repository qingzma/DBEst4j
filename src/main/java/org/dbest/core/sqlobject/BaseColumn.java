package org.dbest.core.sqlobject;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class BaseColumn implements UnamedColumn,SelectItem,GroupingAttribute {
    private static final long serialVersionUID = -6298054074322510854L;

    private String schemaName = "";
    private String tableSourceAlias = "";
    private String tableName="";
    private String columnName;


    public BaseColumn(String columnName) {
        this.columnName = columnName;
    }

    public BaseColumn(String tableSourceAlias, String columnName) {
        this.tableSourceAlias = tableSourceAlias;
        this.columnName = columnName;
    }

    public BaseColumn(String schemaName, String tableSourceAlias, String tableName, String columnName) {
        this.schemaName = schemaName;
        this.tableSourceAlias = tableSourceAlias;
        this.tableName = tableName;
        this.columnName = columnName;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getTableSourceAlias() {
        return tableSourceAlias;
    }

    public void setTableSourceAlias(String tableSourceAlias) {
        this.tableSourceAlias = tableSourceAlias;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }


    public boolean isAggregateColumn() {
        return false;
    }

    public UnamedColumn deepcopy() {
        return new BaseColumn(schemaName, tableName, tableSourceAlias, columnName);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
