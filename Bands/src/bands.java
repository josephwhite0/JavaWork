/*************************************************
 * Name: Joseph White 
 * Date: 09.07.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This program displays a GUI that lets you
 * enter information as a band submission form. There
 * are buttons that plays sample clips and checkboxes
 * to show days the band is available to play.
 * ************************************************
 */

import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.stage.Stage;

public class bands extends Application {

	/********************************
	 * Creating stage and setting up scene size.
	 * ******************************
	 */
	 public void start(Stage primaryStage)
	 {

	        Scene scene = new Scene(new bandPane(), 800, 800);
	 
	        primaryStage.setTitle("Band Audition");
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
