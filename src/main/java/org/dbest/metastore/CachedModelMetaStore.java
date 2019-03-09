package org.dbest.metastore;

import org.dbest.core.model.ModelMetaSet;

public class CachedModelMetaStore extends DbestMetaStore {
    DbestMetaStore originalMetaStore;
    ModelMetaSet cachedMetaSet=null;

    public CachedModelMetaStore(DbestMetaStore originalMetaStore) {
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
