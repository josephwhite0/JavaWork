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

public class AllInclusive extends Vacation {
	
	/*******************************************************
	 * Assigning private variables
	 * *****************************************************
	 */
	
	private String brand;
	private int starRating;
	private double price;
	
	/*********************************************************
	 * Default Constructor
	 * *******************************************************
	 */
	
	public AllInclusive()
	{
		this.brand = "";
		this.starRating = 0;
		this.price = 0;
	}
	
	/**********************************************************
	 * Constructor with parameters
	 * ********************************************************
	 */
	
	public AllInclusive(String destination, String departureDate, String returnDate, String brand)
	{
		this.destination = destination;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.brand = brand;
	}
	
	/**********************************************************
	 * Getters
	 * ********************************************************
	 */
	
	public String getBrand()
	{
		return this.brand;
	}
	
	public int getRating()
	{
		return this.starRating;
	}
	
	/*****************************************
	 * Mutators
	 * ***************************************
	 */
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public void setRating(int rating)
	{
		if (rating >= 1 && rating <= 5)
		{
		this.starRating = rating;
		}
	}
	
	public void setPrice(double price)
	{
		if (price >= 0 && price < 999999999)
		{
		this.price = price;
		}
	}
	
	/****************************************
	 * Constructing the toString()
	 * **************************************
	 */
	
	public String toString()
	{
		String star = "";
		if(this.starRating == 1)
		{
			star = "*";
		}
		if(this.starRating == 2)
		{
			star = "**";
		}
		if(this.starRating == 3)
		{
			star = "***";
		}
		if(this.starRating == 4)
		{
			star = "****";
		}
		if(this.starRating == 5)
		{
			star = "*****";
		}
		return super.toString() + "\n" + "Brand: " + this.brand + "\n" + "Star Rating: " + star + "\n" + "Price:" + this.price + "\n";


	}
	
	/***************************************
	 * Assigning abstract method
	 * *************************************
	 */
	
	public double getTotalCost()
	{
		return this.price;
	}

}
