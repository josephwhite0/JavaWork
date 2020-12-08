/*************************************************
 * Name: Joseph White   
 * Date: 10.29.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This program creates a GUI that populates
 * and handles an arraylist as well as allows you to
 * add and subtract elements of the arraylist.
 * ************************************************
 */

import java.io.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*****************************
 * Setting up the stage for the GUI
 * ***************************
 */
public class VolunteerDriver extends Application {

	public void start(Stage primaryStage)
	{
		Scene scene = new Scene(new GUI(), 900, 800);
		
		primaryStage.setTitle("Volunteer GUI");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		launch(args);
	}


}
