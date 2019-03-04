package org.dbest.commons;

public class DBEstStrings {
    public static final String METHOD_UNIFORM="uniform";
    public static final String METHOD_HASH="hash";

    public static final String EXCEPTION_METHOD="The sampling method must be uniform or hash, while it is set to %s.";
    public static final String EXCEPTION_RATIO="Sampling ratio is %f. It must be between 0 and 1.";
    public static final String EXCEPTION_NULL_VALUE="null value passed.";
    public static final String EXCEPTION_OBJECT_TYPE="unexpected object type passed: ";

    public static final String SQL_CREATE_SCHEMA="CREATE SCHEMA ";
    public static final String SQL_CREATE_MODEL="CREATE MODEL ";
    public static final String SQL_IF_NOT_EXISTS=" IF NOT EXISTS ";

    public static final String LOGGER_NAME="org.dbest";
    public static final String LOGGER_CONVERT_SQL_TO_STRING="Converting the following sql object to string: ";

    public static final String METASTORE_NAME="dbestmetastore";

}
