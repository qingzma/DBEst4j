package org.dbest.core.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/**
 *  Model-specific information, model meta
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "schemaName",
        "modelName",
        "originalSchemaName",
        "originalTableName",
        "independent",
        "dependents",
        "originalIndependent",
        "originalDependents",
        "method",
        "ratio",
        "numOfRecords",
        "originalNumOfRecords"
})
public class ModelMeta implements Serializable {
    public static final long serialVersionUID= -737837955980636697L;

    String schemaName;
    String modelName;
    String independent;
    List<String> dependents;

    String originalSchemaName;
    String originalTableName;
    String originalIndependent;
    List<String> originalDependents;

    String method;
    int numOfRecords;
    int originalNumOfRecords;
    double ratio;

    public ModelMeta() { }

    public ModelMeta(String schemaName,
                     String modelName,
                     String independent,
                     List<String> dependents,
                     String originalSchemaName,
                     String originalTableName,
                     String originalIndependent,
                     List<String> originalDependents,
                     String method,
                     double ratio) {
        this.schemaName = schemaName;
        this.modelName = modelName;
        this.independent = independent;
        this.dependents = dependents;
        this.originalSchemaName = originalSchemaName;
        this.originalTableName = originalTableName;
        this.originalIndependent = originalIndependent;
        this.originalDependents = originalDependents;
        this.method = method;
        this.ratio = ratio;
    }

    public ModelMeta(String schemaName,
                     String modelName,
                     String independent,
                     List<String> dependents,
                     String method,
                     double ratio) {
        this.schemaName = schemaName;
        this.modelName = modelName;
        this.independent = independent;
        this.dependents = dependents;
        this.method = method;
        this.ratio = ratio;
    }

    public ModelMeta(String schemaName,
                     String modelName,
                     String independent,
                     List<String> dependents) {
        this.schemaName = schemaName;
        this.modelName = modelName;
        this.independent = independent;
        this.dependents = dependents;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getIndependent() {
        return independent;
    }

    public void setIndependent(String independent) {
        this.independent = independent;
    }

    public List<String> getDependents() {
        return dependents;
    }

    public void setDependents(List<String> dependents) {
        this.dependents = dependents;
    }

    public String getOriginalSchemaName() {
        return originalSchemaName;
    }

    public void setOriginalSchemaName(String originalSchemaName) {
        this.originalSchemaName = originalSchemaName;
    }

    public String getOriginalTableName() {
        return originalTableName;
    }

    public void setOriginalTableName(String originalTableName) {
        this.originalTableName = originalTableName;
    }

    public String getoriginalIndependent() {
        return originalIndependent;
    }

    public void setoriginalIndependent(String originalIndependent) {
        this.originalIndependent = originalIndependent;
    }

    public List<String> getOriginalDependents() {
        return originalDependents;
    }

    public void setOriginalDependents(List<String> originalDependents) {
        this.originalDependents = originalDependents;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getNumOfRecords() {
        return numOfRecords;
    }

    public void setNumOfRecords(int numOfRecords) {
        this.numOfRecords = numOfRecords;
    }

    public int getOriginalNumOfRecords() {
        return originalNumOfRecords;
    }

    public void setOriginalNumOfRecords(int originalNumOfRecords) {
        this.originalNumOfRecords = originalNumOfRecords;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public String toJsonString(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        String jsonString;
        try {
            jsonString = objectMapper.writeValueAsString(this);
            return jsonString;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ModelMeta fromJsonString(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            ModelMeta meta = objectMapper.readValue(jsonString, ModelMeta.class);
            return meta;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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
