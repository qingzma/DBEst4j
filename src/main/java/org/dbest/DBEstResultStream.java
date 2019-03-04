package org.dbest;

import java.util.Iterator;

public interface DBEstResultStream extends Iterable<DBEstSingleResult>, Iterator<DBEstSingleResult> {

    DBEstResultStream create(DBEstSingleResult singleResult);

    // return true if all VerdictSingleResult are completed
    boolean isCompleted();

    @Override
    boolean hasNext();

    @Override
    DBEstSingleResult next();

    @Override
    Iterator<DBEstSingleResult> iterator();

    @Override
    void remove();

    void close();
}
