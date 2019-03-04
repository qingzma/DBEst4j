package org.dbest;

import org.dbest.commons.DBEstLogger;
import org.dbest.commons.DBEstOption;
import org.dbest.connection.DbmsConnection;
import org.dbest.metastore.DBEstMetaStore;

public class DBEstContext {
    private DbmsConnection conn;
    private boolean isClosed=false;
    private DBEstMetaStore metaStore;
    private final String contextID;
    private long executionSerialNumber = 0;
    private DBEstOption options;

    private static final DBEstLogger logger= DBEstLogger.getLogger(DBEstContext.class);

    /**
     * Maintains the list of open executions. Each query is processed on a separate execution context.
     */



}
