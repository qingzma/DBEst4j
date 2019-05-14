package org.dbest.core.regression;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.ml.Pipeline;
import org.apache.spark.ml.PipelineModel;
import org.apache.spark.ml.PipelineStage;
import org.apache.spark.ml.feature.VectorAssembler;
import org.apache.spark.ml.feature.VectorIndexer;
import org.apache.spark.ml.feature.VectorIndexerModel;
import org.apache.spark.ml.regression.GBTRegressor;
import org.apache.spark.sql.*;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecisionTreeRegression implements RegressionInterface {
    private static final long serialVersionUID= -36678851503942194L;

    private String table;
    private String independent;
    private String dependent;
    private SparkSession spark;
    private PipelineModel reg;


    //static parameters for predict()
    private static JavaSparkContext jsc;
    private static List<Double> doubleAsList;
    private static JavaRDD<Row> rowRDD;
    private static StructType schema = DataTypes.createStructType(new StructField[] { DataTypes.createStructField("feature", DataTypes.DoubleType, false) });
    private static String[] columnIndependent = new String[]{"feature"};
    private static VectorAssembler assemblerIndependent= new VectorAssembler().setInputCols(columnIndependent).setOutputCol("features");



    public DecisionTreeRegression(SparkSession spark) {
        this.spark=spark;
        this.jsc = new JavaSparkContext(this.spark.sparkContext());
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

        // Automatically identify categorical features, and index them.
        // Set maxCategories so features with > 4 distinct values are treated as continuous.
        VectorIndexerModel featureIndexer = new VectorIndexer()
                .setInputCol("features")
                .setOutputCol("indexedFeatures")
                .setMaxCategories(4)
                .fit(trainingData);



        // Train a GBT model.
        GBTRegressor gbt = new GBTRegressor()
                .setLabelCol("label")
                .setFeaturesCol("indexedFeatures")
                .setMaxIter(10);

        // Chain indexer and GBT in a Pipeline.
        Pipeline pipeline = new Pipeline().setStages(new PipelineStage[] {featureIndexer, gbt});

        // Train model. This also runs the indexer.
        PipelineModel model = pipeline.fit(trainingData);

        // Make predictions.
//        Dataset<Row> predictions = model.transform(testData);
//
//        // Select example rows to display.
//        predictions.select("prediction", "indexedFeatures").show(2);
//        System.out.println("Model is trained.");

        this.reg=model;


    }

    @Override
    public double predict(double[] point) {
        this.jsc = new JavaSparkContext(this.spark.sparkContext());
        this.doubleAsList = new ArrayList<>();

        this.doubleAsList.add(point[0]);

        this.rowRDD = this.jsc.parallelize(this.doubleAsList).map((Double row) -> RowFactory.create(row));

//        StructType schema = DataTypes.createStructType(new StructField[] { DataTypes.createStructField("feature", DataTypes.DoubleType, false) });

        Dataset<Row> pt = this.spark.sqlContext().createDataFrame(this.rowRDD,this.schema).toDF();
//        pt.show();

//        String[] columnIndependent = new String[]{"feature"};
//        VectorAssembler assemblerIndependent= new VectorAssembler().setInputCols(columnIndependent).setOutputCol("features");
        Dataset<Row> training=this.assemblerIndependent.transform(pt);

        VectorIndexerModel featureIndexer = new VectorIndexer()
                .setInputCol("features")
                .setOutputCol("indexedFeatures")
                .setMaxCategories(4)
                .fit(training);

        Dataset<Row> predictions = this.reg.transform(training);
//        System.out.println("-----------");
//        predictions.show();

        int index =(Integer)predictions.schema().getFieldIndex("prediction").get();
        double result = predictions.first().getDouble(index);


//        System.out.println(result);
        return result;
    }
}
