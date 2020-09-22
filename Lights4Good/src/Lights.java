/*************************************************
 * Name: Joseph White  
 * Date: 09.14.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This program creates a memory game using
 * colored buttons and tones.
 * ************************************************
 */

import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lights extends Application {

	/********************************
	 * Creating stage and setting up scene size.
	 * ******************************
	 */
	 public void start(Stage primaryStage)
	 {

	        Scene scene = new Scene(new buttons(), 600, 600);
	 
	        primaryStage.setTitle("Lights 4 Good");
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
