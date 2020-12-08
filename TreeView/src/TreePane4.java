 /*******************************************************
 * Name: Joseph White 
 * Date: 11.17.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: Program that creates a tree using and array
 * of Customer class
 *******************************************************
 */
 
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;

import javafx.scene.control.Button;


public class TreePane4 extends StackPane
{	
	/*----------------------------------------------------------------------------------
	 *   Creating nodes, an object array using Customer, and streaming image data
	 *
	 -----------------------------------------------------------------------------------*/

	
    private final Node rootIcon = new ImageView(new Image(getClass().getResourceAsStream("folder.png")));
	private final Image peopleIcon = new Image(getClass().getResourceAsStream("people.png"));
    private final Image visaIcon = new Image(getClass().getResourceAsStream("Visa.png"));
    private final Image mcIcon = new Image(getClass().getResourceAsStream("MasterCard.png"));

	private static final int TEST_COUNT = 25;
	
	private Customer[] customers = new Customer[TEST_COUNT];	
    
	private TreeItem<String> rootItem = new TreeItem<String>("Customers", rootIcon);
	private TreeItem<String> CCExpireNode;
	private TreeItem<String> CCTypeNode;
	private TreeView<String> tree;
 
		/*----------------------------------------------------------------------------------
		 *   
		 *Creating the TreePane
		 -----------------------------------------------------------------------------------*/
		 
	   public TreePane4()
		{	/*----------------------------------------------------------------------------------
			 *   loads an array of Customers and creates a root node
			 -----------------------------------------------------------------------------------*/	
			loadArray();
			
			rootItem.setExpanded(true);
			String expireYear = "";
			
			/*----------------------------------------------------------------------------------
			 *   Creates a for loop for however many customers there are
			 -----------------------------------------------------------------------------------*/	
			 
			for (Customer customer : customers) {
				
				/*---------------------------------------------------------------------------
				*	Creates node that holds the full name of a customer and creates
				*a variable for expiration year
				*   
				*   
				----------------------------------------------------------------------------*/
				
				TreeItem<String> customerLeaf = new TreeItem<String>(customer.getFullName()); 
				boolean foundCC = false;
				boolean foundCCExpire = false;
				expireYear = customer.getCreditCardExpiration().substring(customer.getCreditCardExpiration().length() - 4);
				
				/*---------------------------------------------------------------------------
				*   Creates a for loop for each node off of the root and uses an if
				*   statement to check for credit card type
				*   
				*   
				/*-------------------------------------------------------------------------*/	
				
				for (TreeItem<String> CCTypeNode : rootItem.getChildren()) {
					
					if (CCTypeNode.getValue().contentEquals(customer.getCreditCardType())){ 
				
						/*---------------------------------------------------------------------------
						*   
						*   Next there is another for loop for every credit card type node,
						*   sets the expiration year for each node.
						*   
						/*-------------------------------------------------------------------------*/	
					
						for (TreeItem<String> CCExpireNode : CCTypeNode.getChildren()) {
							
							String nodeExpireYear = CCExpireNode.getValue().substring(CCExpireNode.getValue().length() - 4);
							
							if (nodeExpireYear.contentEquals(expireYear)){ 
								
							/*---------------------------------------------------------------------------
							*   if the node is expired then foundCC and foundCCExpire is set to true
							*    it will add a CCExpireNode to the tree and the loop ends
							*   
							/*-------------------------------------------------------------------------*/	
		
								CCExpireNode.getChildren().add(customerLeaf);
								foundCC = true;
								foundCCExpire = true;
								break;
							}
						}
						if (!foundCCExpire) {
						
							/*---------------------------------------------------------------------------
							*   This will create a new CCExpireNode and add it to the CCTypeNode and
							*   will set foundCC to true, then break the loop
							*   
							/*-------------------------------------------------------------------------*/				

							CCExpireNode = new TreeItem<String>(expireYear, new ImageView(peopleIcon));
							CCTypeNode.getChildren().add(CCExpireNode);
							CCExpireNode.getChildren().add(customerLeaf);
							foundCC = true;	
							break;
								
						}
					}	
				}	
					
				
				if (!foundCC) {
									
					/*---------------------------------------------------------------------------
					*   This creates a CCTypeNode object, getting the type from the customer
					*   class and using it as a parameter for the TreeItem. Then adds it to the
					*   tree
					*   
					*---------------------------------------------------------------------------*/
					
					if (customer.getCreditCardType().equals("Visa"))
							CCTypeNode = new TreeItem<String>(customer.getCreditCardType(), 
																		new ImageView(visaIcon));
					else
							CCTypeNode = new TreeItem<String>(customer.getCreditCardType(), 
																		new ImageView(mcIcon));	
					rootItem.getChildren().add(CCTypeNode);
					CCExpireNode = new TreeItem<String>(expireYear, new ImageView(peopleIcon));
					CCTypeNode.getChildren().add(CCExpireNode);
					CCExpireNode.getChildren().add(customerLeaf);
				}
  			}
		/*---------------------------------------------------------------------------
		 *   This creates the tree root and builds the tree
		 * 
		 *-------------------------------------------------------------------------*/
		tree = new TreeView<String> (rootItem); 
		getChildren().add(tree);			
		}

	/*---------------------------------------------------------------------------
	 *   This creates the loadArray() method used at the beginning of the 
	 *   class, filling the variables with data from the file Customers.csv
	 *-------------------------------------------------------------------------*/	
		
    public void loadArray() {		
	
       try {
		    File file = new File("Customers.csv");
			Scanner fileScan = new Scanner(file), lineScan; 
			String recordScan = "";

			String  SSN;
			char    gender;
			String  firstName;
			String  middleInitial;
			String  lastName;
			String  street;
			String  city;
			String  state;
			String  zipcode;
			String  birthdate;
			String  creditCardType;
			String  creditCardNumber;
			String  creditCardExpiration;
			int count = 0;
			
			while (fileScan.hasNextLine() && count <= TEST_COUNT) {
				recordScan = fileScan.nextLine();
				lineScan = new Scanner(recordScan);
				lineScan.useDelimiter(",");
				
				/*---------------------------------------------------------------------------
				 *   The file Customers.csv is being read and separated by use of the 
				 *   useDelimiter(",") so that each data point is stored in the variable
				 * 
				 *-------------------------------------------------------------------------*/
				
				SSN = lineScan.next();            
				gender = lineScan.next().charAt(0); 
				firstName = lineScan.next();
				middleInitial = lineScan.next();
				lastName = lineScan.next();
				street = lineScan.next();
				city = lineScan.next();
				state = lineScan.next();
				zipcode = lineScan.next();
				birthdate = lineScan.next();
				creditCardType = lineScan.next();
				creditCardNumber = lineScan.next();
				creditCardExpiration = lineScan.nextLine(); 
				
				customers[count] = new Customer(SSN, gender, firstName, middleInitial, 
											   lastName, street, city, state, zipcode, birthdate, 
											   creditCardType, creditCardNumber, 
											   creditCardExpiration);
				count++;
			}
	   }
	   catch (Exception exception) {}
		
	}
}