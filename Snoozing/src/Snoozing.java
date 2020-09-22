/*******************************************************
 * Name: Joseph White
 * Date: 08.27.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This program displays a GUI that you can input
 * your name, age, and how many hours of sleep you get a night
 * and calculates how many hours, days, and years you've slept
 * in your lifetime.
 *******************************************************
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Snoozing extends Application {

	/********************************
	 * Creating stage and setting up scene size.
	 * ******************************
	 */
	 public void start(Stage primaryStage)
	    {
	        Scene scene = new Scene(new sleepPane(), 900, 400);
	        
	        primaryStage.setTitle("Sleeping Too Much");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }
	 
	 /************************************
	  * Launching Main
	  * ***********************************
	  */
	 
	public static void main(String[] args) 
	{
		launch(args);
	}

}
