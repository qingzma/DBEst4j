package org.dbest.metastore;

import org.dbest.commons.DBEstStrings;
import org.dbest.core.model.ModelMetaSet;

public abstract class DBEstMetaStore {
    protected static final String METASTORE_MODEL_NAME= DBEstStrings.METASTORE_NAME;

    public static String getMetastoreModelName() {
        return METASTORE_MODEL_NAME;
    }
    public abstract ModelMetaSet retrieve();


}
