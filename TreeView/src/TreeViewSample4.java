 /*******************************************************
 * Name: Joseph White 
 * Date: 11.17.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: Program that creates a tree using and array
 * of Customer class
 *******************************************************
 */

import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
 
public class TreeViewSample4 extends Application {

    //--------------------------------------------------------------------
    // This is setting up the primaryStage in JavaFX
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {   //--------------------------------------------------------------------
		//  This creates a new scene and uses TreePane4(). It sets the size to
    	// 400 x 800 and sets the fill color to light gray. Title is set to 
    	// "Tree View Sample4" and will be displayed at the top of the Pane
		//--------------------------------------------------------------------
        Scene scene = new Scene(new TreePane4(), 400,800);
		scene.setFill(Color.LIGHTGRAY);
        primaryStage.setTitle("Tree View Sample4");        

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {	//--------------------------------------------------------------------
		//  Launches the application
		//--------------------------------------------------------------------
	   
       launch(args);
    }
}
