package org.dbest.metastore;


import org.dbest.connection.DbmsConnection;
import org.dbest.core.model.ModelMetaSet;

public class ModelMetaStore  extends DbestMetaStore {
    private DbmsConnection conn;

    private String metaSchemaName;

    public ModelMetaStore(DbmsConnection conn, String metaSchemaName) {
        this.conn = conn;
        this.metaSchemaName = metaSchemaName;
    }

    public ModelMetaStore(DbmsConnection conn, DbestOption option) {
        this(conn,option.getDbestMetaSchemaName());
    }

    @Override
    public ModelMetaSet retrieve() {
        return null;
    }
}
