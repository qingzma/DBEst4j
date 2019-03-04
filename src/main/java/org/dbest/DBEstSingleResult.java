package org.dbest;

import org.dbest.commons.AttributeValueRetrievalHelper;
import org.dbest.commons.DBEstResultPrinter;
import org.dbest.commons.DBTablePrinter;
import org.dbest.commons.DataTypeConverter;
import org.dbest.connection.DbmsQueryResultMetaData;
import org.dbest.jdbc.DBEstResultSet;

import java.sql.SQLException;

public abstract class DBEstSingleResult extends AttributeValueRetrievalHelper {

    public abstract boolean isEmpty();

    /**
     * @return Meta Data from ResultSet
     */
    public abstract DbmsQueryResultMetaData getMetaData();

    public abstract int getColumnCount();

    /**
     * @param index zero-based index
     * @return
     */
    public abstract String getColumnName(int index);

    /**
     * @param index zero-based index
     * @return
     */
    public abstract int getColumnType(int index);

    public String getColumnTypeName(int index) {
        int typeInt = getColumnType(index);
        return DataTypeConverter.typeName(typeInt);
    }

    /**
     * @param index zero-based index
     * @return NOTE: This is to be used by pyverdict to get more robust column type names
     */
    public abstract String getColumnTypeNamePy(int index);

    /**
     * set the index before the first one; when next() is called, the index will move to the first
     * row.
     */
    public abstract void rewind();

    /**
     * Forward a cursor to rows by one. Similar to JDBC ResultSet.next().
     *
     * @return True if next row exists.
     */
    public abstract boolean next();

    /**
     * Returns the total number of rows.
     *
     * @return
     */
    public abstract long getRowCount();

    /**
     * @param index This is a zero-based index.
     * @return
     */
    public abstract Object getValue(int index);

    public abstract boolean wasNull() throws SQLException;

    public String toCsv() {
        return DBEstResultPrinter.SingleResultToCSV(this);
    }

    public void printCsv() {
        System.out.println(toCsv());
    }

    // Print in database form
    public void print() {
        DBEstResultSet vrs = new DBEstResultSet(this);
        DBTablePrinter.printResultSet(vrs);
    }
}
