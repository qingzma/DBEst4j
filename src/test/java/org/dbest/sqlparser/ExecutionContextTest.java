package org.dbest.sqlparser;

import org.dbest.commons.DbestStrings;
import org.dbest.coordinator.ExecutionContext;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExecutionContextTest {

    @Test
    public void testIdentifyQueryType(){
        ExecutionContext executionContext = new ExecutionContext();
        assertEquals(executionContext.identifyQueryType(DbestStrings.SQL_CREATE_MODEL_COMPLETE_),ExecutionContext.QueryType.create_model);
        assertEquals(executionContext.identifyQueryType(DbestStrings.SQL_SHOW_MODELS),ExecutionContext.QueryType.show_models);
        assertEquals(executionContext.identifyQueryType(DbestStrings.SQL_DROP_MODEL),ExecutionContext.QueryType.drop_model);
        assertEquals(executionContext.identifyQueryType(DbestStrings.SQL_DROP_MODELs),ExecutionContext.QueryType.drop_models);
        assertEquals(executionContext.identifyQueryType(DbestStrings.SQL_CREATE_DATABASE),ExecutionContext.QueryType.create_database);
        assertEquals(executionContext.identifyQueryType(DbestStrings.SQL_SHOW_DATABASES),ExecutionContext.QueryType.show_databases);
        assertEquals(executionContext.identifyQueryType(DbestStrings.SQL_DROP_DATABASE),ExecutionContext.QueryType.drop_database);
        assertEquals(executionContext.identifyQueryType(DbestStrings.SQL_SHOW_TABLES),ExecutionContext.QueryType.show_tables);
        assertEquals(executionContext.identifyQueryType(DbestStrings.SQL_SELECT),ExecutionContext.QueryType.select);
    }
}
