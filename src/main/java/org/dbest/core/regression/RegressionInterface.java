package org.dbest.core.regression;

import java.io.Serializable;

public interface RegressionInterface extends Serializable {
    public void fit();
    public double predict(double[] point);
}
