package org.dbest.core.density;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.mllib.stat.KernelDensity;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

import java.util.List;

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
        df.withColumn(y,df.col(y).cast("double"));
        df.withColumn(x,df.col(x).cast("double"));
//        JavaRDD<Double> rdd = new JavaRDD<Double>();



        df.show();
    }

    @Override
    public void fit(JavaRDD<Double> javaRDD) {
        this.kd=new KernelDensity().setSample(javaRDD).setBandwidth(this.bandWidth);
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
