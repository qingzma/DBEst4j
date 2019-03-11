package org.dbest.commons.io;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dbest.commons.Config;


import java.io.IOException;

public class DbestFileSystem {
    private static Config config = new Config();
    private Logger log = LogManager.getLogger(getClass());
    private static FileSystem fileSystem;
    private static final String dbestWarehouse=config.getConfiguration().get("dbest.warehouse");;

    public DbestFileSystem() {
        try{
            fileSystem  = FileSystem.get(config.getConfiguration());

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void mkdir(String dir){
        String dirName = getWarehouseDir()+"/"+dir;
        try{
            if (fileSystem.exists(new Path(dirName))){
            }else{
                fileSystem.mkdirs(new Path(dirName));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void createSchema(String schema){
        String dirName = getWarehouseDir()+"/"+schema;
        try{
            if (fileSystem.exists(new Path(dirName))){
                log.warn("Schema "+schema +" already exists! abort.");
            }else{
                fileSystem.mkdirs(new Path(dirName));
                log.trace("Created Schema "+schema);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void dropSchema(String schema){
        String dirName = getWarehouseDir()+"/"+schema;
//        log.warn(dirName);
        try{
            if (!fileSystem.exists(new Path(dirName))){
                log.warn("Schema "+schema +" does not exist! please check your SQL.");
            }else{
                fileSystem.delete(new Path(dirName),true);
                log.trace("Dropped Schema "+schema);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public  void initialize(){
        try{

            if (fileSystem.exists(new Path(dbestWarehouse))){
                log.warn("DBEst warehouse already exists! so keep it as it is.");
                setWorkingDirecotry(dbestWarehouse);
            } else{
                fileSystem  = FileSystem.get(config.getConfiguration());
                fileSystem.mkdirs(new Path(dbestWarehouse));
                log.info("DBEst warehouse is created.");
                setWorkingDirecotry(dbestWarehouse);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public String getWorkingDirecotry() {
        return fileSystem.getWorkingDirectory().toString();
    }

    public void setWorkingDirecotry(String currentWorkingDirecotry) {
        this.fileSystem.setWorkingDirectory(new Path(currentWorkingDirecotry));
    }

    public String getWarehouseDir(){
        return dbestWarehouse;
    }
}
