package org.dbest.sqlsyntax;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * This is a copy from verdictdb.
 */
public abstract class SqlSyntax {
    public abstract boolean doesSupportTablePartitioning();

    public abstract void dropTable(String schema, String tablename);

    // The column index that stored meta information in the original database
    public abstract int getColumnNameColumnIndex();

    public abstract String getColumnsCommand(String schema, String table);

    // The column index that stored meta information in the original database
    public abstract int getColumnTypeColumnIndex();

    // Assumes that each partitioning column is an int-type column that contains values ranging from
    // 0 to partitionCounts.get(i)-1.
    public abstract String getPartitionByInCreateTable(
            List<String> partitionColumns, List<Integer> partitionCounts);

    public abstract String getPartitionCommand(String schema, String table);

    public abstract String getQuoteString();

    public abstract String getSchemaCommand();

    public abstract int getSchemaNameColumnIndex();

    public abstract String getTableCommand(String schema);

    // The column index that stored meta information in the original database
    public abstract int getTableNameColumnIndex();

    public abstract String randFunction();

    /**
     * This indicates the size of each block. Using a smaller block increases the speed at the cost
     * of some processing overhead.
     * @return
     */
    public long getRecommendedblockSize() {
        return (int) 1e6;
    }


    /**
     * Returns a hash value between 0 (inclusive) and 1 (exclusive).
     *
     * This hash function is supposed to provide good randomization quality. That is,
     * when an arbitrary set of elements are hashed, the distribution should be even.
     *
     * It is important to note that the argument is already quoted column names or values.
     *
     * @param column The column name
     *
     * @return Hashed integer
     */
    public abstract String hashFunction(String column);

    // this indicates 0.00001 precision
    final protected int hashPrecision = 100000;

    public abstract boolean isAsRequiredBeforeSelectInCreateTable();

    public String getStddevPopulationFunctionName() {
        return "stddev_pop";
    }

    public String quoteName(String name) {
        String quoteString = getQuoteString();
        return quoteString + name + quoteString;
    }

    public String substituteTypeName(String type) {
        return type;
    }

    public String getGenericStringDataTypeName() {
        return "TEXT";
    }

    /**
     * The drivers returned by methods are loaded explicitly by JdbcConnection (when it makes a JDBC
     * connection to the backend database.) This mechanism is to support legacy library that does not
     * support automatic JDBC driver discovery.
     *
     * @return
     */
    public Collection<String> getCandidateJDBCDriverClassNames() {
        return Collections.emptyList();
    }

    public String getFallbackDefaultSchema() {
        throw new RuntimeException("This function must be implemented for each dbms syntax.");
    }

    /**
     * Hive, Impala, Spark, Redshift have approximate count distinct function
     *
     * @return
     */
    public String getApproximateCountDistinct(String column) {
        return String.format("count (distinct %s)", column);
    }

    public String getPrimaryKey(String schema, String table) {
        return null;
    }
}
