package org.dbest.core.sqlobject;

import java.io.Serializable;
import java.util.List;

import com.google.common.base.Optional;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class AbstractRelation implements Serializable {
    private static final long serialVersionUID = 1668916233968899590L;

    Optional<String> aliasName = Optional.absent();

    public Optional<String> getAliasName() {
        return aliasName;
    }

    public void setAliasName(Optional<String> aliasName) {
        this.aliasName = aliasName;
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

    public AbstractRelation deepcopy(){return null;}

    public boolean isSupportedAggregate(){
        return true;
        /**
         *
         *
         * this need to be implemented.
         *
         *
         *
         *
         *
         *
         *
         *
         *
         *
         */
    }


}
