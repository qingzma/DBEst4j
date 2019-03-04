package org.dbest.coordinator;

public class QueryContext {
    private String dbestContextId;
    private long executionSerialNumber;

    public QueryContext(String dbestContextId, long executionSerialNumber) {
        this.dbestContextId = dbestContextId;
        this.executionSerialNumber = executionSerialNumber;
    }

    public String getDbestContextId() {
        return dbestContextId;
    }

    public long getExecutionSerialNumber() {
        return executionSerialNumber;
    }
}
