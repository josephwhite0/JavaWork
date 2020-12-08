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

public class except {

	/*************************************************
	 * initializing variables and creating custom
	 * exception objects
	 * ***********************************************
	 */
	InvalidPWException TooShort = new InvalidPWException("Password too short");
	InvalidPWException NotComplex = new InvalidPWException("Password not complex");
	private int sc = 0;
	private int cc = 0;
	private int both = 0;
	String pass;
	String numRegex   = ".*[0-9].*";
	String alphaRegex = ".*[a-z].*";
	
	/******************************************
	 * testing password for exceptions and counting
	 * each exception thrown
	 * ****************************************
	 */
	public except(String password)
	{
		try
		{
		if (password.length() < 10)
		{
			sc++;
			throw TooShort;
		}
	
		this.pass = password;
		if (this.pass.matches(numRegex)&&this.pass.matches(alphaRegex))
		{
			this.pass = password;
		}
		else
		{
			cc++;
			throw NotComplex;
		}
		}
		catch(InvalidPWException e)
		{
			System.out.println("Exception occured: " + e);
		}
	}
	
	public int getShort()
	{
		return this.sc;
	}
	
	public int getComplex()
	{
		return this.cc;
	}
	
	public int getBoth()
	{
		if (this.sc == 1 && this.cc == 1)
		{
			this.both++;
		}
		return this.both;
	}
	}




