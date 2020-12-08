/*************************************************
 * Name: Joseph White  
 * Date: 10.08.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This is basically just a modified version
 * of the example that you gave to us. I'm not 
 * 100% sure what some of these BarChart objects are doing
 * so I just left your notes for the most part.
 * ************************************************
 */
	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.chart.BarChart;
	import javafx.scene.chart.CategoryAxis;
	import javafx.scene.chart.NumberAxis;
	import javafx.scene.chart.XYChart;
	import javafx.stage.Stage;


	public class ChartExample extends Application
	{

	    @Override 
	    public void start(Stage stage) {
	        
	        //Setting the title of the main window.
	        stage.setTitle("Bar Chart Sample");
	        
	        //Declaring the x-axis and y-axis attributes of the Bar Chart.
	        //Category axis being defined for x-axis baseline.
	        //Number axis being defined for y-axis baseline.
	        CategoryAxis xAxis = new CategoryAxis();
	        NumberAxis yAxis = new NumberAxis();
	        
	        //Declaring Bar Chart component with category x-axis of string
	        //and number y-axis being declared.
	        BarChart<String,Number> bc = 
	            new BarChart<String,Number>(xAxis,yAxis);
	            
	        //Setting chart title.
	        bc.setTitle("Frequency Counter");
	        
	        //Setting labels for x-axis and y-axis.
	        xAxis.setLabel("Alphabets");       
	        yAxis.setLabel("Frequency");
	        
	        //Always good to declare series. Easy to add more.
	        //adding the frequency counter series and attaching data
	        /*********************************************************
	         * filling the chart with data from my frequency program
	         * *******************************************************
	         */
	        XYChart.Series frequencyCounterSeries = new XYChart.Series();
	        frequencyCounterSeries.setName("Frequency Counter");       
	        frequencyCounterSeries.getData().add(new XYChart.Data("A", 985));
	        frequencyCounterSeries.getData().add(new XYChart.Data("B", 55));
	        frequencyCounterSeries.getData().add(new XYChart.Data("C", 1850));
	        frequencyCounterSeries.getData().add(new XYChart.Data("D", 970));
	        frequencyCounterSeries.getData().add(new XYChart.Data("E", 222));
	        frequencyCounterSeries.getData().add(new XYChart.Data("F", 329));
	        frequencyCounterSeries.getData().add(new XYChart.Data("G", 58));
	        frequencyCounterSeries.getData().add(new XYChart.Data("H", 2268));
	        frequencyCounterSeries.getData().add(new XYChart.Data("I", 1205));
	        frequencyCounterSeries.getData().add(new XYChart.Data("J", 3693));
	        frequencyCounterSeries.getData().add(new XYChart.Data("K", 1480));
	        frequencyCounterSeries.getData().add(new XYChart.Data("L", 569));
	        frequencyCounterSeries.getData().add(new XYChart.Data("M", 2148));
	        frequencyCounterSeries.getData().add(new XYChart.Data("N", 724));
	        frequencyCounterSeries.getData().add(new XYChart.Data("O", 1008));
	        frequencyCounterSeries.getData().add(new XYChart.Data("P", 567));
	        frequencyCounterSeries.getData().add(new XYChart.Data("Q", 1245));
	        frequencyCounterSeries.getData().add(new XYChart.Data("R", 571));
	        frequencyCounterSeries.getData().add(new XYChart.Data("S", 1767));
	        frequencyCounterSeries.getData().add(new XYChart.Data("T", 4889));
	        frequencyCounterSeries.getData().add(new XYChart.Data("U", 981));
	        frequencyCounterSeries.getData().add(new XYChart.Data("V", 559));
	        frequencyCounterSeries.getData().add(new XYChart.Data("W", 970));
	        frequencyCounterSeries.getData().add(new XYChart.Data("X", 30));
	        frequencyCounterSeries.getData().add(new XYChart.Data("Y", 1604));
	        frequencyCounterSeries.getData().add(new XYChart.Data("Z", 2272));
	        frequencyCounterSeries.getData().add(new XYChart.Data("a", 5571));
	        frequencyCounterSeries.getData().add(new XYChart.Data("b", 2246));
	        frequencyCounterSeries.getData().add(new XYChart.Data("c", 1777));
	        frequencyCounterSeries.getData().add(new XYChart.Data("d", 893));
	        frequencyCounterSeries.getData().add(new XYChart.Data("e", 129));
	        frequencyCounterSeries.getData().add(new XYChart.Data("f", 1771));
	        frequencyCounterSeries.getData().add(new XYChart.Data("g", 254));
	        frequencyCounterSeries.getData().add(new XYChart.Data("h", 8629));
	        frequencyCounterSeries.getData().add(new XYChart.Data("i", 721));
	        frequencyCounterSeries.getData().add(new XYChart.Data("j", 1650));
	        frequencyCounterSeries.getData().add(new XYChart.Data("k", 2895));
	        frequencyCounterSeries.getData().add(new XYChart.Data("l", 11844));
	        frequencyCounterSeries.getData().add(new XYChart.Data("m", 536));
	        frequencyCounterSeries.getData().add(new XYChart.Data("n", 1426));
	        frequencyCounterSeries.getData().add(new XYChart.Data("o", 2207));
	        frequencyCounterSeries.getData().add(new XYChart.Data("p", 6012));
	        frequencyCounterSeries.getData().add(new XYChart.Data("q", 26));
	        frequencyCounterSeries.getData().add(new XYChart.Data("r", 1076));
	        frequencyCounterSeries.getData().add(new XYChart.Data("s", 5486));
	        frequencyCounterSeries.getData().add(new XYChart.Data("t", 1634));
	        frequencyCounterSeries.getData().add(new XYChart.Data("u", 7331));
	        frequencyCounterSeries.getData().add(new XYChart.Data("v", 6734));
	        frequencyCounterSeries.getData().add(new XYChart.Data("w", 729));
	        frequencyCounterSeries.getData().add(new XYChart.Data("x", 27));
	        frequencyCounterSeries.getData().add(new XYChart.Data("y", 7711));
	        frequencyCounterSeries.getData().add(new XYChart.Data("z", 3577));
	        
	        //Setting up the scene to be attached to the window(stage)
	        //Linking bar chart component to the scene.
	        /*****************************************
	         * made the scene a bit bigger to cope with 
	         * the added letters and numbers
	         * ***************************************
	         */
	        Scene scene  = new Scene(bc,1000,800);

	        //Linking the data in the series with the bar chart component.
	        bc.getData().addAll(frequencyCounterSeries);
	        
	        //Pushing the scene to the window(stage)
	        stage.setScene(scene);
	        
	        //Asking the stage to display the scene linked to it.
	        stage.show();
	        
	    }
	    
	    /**
	     * 
	     */
	    public static void main(String[] args) {
	        launch(args);
	    }
	}
	    


