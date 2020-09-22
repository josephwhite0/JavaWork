/*************************************************
 * Name: Joseph White
 * Date: 08.27.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This program displays a GUI that you can input
 * your name, age, and how many hours of sleep you get a night
 * and calculates how many hours, days, and years you've slept
 * in your lifetime.
 * ***********************************************
 */
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

import javafx.scene.control.Button;

public class sleepPane extends GridPane 
{
	/********************************************
	 * Creating TextFields, Labels, and Buttons.
	 * Assigning these with names.
	 * *****************************************
	 */
	
	private TextField name;
	private TextField age;
	private TextField hrsSleep;
	private Label resultHrs;
	private Label resultDays;
	private Label resultYears;
	private Button calcButton;
	private Button clearButton;
	private Button exitButton;
	
	public sleepPane()
	{
		Font font = new Font(18);
		
		/**********************************
		 * Creating Label objects, creating
		 * simple text on the GUI.
		 * ********************************
		 */
		Label nameLabel = new Label("Name: ");
		nameLabel.setFont(font);
		GridPane.setHalignment(nameLabel, HPos.RIGHT);
		
		Label ageLabel = new Label("Age: ");
		ageLabel.setFont(font);
		GridPane.setHalignment(ageLabel, HPos.RIGHT);
		
		Label sleepLabel = new Label("Hours of Sleep: ");
		sleepLabel.setFont(font);
		GridPane.setHalignment(sleepLabel, HPos.RIGHT);
		
		/***************************************
		 * Creating TextFields, setting font, 
		 * and setting alignment
		 * ************************************
		 */
		name = new TextField();
		name.setFont(font);
		name.setPrefWidth(50);
		name.setAlignment(Pos.CENTER);
		
		age = new TextField();
		age.setFont(font);
		age.setPrefWidth(50);
		age.setAlignment(Pos.CENTER);
		
		hrsSleep = new TextField();
		hrsSleep.setFont(font);
		hrsSleep.setPrefWidth(50);
		hrsSleep.setAlignment(Pos.CENTER);
		
		/****************************************
		 * Creating basic text Labels
		 * **************************************
		 */
		Label hrsLabel = new Label("Hours Slept: ");
		hrsLabel.setFont(font);
		GridPane.setHalignment(hrsLabel, HPos.RIGHT);
		
		Label daysLabel = new Label("Days Slept: ");
		daysLabel.setFont(font);
		GridPane.setHalignment(daysLabel, HPos.RIGHT);
		
		Label yrsLabel = new Label ("Years Slept: ");
		yrsLabel.setFont(font);
		GridPane.setHalignment(yrsLabel, HPos.RIGHT);
		
		/***********************************************
		 * Creating Label objects and assigning them with
		 * a blank
		 * *********************************************
		 */
		resultHrs = new Label("---");
		resultHrs.setFont(font);
		GridPane.setHalignment(resultHrs, HPos.CENTER);
		
		resultDays = new Label("---");
		resultDays.setFont(font);
		GridPane.setHalignment(resultDays, HPos.CENTER);
		
		resultYears = new Label("---");
		resultYears.setFont(font);
		GridPane.setHalignment(resultYears, HPos.CENTER);
		
		/********************************************
		 * Creating buttons; one that will calculate, 
		 * one that clears the fields, and one that
		 * closes program.
		 * ******************************************
		 */
		calcButton = new Button("Calculate");
		calcButton.setOnAction(this::processButtons);
		GridPane.setHalignment(calcButton, HPos.CENTER);
		
		clearButton = new Button("Clear");
		clearButton.setOnAction(this::processButtons);
		GridPane.setHalignment(clearButton, HPos.CENTER);
		
		exitButton = new Button("Exit");
		exitButton.setOnAction(this::processButtons);
		GridPane.setHalignment(exitButton, HPos.CENTER);
		
		setAlignment(Pos.CENTER);
		setHgap(20);
		setVgap(10);
		setStyle("-fx-background-color: lightcyan");
		
		/****************************************
		 * Building actual GUI and adjusting positioning
		 * of created objects
		 * **************************************
		 */
		add(nameLabel, 0, 0, 1, 1);
		add(ageLabel, 0, 2, 1, 1);
		add(sleepLabel, 0, 4, 1, 1);
		add(name, 1, 0, 8, 1);
		add(age, 1, 2, 2, 1);
		add(hrsSleep, 1, 4, 2, 1);
		add(hrsLabel, 0, 6, 1, 1);
		add(daysLabel, 5, 6, 1, 1);
		add(yrsLabel, 12, 6, 1, 1);
		add(resultHrs, 1, 6, 3, 1);
		add(resultDays, 7, 6, 3, 1);
		add(resultYears, 14, 6, 3, 1);
		add(calcButton, 0, 10, 1, 1);
		add(clearButton, 5, 10, 1, 1);
		add(exitButton, 12, 10, 1, 1);	
	}
	
	public void processButtons(ActionEvent event)
	{
		/*********************************************
		 * Setting up processes that happen when each
		 * button is pressed. The calcButton takes numbers
		 * from text fields and calculates hours, days, and
		 * years slept. ClearButton clears all fields and
		 * calculations. ExitButton closes program.
		 * *******************************************
		 */
		if (event.getSource() == calcButton)
		{
			int ageTemp = Integer.parseInt(age.getText());
			double hrsSleepTemp = Double.parseDouble(hrsSleep.getText());
			double hrsSleep = (double) (ageTemp * 365 *hrsSleepTemp);
			double daysSleep = hrsSleep/24;
			double yearsSleep = daysSleep/365;
			resultHrs.setText((int)hrsSleep + "");
			resultDays.setText((int)daysSleep + "");
			resultYears.setText((int)yearsSleep + "");
		}
		else if (event.getSource() == clearButton)
		{
			resultHrs.setText("---");
			resultDays.setText("---");
			resultYears.setText("---");
			name.setText("");
			age.setText("");
			hrsSleep.setText("");
		}
		
		else {
			System.exit(0);
		}
	}
	
	}

