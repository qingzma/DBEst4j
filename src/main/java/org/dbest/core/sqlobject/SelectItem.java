package org.dbest.core.sqlobject;

import java.io.Serializable;

public interface SelectItem extends Serializable {
    /**
     * @return True if a column is a non-subquery column and includes aggregate functions.
     */
    boolean isAggregateColumn();

    SelectItem deepcopy();
}
