
import org.apache.spark.sql.SparkSession;
import org.dbest.DbestContext;
import org.dbest.commons.Config;
import org.dbest.connection.SparkQueryResult;
import org.dbest.core.density.SparkKernelDensity;
import org.dbest.core.regression.DecisionTreeRegression;
import org.dbest.core.regression.LinearRegression;
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
//        app.testConfiguration();

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
                .config("spark.jars", "/home/u1796377/Dropbox/Workspace/DBEst/target/dbest-core-0.0.2.jar")
                .enableHiveSupport()
                .getOrCreate();

//        spark.conf().set("spark.execution.memory","2g");
//        spark.conf().set("spark.executor.cores",2);
        spark.conf().set("spark.shuffle.blockTransferService", "nio");

//        spark.sql("drop schema tpcds cascade");
//        spark.sql("create schema tpcds");
//        spark.sql("drop table tpcds.store_sales_1g");
//        spark.sql("CREATE EXTERNAL TABLE tpcds.store_sales_1g ( ss_sold_date_sk           INT, ss_sold_time_sk           INT, ss_item_sk                INT, ss_customer_sk            INT, ss_cdemo_sk               INT, ss_hdemo_sk               INT, ss_addr_sk                INT, ss_store_sk               INT, ss_promo_sk               INT, ss_ticket_number          INT, ss_quantity               INT, ss_wholesale_cost         DECIMAL(7,2), ss_list_price             DECIMAL(7,2), ss_sales_price            DECIMAL(7,2), ss_ext_discount_amt       DECIMAL(7,2), ss_ext_sales_price        DECIMAL(7,2), ss_ext_wholesale_cost     DECIMAL(7,2), ss_ext_list_price         DECIMAL(7,2), ss_ext_tax                DECIMAL(7,2), ss_coupon_amt             DECIMAL(7,2), ss_net_paid               DECIMAL(7,2), ss_net_paid_inc_tax       DECIMAL(7,2), ss_net_profit             DECIMAL(7,2) ) ROW FORMAT DELIMITED FIELDS TERMINATED BY '|' LOCATION 'hdfs://137.205.118.65:9000/user/hive/warehouse/tpcds1G'");
//        spark.sql("CREATE EXTERNAL TABLE tpcds.store_sales_1k ( ss_sold_date_sk           INT, ss_sold_time_sk           INT, ss_item_sk                INT, ss_customer_sk            INT, ss_cdemo_sk               INT, ss_hdemo_sk               INT, ss_addr_sk                INT, ss_store_sk               INT, ss_promo_sk               INT, ss_ticket_number          INT, ss_quantity               INT, ss_wholesale_cost         DECIMAL(7,2), ss_list_price             DECIMAL(7,2), ss_sales_price            DECIMAL(7,2), ss_ext_discount_amt       DECIMAL(7,2), ss_ext_sales_price        DECIMAL(7,2), ss_ext_wholesale_cost     DECIMAL(7,2), ss_ext_list_price         DECIMAL(7,2), ss_ext_tax                DECIMAL(7,2), ss_coupon_amt             DECIMAL(7,2), ss_net_paid               DECIMAL(7,2), ss_net_paid_inc_tax       DECIMAL(7,2), ss_net_profit             DECIMAL(7,2) ) ROW FORMAT DELIMITED FIELDS TERMINATED BY '|' LOCATION 'hdfs://137.205.118.65:9000/user/hive/warehouse/tpcds1k'");


        SparkQueryResult result= new SparkQueryResult(spark.sql("show tables in tpcds"));
        result.printContent();
        result= new SparkQueryResult(spark.sql("select * from tpcds.store_sales_1g limit 5"));
        result.printContent();
//        result= new SparkQueryResult(spark.sql("describe tpcds.store_sales_1g "));
//        result.printContent();

        result= new SparkQueryResult(spark.sql("show create table tpcds.store_sales_1g "));
        result.printContent();


//        DbestOption option= new DbestOption();
//        option.setDbestConsoleLogLevel("trace");
//        DbestContext dbest = DbestContext.fromSparkSession(spark,option);


//        spark.sql("create schema tpcds");
//        spark.sql("CREATE EXTERNAL TABLE tpcds.store_sales_1g ( ss_sold_date_sk           INT, ss_sold_time_sk           INT, ss_item_sk                INT, ss_customer_sk            INT, ss_cdemo_sk               INT, ss_hdemo_sk               INT, ss_addr_sk                INT, ss_store_sk               INT, ss_promo_sk               INT, ss_ticket_number          INT, ss_quantity               INT, ss_wholesale_cost         DECIMAL(7,2), ss_list_price             DECIMAL(7,2), ss_sales_price            DECIMAL(7,2), ss_ext_discount_amt       DECIMAL(7,2), ss_ext_sales_price        DECIMAL(7,2), ss_ext_wholesale_cost     DECIMAL(7,2), ss_ext_list_price         DECIMAL(7,2), ss_ext_tax                DECIMAL(7,2), ss_coupon_amt             DECIMAL(7,2), ss_net_paid               DECIMAL(7,2), ss_net_paid_inc_tax       DECIMAL(7,2), ss_net_profit             DECIMAL(7,2) ) ROW FORMAT DELIMITED FIELDS TERMINATED BY '|' LOCATION 'hdfs://137.205.118.65:9000/user/hive/warehouse/tpcds1G'");
//        dbest.sql("create schema dbest");
//        dbest.sql("use dbest");


//        dbest.sql("CREATE model  dbest.modl1 from spark.tablex INDEPENDENT z DEPENDENT x,y METHOD uniform RATIO 0.5");
//        dbest.sql("CREATE model  dbest.modl2 from spark.tablex INDEPENDENT z DEPENDENT x,y METHOD uniform RATIO 0.5");
//        dbest.sql("CREATE model  dbest.modl3 from spark.tablex INDEPENDENT z DEPENDENT x,y METHOD uniform RATIO 0.5");
//        dbest.sql("show models in dbest");
//        dbest.sql("drop model modl2");
//        dbest.sql("show schemas");
////        dbest.sql("drop schema dbest");
//        spark.sql("create schema schemaTest");



//        SparkKernelDensity density= new SparkKernelDensity(spark);
//        density.fit("tpcds.store_sales_1k","ss_net_profit");

        DecisionTreeRegression reg= new DecisionTreeRegression(spark);
        reg.fit("tpcds.store_sales_1k","ss_net_profit","ss_list_price");
        reg.predict(new double[]{1.0});

//        LinearRegression reg1= new LinearRegression(spark);
//        reg1.fit("tpcds.store_sales_1k","ss_net_profit","ss_list_price");
    }





    public void testConfiguration(){
        Config conf= new Config();
//        conf.getConfigs().addProperty("haha","hahah");
//        conf.save();
    }

//    public void testDensity(){
//
//    }
}
