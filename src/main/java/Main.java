
import org.apache.spark.sql.SparkSession;
import org.dbest.DbestContext;
import org.dbest.coordinator.ExecutionContext;
import org.dbest.exception.DbestException;
import org.dbest.sqlparser.SqlParser;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.SparkConf;
import scala.Tuple2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws DbestException {

//        System.out.println("DBEst");
        SqlParser parser =  new SqlParser();
//        DBEstSQLParser result = SqlParser.parse("SELECT * from table");
//        System.out.println("DBEst");
        parser.toCreateModelQuery("CREATE model  ss.modl from ha.tablex INDEPENDENT y DEPENDENT x,z METHOD uniform RATIO 0.5");// group by groups");
        parser.toCreateModelQuery("CREATE model  ss.modl from ha.tablex INDEPENDENT y DEPENDENT x,z");// group by groups");
        System.out.println(parser.getSql());

        parser.toCreateModelQuery("CREATE model  ss.modl from ha.tablex INDEPENDENT y DEPENDENT x,z group by groups");
        System.out.println(parser.getSql());

        ExecutionContext executionContext = new ExecutionContext();
        System.out.println(executionContext.identifyQueryType("CREATE model  ss.modl from ha.tablex INDEPENDENT y DEPENDENT x,z METHOD uniform RATIO 0.5"));
        System.out.println(executionContext.identifyQueryType("SHOW MODELS"));


        Main app = new Main();
        app.testDbestContext();

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

    public void testDbestContext() throws DbestException {
        SparkSession spark = SparkSession
                .builder()
                .appName("DBEst test")
                .master("local")
                .config("spark.sql.warehouse.dir","sparkwarehouse")
                .getOrCreate();
        spark.conf().set("spark.execution.memory","2g");
        spark.conf().set("spark.executor.cores",6);

        DbestContext dbest = DbestContext.fromSparkSession(spark);

    }
}
