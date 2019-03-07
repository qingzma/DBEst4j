package org.dbest.metastore;

import org.dbest.core.model.ModelMetaSet;

public class CachedModelMetaStore extends DBEstMetaStore{
    DBEstMetaStore originalMetaStore;
    ModelMetaSet cachedMetaSet=null;

    public CachedModelMetaStore(DBEstMetaStore originalMetaStore) {
        this.originalMetaStore = originalMetaStore;
    }

    @Override
    public ModelMetaSet retrieve() {
        if (cachedMetaSet == null) {
            refreshCache();
        }

        return cachedMetaSet;
    }

    public void refreshCache() {
        cachedMetaSet = originalMetaStore.retrieve();
    }
}
