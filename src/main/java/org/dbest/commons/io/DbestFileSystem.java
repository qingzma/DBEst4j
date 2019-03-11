package org.dbest.commons.io;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.LocatedFileStatus;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RemoteIterator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dbest.commons.Config;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DbestFileSystem {
    private static Config config = new Config();
    private Logger log = LogManager.getLogger(getClass());
    private static FileSystem fileSystem;
    private static final String dbestWarehouse=config.getConfiguration().get("dbest.warehouse");
    private static String workingSchema;
    private static String workingDir;

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


    public void createModelDir(String model){
        String dirName = getWorkingDirecotry()+"/"+model;
//        log.warn(dirName+" __________________________");
        try{
            if (fileSystem.exists(new Path(dirName))){
                log.warn("Model "+model +" already exists! abort.");
            }else{
                fileSystem.mkdirs(new Path(dirName));
                log.trace("Created Model "+model);
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

    public void showModels(String schema){
        String dirName = getWarehouseDir()+"/"+schema;

        try{
            if (!fileSystem.exists(new Path(dirName))){
                log.warn("Schema "+schema +" does not exist! please check your SQL.");
            }else{
                org.apache.hadoop.fs.RemoteIterator<LocatedFileStatus> tables= fileSystem.listLocatedStatus(new Path(dirName));
//                log.warn(tables.toString());
                log.trace("Show tables in Schema "+schema);
                List<String> names= new ArrayList<>();
                while(tables.hasNext()){
                    LocatedFileStatus model = tables.next();
                    String name = model.getPath().toString().replace(dirName,"").substring(1);
                    if (!name.contains("/")){
                        names.add(name);
                    }
                }
                String models= names.toString();
                log.info(models);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void showSchemas(){
        String dirName = getWarehouseDir();
//        log.info(dirName);
        try{
            org.apache.hadoop.fs.RemoteIterator<LocatedFileStatus> schemas= fileSystem.listLocatedStatus(new Path(dirName));
//            log.warn(schemas.toString());
            log.trace("Show Schemas");
            List<String> names= new ArrayList<>();
            while(schemas.hasNext()){
                LocatedFileStatus schema = schemas.next();
                String name = schema.getPath().toString().replace(dirName,"").substring(1);
                if (!name.contains("/")){
                    names.add(name);
                }
            }
            String models= names.toString();
            log.info(models);

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void dropModel(String schema, String model){
        String dirName = getWarehouseDir()+"/"+schema+"/"+model;
//        log.warn(dirName);
        try{
            if (!fileSystem.exists(new Path(dirName))){
                log.warn("Model "+schema +"."+ model +" does not exist! please check your SQL.");
            }else{
                fileSystem.delete(new Path(dirName),true);
                log.trace("Dropped Model "+schema+"."+model);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void dropModel(String model){
        String schema=getWorkingSchema();
        dropModel(schema,model);
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

    public void useSchema(String schema){
        try{
            String schemaDir = dbestWarehouse+"/"+schema;
            if (fileSystem.exists(new Path(schemaDir))){
                this.workingSchema=schema;
                setWorkingDirecotry(schemaDir);
            }
            else{
                log.warn("Schema "+schema+" does not exists, please check your SQL.");
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }


    public String getWorkingDirecotry() {
        return this.workingDir;
//        return fileSystem.getWorkingDirectory().toString();
    }

    public void setWorkingDirecotry(String currentWorkingDirecotry) {
//        this.fileSystem.setWorkingDirectory(new Path(currentWorkingDirecotry));
        workingDir = currentWorkingDirecotry;
    }

    public String getWarehouseDir(){
        return dbestWarehouse;
    }

    public static String getWorkingSchema() {
        return workingSchema;
    }

    public static void setWorkingSchema(String workingSchema) {
        DbestFileSystem.workingSchema = workingSchema;
    }

    public void close() {
        try{
            fileSystem.close();
        } catch (IOException e){
            log.warn(e.getMessage());
        }

    }
}
