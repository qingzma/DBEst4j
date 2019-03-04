package org.dbest.core.model;

import org.apache.commons.lang3.tuple.Pair;

import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;

/**
 * A set of ModelMeta items.
 */
public class ModelMetaSet  implements Serializable, Iterable<ModelMeta> {
    private static final long serialVersionUID = 2114582778464379279L;

    // key: (schema, model) of a model
    // value: meta information
    List<Pair<Pair<String, String>, ModelMeta>> metaSet = new ArrayList<>();

    public ModelMetaSet() { }

    public static ModelMetaSet createFromCollection(Collection<ModelMeta> metaList){
        ModelMetaSet metaset = new ModelMetaSet();
        for (ModelMeta meta: metaList){
            metaset.addModelMeta(meta);
        }
        return metaset;
    }

    /**
     * Add a new model meta entry. If there exists an existing entry for the same model,
     * the value is overwritten.
     *
     * @param modelMeta
     */
    public void addModelMeta(ModelMeta modelMeta){
        String schema = modelMeta.getSchemaName();
        String model = modelMeta.getModelName();
        metaSet.add(Pair.of(getMetaKey(schema,model),modelMeta));
    }

    public void addModelMeta(
            String schemaName,
            String modelName,
            String independent,
            List<String> depentents,
            String method,
            double ratio
    ){
        ModelMeta modelMeta=new ModelMeta(schemaName,modelName,independent,depentents,method,ratio);
        metaSet.add(Pair.of(getMetaKey(schemaName,modelName),modelMeta));
    }

    private Pair<String, String> getMetaKey(String schemaName, String modelName){
        return Pair.of(schemaName,modelName);
    }


    public ModelMeta getSingleMeta(String schemaName, String modelName){
        return getMetaFor(getMetaKey(schemaName,modelName));
    }

    private ModelMeta getMetaFor(Pair<String,String> metakey){
        for (Pair<Pair<String, String>, ModelMeta> item : metaSet) {
            Pair<String, String> key = item.getKey();
            ModelMeta m = item.getValue();
            if (key.equals(metakey)) {
                return m;
            }
        }
        return null;
    }

    private boolean doesContain(Pair<String, String> metakey) {
        for (Pair<Pair<String, String>, ModelMeta> item : metaSet) {
            Pair<String, String> key = item.getKey();
            if (key.equals(metakey)) {
                return true;
            }
        }
        return false;
    }

    public boolean doesContain(String schemaName, String modelName){
        return  doesContain(getMetaKey(schemaName, modelName));
    }

    public String  getIndependent(String schemaName, String modelName){
        return getSingleMeta(schemaName,modelName).getIndependent();
    }

    public List<String> getDependents(String schemaName, String modelName){
        return getSingleMeta(schemaName,modelName).getDependents();
    }

    public String getModelMethod(String schemaName, String modelName){
        return getSingleMeta(schemaName,modelName).getMethod();
    }


    @Override
    public Iterator<ModelMeta> iterator() {
        List<ModelMeta> metas = new ArrayList<>();
        for (Pair<Pair<String, String>,ModelMeta> item : metaSet){
            metas.add(item.getValue());
        }
        return metas.iterator();
    }


}
