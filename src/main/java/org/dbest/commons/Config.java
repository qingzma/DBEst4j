package org.dbest.commons;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Config{
    private static final String PROPERTY_FILE="conf/dbest.xml";
    private Logger log = LogManager.getLogger(getClass());

    private static Boolean ifHdfs=null;

    private static Configuration configuration;

    private static String sparkWarehouseDir;

    public Config() {
        configuration = new Configuration();
        configuration.addResource(new Path("conf/dbest.xml"));
//        log.error(configuration.get("spark.warehouse"));

        if (ifHdfs ==null){
            String sparkWarehouse=configuration.get("spark.warehouse");
            if (sparkWarehouse.toLowerCase().startsWith("hdfs")){
                ifHdfs=true;
                log.debug("File System is HDFS.");

                sparkWarehouse = sparkWarehouse.split("//")[1];
                int startIndex = sparkWarehouse.indexOf('/');
                sparkWarehouseDir=sparkWarehouse.substring(startIndex);
//                log.error(sparkWarehouseDir +"---------------------------");
            }
            else{
                ifHdfs=false;
                log.debug("File System is local.");
            }
        }
    }

    public static Configuration getConfiguration() {
        return configuration;
    }

    public static Boolean isIfHdfs() {
        return ifHdfs;
    }

    public static String getSparkWarehouseDir() {
        return sparkWarehouseDir;
    }
}



//import org.apache.commons.configuration2.Configuration;
//import org.apache.commons.configuration2.FileBasedConfiguration;
//import org.apache.commons.configuration2.PropertiesConfiguration;
//import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
//import org.apache.commons.configuration2.builder.fluent.Configurations;
//import org.apache.commons.configuration2.ex.ConfigurationException;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;


//public class Config { //implements AutoCloseable
//    private final String PROPERTY_FILE="conf/dbest.properties";
//    Configurations configurations = new Configurations();
//    FileBasedConfigurationBuilder<PropertiesConfiguration> builder=configurations.propertiesBuilder(PROPERTY_FILE);
//    private Configuration configs;
//    private Logger log = LogManager.getLogger(getClass());
//
//    private static Boolean ifHdfs=null;
//
//    public Config() {
//        readProperties();
//
//        if (ifHdfs ==null){
//            String sparkWarehouse=configs.getString("spark.warehouse");
//            if (sparkWarehouse.toLowerCase().startsWith("hdfs")){
//                ifHdfs=true;
//                log.debug("File System is HDFS.");
//            }
//            else{
//                ifHdfs=false;
//                log.debug("File System is local.");
//            }
//        }
//
//
//    }
//
//    private void readProperties(){
////        Configurations configurations = new Configurations();
//        try
//        {
////            configs = configurations.properties(PROPERTY_FILE);
//            configs = builder.getConfiguration();
//            // access configuration properties
////            String warehouse=configs.getString("dbest.warehouse");
////            Logger logger = LogManager.getLogger(getClass());
////            logger.info(warehouse+ "from log4j v 2");
//
//        }
//        catch (ConfigurationException cex)
//        {
//            cex.printStackTrace();
//        }
//    }
//
//    public void save(){
//        try
//        {
//            builder.save();
//        } catch (ConfigurationException cex)
//        {
//            // Something went wrong
//            cex.printStackTrace();
//        }
//    }
//
//
//    public Configuration getConfigs() {
//        return configs;
//    }
//
//    public boolean isIfHdfs() {
//        return ifHdfs;
//    }
//}
