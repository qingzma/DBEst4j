package org.dbest.coordinator;

import org.dbest.commons.DBEstLogger;
import org.dbest.commons.DBEstOption;
import org.dbest.connection.DbmsConnection;
import org.dbest.metastore.DBEstMetaStore;

public class ExecutionContext {
    private DbmsConnection conn;

    private DBEstMetaStore metaStore;

    private QueryContext queryContext;

    private Coordinator runningCoordinator = null;

    private final long serialNumber;

    private final DBEstLogger log = DBEstLogger.getLogger(getClass());

    private DBEstOption options;

    public enum QueryType {
        show_scrambles
    }

    public ExecutionContext(DbmsConnection conn,
                            DBEstMetaStore metaStore,
                            String contextId,
                            long serialNumber,
                            DBEstOption options) {
        this.conn = conn;
        this.metaStore = metaStore;
        this.queryContext = new QueryContext(contextId, serialNumber);
        this.serialNumber = serialNumber;
        this.options = options;
    }
}
