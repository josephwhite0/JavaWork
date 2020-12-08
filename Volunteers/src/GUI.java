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


/********************************
 * importing io and javafx modules
 * ******************************
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class GUI extends GridPane {
	
	
	/*********************************
	 * initiating variables
	 * *******************************
	 */
	private Button submit;
	private Button remo;
	private Button exit;
	private TextField lastName;
	private TextField firstName;
	private TextField email;
	private TextField index;
	Label list1 = new Label("");
	Label num = new Label("");
	Volunteer v = new Volunteer();
	ArrayList <Volunteer>list = new ArrayList();
	Volunteer[] vol = new Volunteer[20];
	Scanner fileScan = null, lineScan;
	String text = "";
	int ind;
	

		
	public GUI()
	{
		/*******************************************
		 * Scanning in data from Volunteers.csv and
		 * creating an arraylist of Volunteer objects
		 * *****************************************
		 */
		int i = 0;
			
				try {
					fileScan = new Scanner(new File("src/Volunteers.csv"));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally
				{
				String str = "";
				while (fileScan.hasNext())
				{
					str = fileScan.nextLine();
					lineScan = new Scanner(str);
					lineScan.useDelimiter(",");
					vol[i] = new Volunteer(lineScan.next(), lineScan.next(), lineScan.next());
					i++;
				}
				
				for(i = 0;i < vol.length;i++)
				{
					list.add(vol[i]);
				}
			}
	
		/*************************************
		 * Building labels, textfields, and 
		 * buttons
		 * ***********************************
		 */
		Label add = new Label();
		add.setText("Add new Volunteer:");
		
		Label r = new Label();
		r.setText("Remove Volunteer:");
		
		Label fN = new Label();
		fN.setText("First Name:");
		
		Label lN = new Label();
		lN.setText("Last Name:");
		
		Label eM = new Label();
		eM.setText("Email:");
		
		num = new Label();
		num.setText("Enter index 0 - " + (list.size() - 1));
		
		lastName = new TextField();
		lastName.setPrefWidth(50);
		
		firstName = new TextField();
		firstName.setPrefWidth(50);
		
		email = new TextField();
		email.setPrefWidth(50);
		
		index = new TextField();
		index.setPrefWidth(50);
		
		submit = new Button ("Submit");
		submit.setOnAction(this::processButtons);
		
		remo = new Button ("Remove");
		remo.setOnAction(this::processButtons);
		
		exit = new Button ("EXIT");
		exit.setOnAction(this::processButtons);
		
		/***************************************
		 * Building a string out of the data from
		 * the arraylist element so that it gets rid
		 * of the brackets and commas
		 * *************************************
		 */
		StringBuilder builder = new StringBuilder();
		for (Volunteer vol : list) {
		    builder.append(vol.toString());
		}
		this.text = builder.toString();
		this.list1.setText(text);
		this.list1.setFont(Font.font("Comic sans MS", FontWeight.BOLD, 13));
		this.list1.setWrapText(true);
		GridPane.setHalignment(this.list1, HPos.LEFT);
		GridPane.setValignment(this.list1, VPos.TOP);
		
		/******************************************
		 * setting up the pane and adding nodes
		 * ****************************************
		 */
		
		setAlignment(Pos.BASELINE_LEFT);
		setHgap(10);
		setVgap(10);
		
	
		add(list1, 1, 1, 9, 1);
		add(lastName, 3, 4, 1, 1);
		add(lN, 2, 4, 1, 1);
		add(firstName, 5, 4, 6, 1);
		add(fN, 4, 4, 1, 1);
		add(email, 12, 4, 7, 1);
		add(eM,11, 4, 1, 1);
		add(submit, 1, 5, 1, 1);
		add(add, 1, 4, 1, 1);
		add(index, 2, 6, 1, 1);
		add(r, 1, 6, 1, 1);
		add(num, 3, 6, 1, 1);
		add(remo, 1, 8, 1, 1);
		add(exit, 3, 8, 1, 1);

	}
	public void processButtons(ActionEvent event){
		{
			/****************************************
			 * setting up process to submit new data
			 * to create a new Volunteer object to add
			 * to the arraylist
			 * **************************************
			 */

			if (event.getSource() == submit)
			{
				v = new Volunteer(lastName.getText(), firstName.getText(),email.getText());
				list.add(v);
				StringBuilder builder = new StringBuilder();
				for (Volunteer vol : list) {
				    builder.append(vol.toString());
				}
				text = builder.toString();
				this.list1.setText(text);
				lastName.clear();
				firstName.clear();
				email.clear();
				num.setText("Enter index 0 - " + (list.size() - 1));
				
			}
			
			if (event.getSource() == remo)
			{
				/****************************************
				 * setting up process to delete and object
				 * from the arraylist using the index of the
				 * object
				 * **************************************
				 */
				try {
				     if(Integer.parseInt(index.getText()) < list.size())
				     {
				    	 this.ind = Integer.parseInt(index.getText());
				    	 list.remove(this.ind);
				     }
				     else
				     {
				    	 index.clear();
				     }
				}
				catch (NumberFormatException e) {
				     Label num1 = new Label("not an index, please try again");
				     add(num1, 1, 7, 1, 1);
				}
				finally {
				list.trimToSize();
				StringBuilder builder = new StringBuilder();
				for (Volunteer vol : list) {
				    builder.append(vol.toString());
				}
				text = builder.toString();
				this.list1.setText(text);
				num.setText("Enter index 0 - " + (list.size() - 1));
				index.clear();
				}
				
			}
			/*************************
			 * closes the program
			 * ***********************
			 */
			if (event.getSource() == exit)
			{
				System.exit(0);
			}
			
			
		}
	}

}
