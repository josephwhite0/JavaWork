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

import java.io.File; 
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class bandPane extends GridPane {
	
	/*******************************************************
	 * Assigning variables
	 * *****************************************************
	 */
	private TextField nameBand;
	private TextField bWeb;
	private TextField cName;
	private TextField cPhone;
	private Button submit;
	private Button clear;
	private Button exit;
	private CheckBox box1;
	private CheckBox box2;
	private CheckBox box3;
	private RadioButton sample1;
	private RadioButton sample2;
	private AudioClip clip1;
	private AudioClip clip2;

	
	public bandPane()
	{
		/********************************************************
		 * Creating the music clips using AudioClip object
		 * ******************************************************
		 */
		
		String musicfile1 = "src/clip1.wav";
		String musicfile2 = "src/clip2.wav";
        clip1 = new AudioClip(new File(musicfile1).toURI().toString());
        clip2 = new AudioClip(new File(musicfile2).toURI().toString());
        clip1.setVolume(0.5);
        clip2.setVolume(0.5);
    
        /***********************************************************
         * Creating image using Image object
         * *********************************************************
         */
    File file = new File("src/guitar.png");
    Image image = new Image(file.toURI().toString());
    ImageView imageView = new ImageView(image);

	
    /****************************************************************
     * Creating Labels for pane. Also setting font and alignment
     * **************************************************************
     */
	Label bandName = new Label();
	bandName.setText("Name of Band:");
	bandName.setFont(Font.font("Comic sans MS", FontWeight.BOLD, 25));
	GridPane.setHalignment(bandName, HPos.LEFT);

	
	Label bandWeb = new Label();
	bandWeb.setText("Band Website or Facebook Page:");
	bandWeb.setFont(Font.font("Comic sans MS", FontWeight.BOLD, 25));
	GridPane.setHalignment(bandWeb, HPos.LEFT);
	
	Label sampleOfClip = new Label();
	sampleOfClip.setText("Sample sound clips of songs:");
	sampleOfClip.setFont(Font.font("Comic sans MS", FontWeight.BOLD, 25));
	GridPane.setHalignment(sampleOfClip, HPos.LEFT);
	
	Label daysOfWeekAvail = new Label();
	daysOfWeekAvail.setText("Days of week you are typically available for playing (check all that apply):");
	daysOfWeekAvail.setFont(Font.font("Comic sans MS", FontWeight.BOLD, 15));
	GridPane.setHalignment(daysOfWeekAvail, HPos.LEFT);
	
	Label contactName = new Label();
	contactName.setText ("Contact Name:");
	contactName.setFont(Font.font("Comic sans MS", FontWeight.BOLD, 25));
	GridPane.setHalignment(contactName, HPos.LEFT);
	
	Label contactPhone = new Label();
	contactPhone.setText("Contact Phone:");
	contactPhone.setFont(Font.font("Comic sans MS", FontWeight.BOLD, 25));	
	GridPane.setHalignment(contactPhone, HPos.LEFT);
	
	/**************************************************************
	 * Creating TextFields to fill variables
	 * ************************************************************
	 */
	nameBand = new TextField();
	nameBand.setPrefWidth(50);
	GridPane.setHalignment(nameBand, HPos.CENTER);
	
	bWeb = new TextField();
	bWeb.setPrefWidth(50);
	bWeb.setAlignment(Pos.CENTER);
	
	cName = new TextField();
	cName.setPrefWidth(50);
	cName.setAlignment(Pos.CENTER);
	
	cPhone = new TextField();
	cPhone.setPrefWidth(50);
	cPhone.setAlignment(Pos.CENTER);
	
	/******************************************************************
	 * Creating Buttons
	 * ****************************************************************
	 */
	submit = new Button ("Submit");
	submit.setOnAction(this::processButtons);
	GridPane.setHalignment(submit, HPos.CENTER);
	
	clear = new Button ("Clear");
	clear.setOnAction(this::processButtons);
	GridPane.setHalignment(clear, HPos.CENTER);
	
	exit = new Button ("Exit");
	exit.setOnAction(this::processButtons);
	GridPane.setHalignment(exit, HPos.CENTER);
	
	/*******************************************************************
	 * Creating RadioButtons and assigning them to a ToggleGroup
	 * *****************************************************************
	 */
	sample1 = new RadioButton("Sample 1");
	sample2 = new RadioButton("Sample 2");
	
	ToggleGroup radioGroup = new ToggleGroup();
	
	sample1.setToggleGroup(radioGroup);
	sample2.setToggleGroup(radioGroup);
	
	/***************************************************************
	 * Creating Checkboxs
	 * *************************************************************
	 */
	
	box1 = new CheckBox("Tuesday");
	box1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));
	box2 = new CheckBox("Friday");
	box2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));
	box3 = new CheckBox("Saturday");
	box3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 15));
	
	
	/***************************************************************
	 * Creating setOnAction so that the AudioClip will play when RadioButton
	 * is active and turn off when the opposite RadioButton is selected
	 * *************************************************************
	 */
	sample1.setOnAction(event->
	{
		
		if(radioGroup.getSelectedToggle() == sample1)
		{
			clip1.play();
			clip2.stop();
		}
		
	});
	
	sample2.setOnAction(event ->
	{
		if(sample2.isSelected())
		{
			clip2.play();
			clip1.stop();
		}
	});
	
	/************************************************************
	 * Adding nodes to the GridPane
	 * ***********************************************************
	 */
	
	setAlignment(Pos.BASELINE_LEFT);
	setHgap(20);
	setVgap(10);
	
	add (imageView, 1, 0, 1, 1);
	add (bandName, 0, 1, 1, 1);
	add (nameBand, 1, 1, 1, 1);
	add (bandWeb, 0, 4, 2, 1);
	add (bWeb, 2, 4, 4, 1);
	add(sampleOfClip, 0, 7, 2, 1);
	add (sample1, 0, 8, 1, 1);
	add (sample2, 0, 9, 1, 1);
	add (daysOfWeekAvail, 0, 12, 3, 1);
	add (box1, 0, 14, 1, 1);
	add (box2, 0, 15, 1, 1);
	add (box3, 0, 16, 1, 1);
	add (contactName, 0, 20, 1, 1);
	add (cName, 1, 20, 1, 1);
	add (contactPhone, 0, 24, 1, 1);
	add (cPhone, 1, 24, 1, 1);
	add (submit, 0, 30, 1, 1);
	add (clear, 1, 30, 1, 1);
	add (exit, 2, 30, 1, 1);
	
	}

	public void processButtons(ActionEvent event)
	{
		/***********************************************
		 * Creating temp variable to hold the days selected from
		 * Checkbox
		 * ***********************************************
		 */
		String[] tempDay = {"--","--","--"};
		
		/***********************************************
		 * Setting up process that happens when Submit
		 * Button is pressed
		 * *********************************************
		 */
		
		if (event.getSource() == submit)
		{
			if(box1.isSelected())
			{
				tempDay[0] = "--Tuesday";
			}
			if(box2.isSelected())
			{
				tempDay[1] = "--Friday";
			}
			if(box3.isSelected())
			{
				tempDay[2] = "--Saturday";
			}
			
			/**************************************************
			 * Creating a popup box to show inputed information
			 * ************************************************
			 */
			Stage popUpStage = new Stage();
			GridPane popUpPane = new GridPane();
			Scene popUpScene = new Scene(popUpPane, 600, 600);
			popUpStage.setScene(popUpScene);
			popUpStage.show();
			
			/*****************************************************
			 * Adding Labels to the popup box and adding text from
			 * variables
			 * ***************************************************
			 */
			
			Label infoSub = new Label("The following information was successfully submitted:");
			infoSub.setFont(Font.font("Comic sans MS", FontWeight.BOLD, 15));
			GridPane.setHalignment(infoSub, HPos.LEFT);
			
			Label band = new Label("Band: " + nameBand.getText());
			band.setFont(Font.font("Comic sans MS", FontWeight.BOLD, 20));
			GridPane.setHalignment(band, HPos.LEFT);
			
			Label web = new Label("Website/FB Page: " + bWeb.getText());
			web.setFont(Font.font("Comic sans MS", FontWeight.BOLD, 20));
			GridPane.setHalignment(web, HPos.LEFT);
			
			Label sound = new Label("Sound clips were successfully uploaded");
			sound.setFont(Font.font("Comic sans MS", FontWeight.BOLD, 20));
			GridPane.setHalignment(sound, HPos.LEFT);
			
			Label day = new Label(nameBand.getText() + " are available to play on:");
			day.setFont(Font.font("Comic sans MS", FontWeight.BOLD, 20));
			GridPane.setHalignment(day, HPos.LEFT);
			
			Label day1 = new Label(tempDay[0]);
			day1.setFont(Font.font("Comic sans MS", FontWeight.BOLD, 15));
			GridPane.setHalignment(day1, HPos.LEFT);
			
			Label day2 = new Label(tempDay[1]);
			day2.setFont(Font.font("Comic sans MS", FontWeight.BOLD, 15));
			GridPane.setHalignment(day2, HPos.LEFT);
			
			Label day3 = new Label(tempDay[2]);
			day3.setFont(Font.font("Comic sans MS", FontWeight.BOLD, 15));
			GridPane.setHalignment(day3, HPos.LEFT);
			
			Label contact = new Label("Contact Information: " + cName.getText()+ " at " + cPhone.getText());
			contact.setFont(Font.font("Comic sans MS", FontWeight.BOLD, 20));
			GridPane.setHalignment(contact, HPos.LEFT);
			
			/***************************************************
			 * Adding Labels to popup box
			 * *************************************************
			 */
			popUpPane.add (infoSub, 0, 0, 1, 1);
			popUpPane.add (band, 0, 2, 1, 1);
			popUpPane.add (web, 0, 4, 1, 1);
			popUpPane.add (sound, 0, 6, 1,1);
			popUpPane.add (day, 0, 8, 1, 1);
			popUpPane.add (day1, 0, 9, 1, 1);
			popUpPane.add (day2, 0, 10, 1, 1);
			popUpPane.add (day3, 0, 11, 1, 1);
			popUpPane.add (contact, 0, 13, 1, 1);
			
		}
		/***********************************************************
		 * When clear button is pressed all info on form is cleared
		 * *********************************************************
		 */
		
		else if (event.getSource() == clear)
		{
			box1.setSelected(false);
			box2.setSelected(false);
			box3.setSelected(false);
			sample1.setSelected(false);
			sample2.setSelected(false);
			clip1.stop();
			clip2.stop();
			bWeb.setText("");
			cName.setText("");
			nameBand.setText("");
			cPhone.setText("");
		}
		/************************************************************
		 * Exit button will close program
		 * **********************************************************
		 */
		else
		{
			System.exit(0);
		}
		
		}
	
	
}
