package org.dbest.metastore;

import com.rits.cloning.Cloner;
import org.dbest.commons.DbestStrings;

import java.util.Properties;

public class DbestOption {
    private String dbestMetaSchemaName="dbestmetaschema";
    private String dbestTempSchemaName= DbestStrings.DEFAULT_MODEL_SCHEMA;
    private String dbestConsoleLogLevel="debug";    //info
    private String dbestFileLogLevel="debug";
    private String dbestTempModelPredix="tempmodel";
    private String fileSystem;

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
    }

    public String getDbestFileLogLevel() {
        return dbestFileLogLevel;
    }

    public void setDbestFileLogLevel(String dbestFileLogLevel) {
        this.dbestFileLogLevel = dbestFileLogLevel;
    }

    public DbestOption copy(){
        return new Cloner().deepClone(this);
    }

    public void parseProperties(Properties properties){
        String newConsoleLogLevel= properties.getProperty("consoleloglevel");
        String newFileLogLevel= properties.getProperty("fileloglevel");
        String newDbestMetaSchemaName= properties.getProperty("metaschema");
        String newDbestTempSchemaName= properties.getProperty("tempschema");

        //set them if properties exist
        if (newConsoleLogLevel != null){setDbestConsoleLogLevel(newConsoleLogLevel);}
        if (newFileLogLevel != null){setDbestFileLogLevel(newFileLogLevel);}
        if (newDbestMetaSchemaName != null) {setDbestMetaSchemaName(newDbestMetaSchemaName);}
        if (newDbestTempSchemaName != null) {setDbestTempSchemaName(newDbestTempSchemaName);}
    }

    public String getDbestTempModelPredix() {
        return dbestTempModelPredix;
    }
}
