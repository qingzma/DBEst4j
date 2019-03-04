package org.dbest.core.sqlobject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BaseColumns implements Serializable {
    public static final long serialVersionUID = 5500208058646608909L;

    private List<BaseColumn> columns;

    public BaseColumns() {}

//    public BaseColumns(List<BaseColumn> columns) {
//        this.columns = columns;
//    }

    public BaseColumns(List<String> columnNames) {
        this.columns = new ArrayList<>();
        for (String columnName:columnNames) {
            this.columns.add(new BaseColumn(columnName));
        }
    }

    public String toString(){
        List<String> columnNames=new ArrayList<>();
        for (BaseColumn column:columns){
            columnNames.add(column.getColumnName());
        }
        return String.join(",",columnNames);
    }

    public List<BaseColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<BaseColumn> columns) {
        this.columns = columns;
    }
}
