//************************************************************************
//	Token -- Represents a Token for the Homeless
//  
//  Student Name:
//  Date:
//  Description of class:
//	Known issues with code:
//
//************************************************************************

import java.util.Random;

public class Token
{

	//***********************************************************************************
	//  Instance variables
	//		cardName	Description of card
	//	    cardRank	Rank of card
	//
	//  STUDENTS:  DO NOT ADD INSTANCE DATA ITEMS.  DECLARE LOCAL VARIABLES WITHIN
	//             METHODS, IF ADDITIONAL VARIABLES ARE NEEDED.
	//***********************************************************************************

	private String ID = "";
	private String firstName = "", lastName = "";
	private int quadrant = 0;
	private double balance = 0.0;	
	private boolean alerts[] = {true, false, false};
	

	//***********************************************************************************
	//  Constructor
	//
	//  Validated constructor so that ID will not be passed through unless it is 5 digits
	//  long and has to be numeric.
	//
	//  Validated firstName and lastName to only be passed if the length is greater than 0
	//
	//  Validated quadrant so that it will not pass through if it is not 1-14
	//***********************************************************************************

	public Token(String ID, String firstName, String lastName, int quadrant)
	{
		if (ID.length() == 5 && isAllDigits(ID) == true)
		{
		this.ID = ID;
		}
		
		if (firstName.length() > 0)
		{
		this.firstName = firstName;
		}
		
		if (lastName.length() > 0)
		{
		this.lastName = lastName;
		}
		
		if (quadrant >= 1 && quadrant <= 14)
		{
		this.quadrant = quadrant;
		}
	}
	
	//***********************************************************************************
	//  Default Constructor
	//***********************************************************************************
	public Token()
	{
		this.ID = "99999";
		this.firstName = "";
		this.lastName = "";
		this.quadrant = 0;
		
	}


	//***********************************************************************************
	//  Accessors for ID, lastName, firstName, quadrant, balance, alerts
	//***********************************************************************************

	public String getID()
	{
		return ID;

	}

	public String getLastName()
	{	
		return lastName;

	}

	public String getFirstName()
	{	
		return firstName;

	}		
	
	public int getQuadrant() 
	{	
		return quadrant;

	}
		
	public double getBalance() 
	{	
		return balance;

	}
		
	public boolean getAlert(int singleAlert) 
	{	
		return alerts[singleAlert];
	}	
	
	//***********************************************************************************
	//  Mutators for lastName, firstName, and quadrant
	//
	//  Validated setLastName and setFirstName so that the length has to be greater than 0
	//
	//  Validated setQuadrant so that it has to be 1-14
	//***********************************************************************************

	public void setLastName(String lastName) 
	{
		if (lastName.length() > 0)
		{
		this.lastName = lastName;
		}
	}
		
	public void setFirstName(String firstName) 
	{
		if (firstName.length() > 0)
		{
		this.firstName = firstName;
		}
	}
		
	public void setQuadrant(int quadrant) 
	{
		if (quadrant >= 1 && quadrant <= 14)
		{
		this.quadrant = quadrant;
		}
	}


	//***********************************************************************************
	//  Helping methods
	//
	//  addToBalance will add donation to balance and if balance is greater than 0 then
	//  alerts[0] will be set to false. It will return a true value if the donation is 
	//  more than 0.
	//
	//  buyItem can only be used if the purchase amount it greater than 0 and if there is 
	//  enough in the balance. If there is enough, then the purchase price will be reduced
	//  from balance and it will return true.
	//
	//  setAlert is validated so that singleAlert can only be 0-2. alert[0] will only update
	//  if there is no balance.
	//
	//  clearAlert will reset all alerts to false unless there is still a value greater
	//  than 0 in balance. If there is alerts[0] will not clear.
	//***********************************************************************************
	public boolean addToBalance(double donation)	
	{
		this.balance = this.balance + donation;
		
		if (this.balance > 0)
		{
			alerts[0] = false;
		}
		
		if (donation > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean buyItem(double purchaseAmount) 	
	{
		if (purchaseAmount > 0 && purchaseAmount <= this.balance)
		{
			this.balance = this.balance - purchaseAmount;
			return true;
		}
		else
		{
			return false;
		}

	}
		
	public void setAlert(int singleAlert) 	
	{
		if (singleAlert >= 0 && singleAlert <= 2)
		{
			if (this.balance <= 0 && singleAlert == 0)
				{
				this.alerts[0] = true;
				}
		
			if (singleAlert == 1)
			{
			this.alerts[1] = true;
			}
		
			if (singleAlert == 2)
			{
			this.alerts[2] = true;
			}
		}
	}
	
	public void clearAlert(int singleAlert)	
	{
		if (singleAlert >= 0 && singleAlert <= 2)
		{
			if (this.balance <= 0 && singleAlert == 0)
			{
				this.alerts[0] = false;
			}
			if (singleAlert == 1)
			{
				this.alerts[1] = false;
			}
			if (singleAlert == 2)
			{
				this.alerts[2] = false;
			}
		}

	}		
		
	public boolean isAllDigits (String testString)	
	{	/*------------------------------------------------------------------------------
		 *  isAllDigits() verifies that each character in a string is a numeric digit
		 *
		 *  The method returns a true value if all characters are digits and returns
		 *  a false value if any of the characters is not a digit.
		 * ----------------------------------------------------------------------------*/
		
		char[ ] testStringAsChar = testString.toCharArray();
		for (char c : testStringAsChar) {
			if (! Character.isDigit(c)) 	
				return false;
		}
		return true;
	}
	

	//***********************************************************************************
	//  toString() Method returns a String (DOES NOT DISPLAY ANYTHING)
	//  
	//  The string returned should contain all of the instance data items in a pleasing
	//  format.
	//***********************************************************************************

 	public String toString()
	{	
 		return ("ID: \s\s\s\s\s\s\s\s\s\s\s" + ID + "\n" + "First Name: \s\s\s" + firstName + "\n" + "Last Name: \s\s\s\s" + lastName + "\n" + "Quadrant: \s\s\s\s\s" + quadrant + "\n" + "Balance: \s\s\s\s\s\s" + balance + "\n" + "Balance Alert: " + alerts[0] + "\n" + "Weather Alert: " + alerts[1] + "\n" + "CheckIn Alert: " + alerts[2]);
	}
}

