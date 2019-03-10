package org.dbest.commons;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

//import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Config { //implements AutoCloseable
    private final String PROPERTY_FILE="conf/dbest.properties";
    Configurations configurations = new Configurations();
    FileBasedConfigurationBuilder<PropertiesConfiguration> builder=configurations.propertiesBuilder(PROPERTY_FILE);
    private Configuration configs;

    public Config() {
        readProperties();
    }

    private void readProperties(){
//        Configurations configurations = new Configurations();
        try
        {
//            configs = configurations.properties(PROPERTY_FILE);
            configs = builder.getConfiguration();
            // access configuration properties
//            String warehouse=configs.getString("dbest.warehouse");
//            Logger logger = LogManager.getLogger(getClass());
//            logger.info(warehouse+ "from log4j v 2");

        }
        catch (ConfigurationException cex)
        {
            cex.printStackTrace();
        }
    }

    public void save(){
        try
        {
            builder.save();
        } catch (ConfigurationException cex)
        {
            // Something went wrong
            cex.printStackTrace();
        }
    }


    public Configuration getConfigs() {
        return configs;
    }
}
