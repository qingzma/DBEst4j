package org.dbest.core.density;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.mllib.stat.KernelDensity;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.math.*;

public class SparkKernelDensity implements DensityInterface {
    private static final long serialVersionUID= -3468504136947416092L;
    private KernelDensity kd=null;
    private double bandWidth=1.0;
    private SparkSession spark;

    public SparkKernelDensity(SparkSession spark) {
        this.spark=spark;
        this.bandWidth=1.0;
    }

    public SparkKernelDensity(SparkSession spark, double bandWidth) {
        this.spark=spark;
        this.bandWidth=bandWidth;
    }

    @Override
    public void fit(String file,String delimiter,String y,String x) {
        Dataset<Row> df = spark.read()
                .format("csv")
                .option("header", "false")
                .option("delimiter", delimiter)
                .load(file);
//        df.withColumn(y,df.col(y).cast("double"));
        df.withColumn(x,df.col(x).cast("double"));
//        JavaRDD<Row> rdd = df.javaRDD();
        JavaSparkContext jsc = new JavaSparkContext(spark.sparkContext());
        System.out.println(df.select(x));
//        List<Double> collection = Arrays.asList(df.select(x).collect());//Arrays.asList(1.0, 1.0, 1.0, 2.0, 3.0, 4.0, 5.0, 5.0, 6.0, 7.0, 8.0, 9.0, 9.0);
//        JavaRDD<Double> data = jsc.parallelize(collection);
//        fit(data);
//        df.show();
    }

    @Override
    public void fit(JavaRDD<Double> javaRDD) {
        this.kd=new KernelDensity().setSample(javaRDD).setBandwidth(this.bandWidth);
    }

    public void fit(String table, String column){
//        JavaSparkContext jsc = new JavaSparkContext(spark.sparkContext());
//        // an RDD of sample data
//        JavaRDD<Double> data = jsc.parallelize(
//                Arrays.asList(1.0, 1.0, 1.0, 2.0, 3.0, 4.0, 5.0, 5.0, 6.0, 7.0, 8.0, 9.0, 9.0));
//
//// Construct the density estimator with the sample data
//// and a standard deviation for the Gaussian kernels
//        KernelDensity kd = new KernelDensity().setSample(data).setBandwidth(3.0);
//
//// Find density estimates for the given values
//        double[] densities = kd.estimate(new double[]{-1.0, 2.0, 5.0});
//
//        System.out.println(Arrays.toString(densities));

        Dataset<Row> data1 = this.spark.sql(" select " + column +" from " + table).filter(column +" IS NOT NULL");

        List<Row> points = data1.collectAsList();
        List<Double> ps=new ArrayList<>();
//        System.out.println(points);

        for (Row row:points){
//            System.out.println(row);
//            System.out.println(((BigDecimal)row.get(0)).doubleValue());
            ps.add(((BigDecimal)row.get(0)).doubleValue());
        }
        System.out.println(ps);

        JavaSparkContext jsc = new JavaSparkContext(spark.sparkContext());
        JavaRDD<Double> data = jsc.parallelize(ps);
        System.out.println(data.toString());

//        Dataset<Double> dataD = data1.map(d->d.getDouble(0), Encoders.DOUBLE());
//        dataD.show();
//        JavaRDD<Double> dens = dataD.javaRDD();

        fit(data);
        System.out.println(this.kd.estimate(new double[]{-161.0,-90.0})[0]);
    }

    @Override
    public double predict(double[] point) {
        return 0;
    }

    @Override
    public double[] predicts(List<Double[]> points) {
        return new double[0];
    }
}
