package org.dbest.commons;
import com.rits.cloning.Cloner;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DBEstOption {
    private String dbestMetaSchemaName = DBEstStrings.DRIVER_DEFAULT_META_SCHEMA_NAME;
    private String dbestTempSchemaName = DBEstStrings.DRIVER_DEFAULT_TMP_SCHEMA_NAME;
    private String dbestConsoleLogLevel = DBEstStrings.LOGGER_DEFAULT_CONSOLE_LOG_LEVEL;
    private String dbestFileLogLevel = DBEstStrings.LOGGER_DEFAULT_FILE_LOG_LEVEL;

    public DBEstOption(){}




    /**
     * Performs a deepcopy of current object
     *
     * @return a deepcopy of the current object
     */
    public DBEstOption copy() {
        return new Cloner().deepClone(this);
    }


    public String getDbestMetaSchemaName() {
        return dbestMetaSchemaName;
    }

    public void setDbestMetaSchemaName(String dbestMetaSchemaName) {
        this.dbestMetaSchemaName = dbestMetaSchemaName;
    }

    public String getDbestTempSchemaName() {
        return dbestTempSchemaName;
    }

    public void setDbestTempSchemaName(String dbestTempSchemaName) {
        this.dbestTempSchemaName = dbestTempSchemaName;
    }

    public String getDbestConsoleLogLevel() {
        return dbestConsoleLogLevel;
    }

    public void setDbestConsoleLogLevel(String dbestConsoleLogLevel) {
        this.dbestConsoleLogLevel = dbestConsoleLogLevel;
        DBEstLogger.setConsoleLogLevel(dbestConsoleLogLevel);
    }

    public String getDbestFileLogLevel() {
        return dbestFileLogLevel;
    }

    public void setDbestFileLogLevel(String dbestFileLogLevel) {
        this.dbestFileLogLevel = dbestFileLogLevel;
        DBEstLogger.setFileLogLevel(dbestFileLogLevel);
    }

    public void parseConnectionString(String str) {
        String[] tokens = str.split("[&;?]");
        String pattern = "\\w+=\\w+";
        Pattern p = Pattern.compile(pattern);
        for (String token : tokens) {
            Matcher m = p.matcher(token);
            if (m.matches()) {
                String[] option = token.split("=");
                switch (option[0].toLowerCase()) {
                    case DBEstStrings.DRIVER_DEFAULT_META_SCHEMA_NAME:
                        this.setDbestMetaSchemaName(option[1]);
                        break;
                    case DBEstStrings.DRIVER_DEFAULT_TMP_SCHEMA_NAME:
                        this.setDbestTempSchemaName(option[1]);
                        break;
                    case "loglevel":
                        this.setDbestConsoleLogLevel(option[1]);
                        break;
                    case "file_loglevel":
                        this.setDbestFileLogLevel(option[1]);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public void parseProperties(Properties prop) {
        // Get properties here
        String newDBEstMetaSchemaName = prop.getProperty(DBEstStrings.DRIVER_DEFAULT_META_SCHEMA_NAME);
        String newDBEstTempSchemaName = prop.getProperty(DBEstStrings.DRIVER_DEFAULT_TMP_SCHEMA_NAME);

        // Set them if properties exist
        if (newDBEstMetaSchemaName != null) dbestMetaSchemaName = newDBEstMetaSchemaName;
        if (newDBEstTempSchemaName != null) dbestTempSchemaName = newDBEstTempSchemaName;
    }

}
