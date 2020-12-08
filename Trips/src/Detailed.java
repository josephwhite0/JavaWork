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

public class Detailed extends Vacation {
	
	/*******************************************************
	 * Assigning private variables
	 * *****************************************************
	 */
	
	private double hotel;
	private double airfare;
	private double meals;
	private double transfers;
	
	/*********************************************************
	 * Default Constructor
	 * *******************************************************
	 */
	
	public Detailed()
	{
		this.hotel = 0;
		this.airfare = 0;
		this.meals = 0;
		this.transfers = 0;
	}
	
	/**********************************************************
	 * Constructor with parameters
	 * ********************************************************
	 */
	
	public Detailed(String destination, String departureDate, String returnDate, double hotel, double airfare, double meals, double transfers)
	{
		this.destination = destination;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.hotel = hotel;
		this.airfare = airfare;
		this.meals = meals;
		this.transfers = transfers;
	}
	
	/**********************************************************
	 * Getters
	 * ********************************************************
	 */
	
	public double getHotelCost()
	{
		return this.hotel;
	}
	
	public double getAirfareCost()
	{
		return this.airfare;
	}
	
	public double getMealCost()
	{
		return this.meals;
	}
	
	public double getTransfersCost()
	{
		return this.transfers;
	}
	
	/*****************************************
	 * Mutators
	 * ***************************************
	 */
	
	public void setHotelCost(double hotel)
	{
		if (hotel >= 0 && hotel < 999999999)
		{
		this.hotel = hotel;
		}
	}
	
	public void setAirfareCost(double airfare)
	{
		if (airfare >= 0 && airfare < 999999999)
		{
		this.airfare = airfare;
		}
	}
	
	public void setMealCost(double meals)
	{
		if (meals >= 0 && meals < 999999999)
		{
		this.meals = meals;
		}
	}
	
	public void setTransfersCost(double transfers)
	{
		if (transfers >= 0 && transfers < 999999999)
		{
		this.transfers = transfers;
		}
	}
	
	/****************************************
	 * Constructing the toString()
	 * **************************************
	 */
	
	public String toString()
	{
		return super.toString() + "\n" + "Hotel: " + this.hotel + "\n" + "Airfare: " + this.airfare + "\n" + 
	"Meals: " + this.meals + "\n" + "Transfers: " + this.transfers + "\n";
	}
	
	/***************************************
	 * Assigning abstract method
	 * *************************************
	 */
	
	public double getTotalCost()
	{
		return this.hotel + this.airfare + this.meals + this.transfers;
	}

}
