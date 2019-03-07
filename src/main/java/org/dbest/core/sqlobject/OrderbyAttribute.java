package org.dbest.core.sqlobject;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class OrderbyAttribute implements Serializable {

    private static final long serialVersionUID = 51474704263642999L;

    GroupingAttribute attribute;

    String order = "asc";

    String nullsOrder = "";

    public OrderbyAttribute(String attributeName) {
        this.attribute = new AliasReference(attributeName);
    }

    public OrderbyAttribute(GroupingAttribute column) {
        this.attribute = column;
    }

    public OrderbyAttribute(String attributeName, String order) {
        this.attribute = new AliasReference(attributeName);
        this.order = order;
    }

    public OrderbyAttribute(GroupingAttribute column, String order) {
        this.attribute = column;
        this.order = order;
    }

    public OrderbyAttribute(GroupingAttribute attribute, String order, String nullsOrder) {
        this.attribute = attribute;
        this.order = order;
        this.nullsOrder = nullsOrder;
    }

    public void setAttribute(GroupingAttribute attribute) {
        this.attribute = attribute;
    }

    public String getOrder() {
        return order;
    }

    public String getNullsOrder() {
        return nullsOrder;
    }

    public GroupingAttribute getAttribute() {
        return attribute;
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
        return ToStringBuilder.reflectionToString(this);
    }
}
