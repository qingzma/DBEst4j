package org.dbest.coordinator;

public class QueryContext {
    private String dbestContextId;
    private Long executionSerialNumber;

    public QueryContext(String dbestContextId, Long executionSerialNumber) {
        this.dbestContextId = dbestContextId;
        this.executionSerialNumber = executionSerialNumber;
    }

    public String getDbestContextId() {
        return dbestContextId;
    }

    public Long getExecutionSerialNumber() {
        return executionSerialNumber;
    }
}
