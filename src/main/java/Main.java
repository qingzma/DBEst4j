
import org.apache.spark.sql.SparkSession;
import org.dbest.DbestContext;
import org.dbest.commons.Config;
import org.dbest.exception.DbestException;
import org.dbest.metastore.DbestOption;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.SparkConf;
import scala.Tuple2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws DbestException {

////        System.out.println("DBEst");
//        SqlParser parser =  new SqlParser();
////        DBEstSQLParser result = SqlParser.parse("SELECT * from table");
////        System.out.println("DBEst");
//        parser.toCreateModelQuery("CREATE model  ss.modl from ha.tablex INDEPENDENT y DEPENDENT x,z METHOD uniform RATIO 0.5");// group by groups");
//        parser.toCreateModelQuery("CREATE model  ss.modl from ha.tablex INDEPENDENT y DEPENDENT x,z");// group by groups");
//        System.out.println(parser.getSql());
//
//        parser.toCreateModelQuery("CREATE model  ss.modl from ha.tablex INDEPENDENT y DEPENDENT x,z group by groups");
//        System.out.println(parser.getSql());
//
//        ExecutionContext executionContext = new ExecutionContext();
//        System.out.println(executionContext.identifyQueryType("CREATE model  ss.modl from ha.tablex INDEPENDENT y DEPENDENT x,z METHOD uniform RATIO 0.5"));
//        System.out.println(executionContext.identifyQueryType("SHOW MODELS"));


        Main app = new Main();
        app.testDbestContextHdfs();
        app.testConfiguration();

    }

    public void testSpark(){
        //Create a SparkContext to initialize
        SparkConf conf = new SparkConf().setMaster("local").setAppName("Word Count");

        // Create a Java version of the Spark Context
        JavaSparkContext sc = new JavaSparkContext(conf);

        // Load the text into a Spark RDD, which is a distributed representation of each line of text
        JavaRDD<String> textFile = sc.textFile("src/main/resources/shakespeare.txt");
        JavaPairRDD<String, Integer> counts = textFile
                .flatMap(s -> Arrays.asList(s.split("[ ,]")).iterator())
                .mapToPair(word -> new Tuple2<>(word, 1))
                .reduceByKey((a, b) -> a + b);
        counts.foreach(p -> System.out.println(p));
        System.out.println("Total words: " + counts.count());
        counts.saveAsTextFile("/tmp/shakespeareWordCount");

    }

    public void testDbestContextLocal() throws DbestException {
        SparkSession spark = SparkSession
                .builder()
                .appName("DBEst test")
                .master("local")
                .config("spark.sql.warehouse.dir","sparkwarehouse")
                .getOrCreate();
        spark.conf().set("spark.execution.memory","2g");
        spark.conf().set("spark.executor.cores",6);


        DbestOption option= new DbestOption();
        option.setDbestConsoleLogLevel("trace");
        DbestContext dbest = DbestContext.fromSparkSession(spark,option);
        dbest.sql("create schema  newschema");

    }

//    public void testDbestContextHdfs1() throws DbestException {
//        Config config = new Config();
//        SparkSession spark = SparkSession
//                .builder()
//                .appName("DBEst test")
//                .master(config.getConfigs().getString("spark.master"))
//                .config("spark.sql.warehouse.dir",config.getConfigs().getString("spark.warehouse"))
//                .enableHiveSupport()
//                .getOrCreate();
//        spark.conf().set("spark.execution.memory","2g");
//        spark.conf().set("spark.executor.cores",6);
//
//
//        DbestOption option= new DbestOption();
//        option.setDbestConsoleLogLevel("trace");
//        DbestContext dbest = DbestContext.fromSparkSession(spark,option);
//        dbest.sql("create schema newschema");
//
//    }

    public void testDbestContextHdfs() throws DbestException {
        Config config = new Config();
        SparkSession spark = SparkSession
                .builder()
                .appName("DBEst test")
                .master(config.getConfiguration().get("spark.master"))
                .config("spark.sql.warehouse.dir",config.getConfiguration().get("spark.warehouse"))
                .enableHiveSupport()
                .getOrCreate();
        spark.conf().set("spark.execution.memory","2g");
        spark.conf().set("spark.executor.cores",6);


        DbestOption option= new DbestOption();
        option.setDbestConsoleLogLevel("trace");
        DbestContext dbest = DbestContext.fromSparkSession(spark,option);
        dbest.sql("create schema dbest");
        dbest.sql("use dbest");


        dbest.sql("CREATE model  dbest.modl2 from spark.tablex INDEPENDENT z DEPENDENT x,y METHOD uniform RATIO 0.5");
        dbest.sql("show models in dbest");
        dbest.sql("drop model modl2");
        dbest.sql("show schemas");
//        dbest.sql("drop schema dbest");
    }


    public void testConfiguration(){
        Config conf= new Config();
//        conf.getConfigs().addProperty("haha","hahah");
//        conf.save();
    }
}
