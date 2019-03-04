package org.dbest.sqlreader;

import org.dbest.core.sqlobject.CreateModelQuery;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqlParserEntryTest {
    /**
     * Test whether CreateModelQuery.class is working properly.
     */
    @Test
    public void testToCreateModelQuery(){
        String inputQuery="CREATE model  ss.modl from ha.tablex INDEPENDENT y DEPENDENT x METHOD uniform RATIO 0.5";
        String targetQuery="CREATE MODEL ss.modl FROM ha.tablex INDEPENDENT y DEPENDENT  x METHOD uniform RATIO 0.5";
        SqlParserEntry sql =  new SqlParserEntry();
        CreateModelQuery q = sql.toCreateModelQuery(inputQuery);
        String outputQuery = sql.getQueryInString();
        assertEquals(targetQuery,outputQuery);
    }

}
