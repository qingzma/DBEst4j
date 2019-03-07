package org.dbest.commons;

import java.text.SimpleDateFormat;
import java.util.Date;

/** Created by Dong Young Yoon on 10/12/18.
 * Note: MySQL stores the seconds only up to the first decimal point. Thus, if multiple entries
 *       are inserted with difference smaller than 100 ms, the database cannot differentiate them.
 */
public class DBEstTimestamp {

    private static final String TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
    private Date date;

    public DBEstTimestamp(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return new SimpleDateFormat(TIMESTAMP_FORMAT).format(date);
    }
}