package org.dbest.metastore;

import org.dbest.commons.DbestStrings;
import org.dbest.core.model.ModelMetaSet;

public abstract class DbestMetaStore {
    protected static final String METASTORE_MODEL_NAME= DbestStrings.METASTORE_NAME;

    public static String getMetastoreModelName() {
        return METASTORE_MODEL_NAME;
    }

    public abstract ModelMetaSet retrieve();
}
