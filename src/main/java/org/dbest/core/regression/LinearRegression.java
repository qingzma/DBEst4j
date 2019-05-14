package org.dbest.core.regression;

import org.apache.spark.ml.Pipeline;
import org.apache.spark.ml.PipelineModel;
import org.apache.spark.ml.PipelineStage;
import org.apache.spark.ml.feature.VectorIndexer;
import org.apache.spark.ml.feature.VectorIndexerModel;
import org.apache.spark.ml.regression.GBTRegressor;
//import org.apache.spark.ml.regression.LinearRegression;
import org.apache.spark.ml.regression.LinearRegressionModel;
import org.apache.spark.ml.feature.VectorAssembler;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.ml.linalg.Vector;

public class LinearRegression implements RegressionInterface {
    private static final long serialVersionUID= 4065094453064317158L;

    private String table;
    private String independent;
    private String dependent;
    private SparkSession spark;
    private LinearRegressionModel reg;

    public LinearRegression(SparkSession spark) {
        this.spark=spark;
    }

    @Override
    public void fit(){}


    public void fit(String table, String independent, String dependent) {
        this.table = table;
        this.independent = independent;
        this.dependent = dependent;
        Dataset<Row> data = this.spark.sql(" select " + independent +", "+dependent +" from " + table)
                .filter(independent +" IS NOT NULL")
                .filter(dependent +" IS NOT NULL");

        //rename the dependent column to be "label"
        data=data.toDF(independent,"label").as("data");



        //convert the independet column to be type of VectorUDT
        //see the link for more information. https://stackoverflow.com/questions/44844793/why-does-logisticregression-fail-with-illegalargumentexception-org-apache-spar
        String[] columnIndependent = new String[]{independent};
        VectorAssembler assemblerIndependent= new VectorAssembler().setInputCols(columnIndependent).setOutputCol("features");

        Dataset<Row> training=assemblerIndependent.transform(data);


        // Split the data into training and test sets (30% held out for testing).
        Dataset<Row>[] splits = training.randomSplit(new double[] {0.99, 0.01});
        Dataset<Row> trainingData = splits[0];
        Dataset<Row> testData = splits[1];

        org.apache.spark.ml.regression.LinearRegression lr = new org.apache.spark.ml.regression.LinearRegression()
                .setMaxIter(10)
                .setRegParam(0.3)
                .setElasticNetParam(0.8);

        // Fit the model.
        LinearRegressionModel lrModel = lr.fit(trainingData);

        // Print the coefficients and intercept for linear regression.
        System.out.println("Coefficients: "
                + lrModel.coefficients() + " Intercept: " + lrModel.intercept());

//        // Make predictions.
//        Dataset<Row> predictions = model.transform(testData);
//
//        // Select example rows to display.
//        predictions.select("prediction", dependent, independent).show(2);
        this.reg=lrModel;


    }

    @Override
    public double predict(double[] point) {
        return this.reg.predict(null);
    }
}
