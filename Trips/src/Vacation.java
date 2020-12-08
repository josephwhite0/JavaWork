/*************************************************
 * Name: Joseph White  
 * Date: 09.28.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This is a program that creates an object
 * array and utilizes polymorphism with parent and
 * child classes
 * ************************************************
 */

public abstract class Vacation {
	
	/********************************************************
	 * Assigning variables that can be used by children
	 * *****************************************************
	 */

	protected String destination;
	protected String departureDate;
	protected String returnDate;
	
	/*********************************************************
	 * Default Constructor
	 * *******************************************************
	 */
	public Vacation()
	{
		this.destination = "";
		this.departureDate = "";
		this.returnDate = "";
	}
	
	/**********************************************************
	 * Constructor with parameters
	 * ********************************************************
	 */
	public Vacation(String destination, String departureDate, String returnDate)
	{
		this.destination = destination;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
	}
	
	/**********************************************************
	 * Getters
	 * ********************************************************
	 */
	public String getDestination()
	{
		return this.destination;
	}
	
	public String getDepartureDate()
	{
		return this.departureDate;
	}
	
	public String getReturnDate()
	{
		return this.returnDate;
	}
	
	/*****************************************
	 * Mutators
	 * ***************************************
	 */
	public void setDestination(String destination)
	{
		this.destination = destination;
	}
	
	public void setDepartureDate(String departureDate)
	{
		this.departureDate = departureDate;
	}
	
	public void setReturnDate(String returnDate)
	{
		this.returnDate = returnDate;
	}
	
	/****************************************
	 * Constructing the toString()
	 * **************************************
	 */
	
	public String toString()
	{
		return "Destination: " + this.destination + "\n" + "Departure Date: " + this.departureDate + "\n" + "Return Date: " + this.returnDate;
	}
	
	/***************************************
	 * Creating abstract method
	 * *************************************
	 */
	
	public abstract double getTotalCost();
	
	
	
}
