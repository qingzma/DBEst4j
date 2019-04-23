package org.dbest.core.density;

import java.io.Serializable;
import java.util.List;
import org.apache.spark.api.java.JavaRDD;

public interface DensityInterface extends Serializable {
     public void fit(String file,String delimiter,String y,String x);
     public void fit(JavaRDD<Double> javaRDD);
     public double predict(double[] point);
     public double[] predicts(List<Double[]> points);
}
