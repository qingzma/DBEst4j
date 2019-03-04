package org.dbest.core.sqlobject;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

public class CreateModelDefinitionQuery extends CreateModelQuery{
    private static final long serialVersionUID = 3757624240436617735L;

    // See DataTypeConverter for types
    List<Pair<String, String>> columnNameAndTypes = new ArrayList<>();

    public List<Pair<String, String>> getColumnNameAndTypes() {
        return columnNameAndTypes;
    }

    public void setColumnNameAndTypes(List<Pair<String, String>> columnNameAndTypes) {
        this.columnNameAndTypes = columnNameAndTypes;
    }
}
