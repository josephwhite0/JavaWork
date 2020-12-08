/*************************************************
 * Name: Joseph White
 * Date: 10.22.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This program creates a class for a customer,
 * encrypts and decrypts their password, creates an
 * outFile report, a report on the console, creates
 * a custom exception, and counts the times thrown
 * ************************************************
 */

public class Customer {

	private String customerID;
	private String lastName;
	private String firstName;
	private String email;
	private String userName;
	private float bankBalance;
	private String password;
	private String encPass;
	Secret pass = new Secret("");
	
	/*************************************************************
	 * Constructors
	 * ***********************************************************
	 */
	public Customer(String customerID, String lastName, String firstName, String email, String userName, float bankBalance, String password)
	{
		if(customerID.length() <= 6)
		{
			this.customerID = customerID;
		}
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.userName = userName;
		this.bankBalance = bankBalance;
		this.password = password;
		pass = new Secret(password);
		pass.encrypt();
		this.encPass = pass.toString();
	}
	
	public Customer()
	{
		this.customerID = "";
		this.firstName = "";
		this.email = "";
		this.userName = "";
		this.bankBalance = 0;
		this.password = "";
		this.encPass = "";
	}
	
	/*****************************************
	 * Getters
	 * ***************************************
	 */
	public String Decrypt()
	{
		return pass.decrypt();
	}
	
	public String getCustomerID()
	{
		return this.customerID;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public String getUserName()
	{
		return this.userName;
	}
	
	public float getBankBalance()
	{
		return this.bankBalance;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public String getEncPassword()
	{
		return this.encPass;
	}
	
	public String getDecrypt()
	{
		return pass.decrypt();
	}
	
	/**************************************
	 * Mutators
	 * ************************************
	 */
	public void changeFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void changeLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void changeEmail(String email)
	{
		this.email = email;
	}
	
	public void changePassword(String password)
	{
		this.password = password;
	}
	
	/**************************************
	 * Override toString()
	 * ************************************
	 */
	public String toString()
	{
		return ("Customer ID: " + this.customerID + "\n" + "User Name: " + this.userName + "\n" + "First Name: " + this.firstName + " " + this.lastName + "\n" + "Bank Balance: " + this.bankBalance +
				"\n" + "Password Encrypted: " + pass.isEncrypted() + "\n");
	}
}
