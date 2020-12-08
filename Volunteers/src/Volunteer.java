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


/********************************************
 * Creating Volunteer class default and
 * regular constructors
 * *****************************************
 */
public class Volunteer {
	
	private String lastName = "";
	private String firstName = "";
	private String email = "";
	
	public Volunteer(String lastName, String firstName, String email)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
	}
	
	public Volunteer()
	{
		this.lastName = "";
		this.firstName = "";
		this.email = "";
	}
	
	/************************************
	 * Creating the getters
	 * **********************************
	 */
	public String getLastName()
	{
		return this.lastName;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	/**********************************
	 * Creating the mutators
	 * ********************************
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	/******************
	 * Creating the toString()
	 * ****************
	 */
	public String toString()
	{
		return "Last Name: " + this.lastName + " First Name: " + this.firstName + " Email: " + this.email + "\n";
	}

}
