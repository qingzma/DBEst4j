package org.dbest.commons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public static final String LOGGER_DEFAULT_CONSOLE_LOG_LEVEL="info";
    public static final String LOGGER_DEFAULT_FILE_LOG_LEVEL="debug";


    public static final String DRIVER_NAME="dbest";
    public static final String DRIVER_NAME_MORE="dbestdb";
    public static final String METASTORE_NAME="dbestmetastore";
    public static final String DRIVER_DEFAULT_META_SCHEMA_NAME="metaschema";
    public static final String DRIVER_DEFAULT_TMP_SCHEMA_NAME="tmpschema";
    public static final String DRIVER_DEFAULT_ORIGINAL_SCHEMA="original_schema";
    public static final String DRIVER_DEFAULT_ORIGINAL_TABLE="original_table";
    public static final String DRIVER_DEFAULT_MODEL_SCHEMA="model_schema";
    public static final String DRIVER_DEFAULT_MODEL_TABLE="model_table";
    public static final String DRIVER_DEFAULT_INDEPENDENT="independent";
    public static final List<String> DRIVER_DEFAULT_DEPENDENTS= Arrays.asList("dependents");
    public static final String DRIVER_DEFAULT_SAMPLING_METHOD="model_sampling_method";
}
