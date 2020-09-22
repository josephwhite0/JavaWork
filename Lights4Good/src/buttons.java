/*************************************************
 * Name: Joseph White  
 * Date: 09.14.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This program creates a memory game using
 * colored buttons and tones.
 * ************************************************
 */

import java.io.File;  
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;


	
public class buttons extends GridPane {
	
	/********************************************************************************
	 * Creating variables
	 * ******************************************************************************
	 */
	private Button redButton;
	private Button greenButton;
	private Button yellowButton;
	private Button blueButton;
	private Button newGame;
	private Button remember;
	private Button endGame;
	private Button close;
	private String[] colors = {"red", "blue", "green", "yellow"};
	private Stage popUpStage;
	int[] buttonMem = new int[8];
	int i = 0;
	private AudioClip redSound;
	private AudioClip blueSound;
	private AudioClip yellowSound;
	private AudioClip greenSound;
	public buttons() {
	
	/***********************************************************************************
	 * Creating AudioClips and Buttons
	 * *********************************************************************************
	 */
	String musicfile1 = "src/Red.wav";
	String musicfile2 = "src/Blue.wav";
	String musicfile3 = "src/Yellow.wav";
	String musicfile4 = "src/Green.wav";
	redSound = new AudioClip(new File(musicfile1).toURI().toString());
	blueSound = new AudioClip(new File(musicfile2).toURI().toString());
	yellowSound = new AudioClip(new File(musicfile3).toURI().toString());
	greenSound = new AudioClip(new File(musicfile4).toURI().toString());
	
	redSound.setVolume(0.5);
	blueSound.setVolume(0.5);
	yellowSound.setVolume(0.5);
	greenSound.setVolume(0.5);
	
	redButton = new Button("Red Button");
	redButton.setOnAction(this::buttonProcess2);
	
	greenButton = new Button("Green Button");
	greenButton.setOnAction(this::buttonProcess2);
	
	yellowButton = new Button("Yellow Button");
	yellowButton.setOnAction(this::buttonProcess2);
	
	blueButton = new Button("Blue Button");
	blueButton.setOnAction(this::buttonProcess2);
	
	newGame = new Button("New Game");
	newGame.setOnAction(this::buttonProcess);
	
	remember = new Button("Remember Game");
	remember.setOnAction(this::buttonProcess2);
	
	endGame = new Button("End Game");
	endGame.setOnAction(this::buttonProcess2);
	
	redButton.setPrefWidth(200);
	redButton.setPrefHeight(200);
	redButton.setStyle("-fx-background-color: #ff0000");
	
	
	greenButton.setPrefWidth(200);
	greenButton.setPrefHeight(200);
	greenButton.setStyle("-fx-background-color: #077D0B");
	
	
	yellowButton.setPrefWidth(200);
	yellowButton.setPrefHeight(200);
	yellowButton.setStyle("-fx-background-color: #FCF40E");
	
	
	blueButton.setPrefWidth(200);
	blueButton.setPrefHeight(200);
	blueButton.setStyle("-fx-background-color: #0348EB");
	
	
	newGame.setAlignment(Pos.CENTER);
	
	setGridLinesVisible(false);
	
	setAlignment(Pos.CENTER);
	setHgap(20);
	setVgap(10);
	
	/*****************************************************************************
	 * adding nodes to the Pane
	 * ***************************************************************************
	 */
	add (redButton, 1, 1, 3, 1);
	add (greenButton, 1, 2, 3, 1);
	add (yellowButton, 3, 1, 3, 1);
	add (blueButton, 3, 2, 3, 1);
	add (newGame, 1, 4, 1, 1);
	add (remember, 2, 4, 1, 1);
	add (endGame, 3, 4, 1, 1);
	
	/*********************************************************************************
	 * Disabling the color buttons until New Game is pressed.
	 * *******************************************************************************
	 */
	redButton.setDisable(true);
	greenButton.setDisable(true);
	blueButton.setDisable(true);
	yellowButton.setDisable(true);
	remember.setDisable(true);
	}
	
	public void buttonProcess(ActionEvent event)
	{
		/*******************************************************
		 * Creating a popup window that has instructions when the New Game
		 * Button is pressed.
		 * *****************************************************
		 */
		if (event.getSource() == newGame)
		{
			
			popUpStage = new Stage();
			GridPane popUpPane = new GridPane();
			Scene popUpScene = new Scene(popUpPane, 600, 200);
			popUpStage.setScene(popUpScene);
			popUpStage.show();
			
			popUpPane.setGridLinesVisible(false);
			Label inst = new Label();
			inst.setText("Instructions: First player clicks eight color buttons.\n Then second player presses the Rememeber button then repeats the pattern that the first player created.");
			inst.setAlignment(Pos.CENTER);
			close = new Button("Close");
			close.setAlignment(Pos.CENTER);
			close.setOnAction(this::buttonProcess3);
			
			redButton.setDisable(false);
			greenButton.setDisable(false);
			blueButton.setDisable(false);
			yellowButton.setDisable(false);
			
			popUpPane.setAlignment(Pos.CENTER);
			popUpPane.setHgap(20);
			popUpPane.setVgap(10);
			
			popUpPane.add(inst, 0, 0, 3, 1);
			popUpPane.add(close, 2, 3, 1, 1);
			
		}
	}
		
	public void buttonProcess2(ActionEvent event)
	{
		/*********************************************************************
		 * When color button is pressed it will play a tone, assign the associated number
		 * to the buttonMem[] array, then increment i by 1. The buttons are also 
		 * validated so that they will not work once the array is full.
		 * *******************************************************************
		 */
		if (event.getSource() == redButton && i < 9)
		{
			redSound.play();
			buttonMem[i] = 0;
			i++;
				
		}
		else if(event.getSource() == blueButton && i < 9)
				{
					blueSound.play();
					buttonMem[i] = 1;
					i++;	
				}
		else if (event.getSource() == greenButton && i < 9)
				{
					greenSound.play();
					buttonMem[i] = 2;
					i++;
					
				}
		else if (event.getSource() == yellowButton && i < 9)
				{
					yellowSound.play();
					buttonMem[i] = 3;
					i++;
				}
		if (i == 8)
		{
			/********************************************************
			 * Once you have filled the array, the remember button will become active
			 * and a text will tell you to press the remember button
			 * ******************************************************
			 */
			remember.setDisable(false);
			Label limit = new Label();
			limit.setText("You've selected 8 colors. Now press the remember button.");
			add (limit, 1, 5, 3, 1);
		}
		
		if(event.getSource() == remember)
		{
			/*********************************************************************
			 * When the remember button is pressed, a list will appear that shows
			 * which buttons player 1 has pressed.
			 * *******************************************************************
			 */
			Label list = new Label();
			list.setText("--" + colors[buttonMem[0]] + " --" + colors[buttonMem[1]] + " --" + colors[buttonMem[2]] + " --" + colors[buttonMem[3]] + " --" + colors[buttonMem[4]] +
					" --" + colors[buttonMem[5]] + " --" + colors[buttonMem[6]] + " --" + colors[buttonMem[7]]);
			
			add (list, 1, 6, 7, 1);
			}
			
		/********************************************************
		 * End Game button will close application.
		 * ******************************************************
		 */
		if(event.getSource() == endGame)
		{
			System.exit(0);
		}
	}

	
	public void buttonProcess3(ActionEvent event)
	{
		/****************************************************
		 * closes popup instruction window
		 * **************************************************
		 */
		if (event.getSource() == close)
		{
			popUpStage.close();
		}
	}
	}

	
	


