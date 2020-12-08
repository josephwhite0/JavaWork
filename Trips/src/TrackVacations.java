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
public class TrackVacations {

	/*****************************************************
	 * Creating an array of objects
	 * ***************************************************
	 */
	
	public static void main(String[] args) {
		Vacation[] beach = new Vacation[12];
		beach [0] = new AllInclusive();
		beach [1] = new AllInclusive();
		beach [2] = new AllInclusive();
		beach [3] = new AllInclusive("Cancun", "9.26.20", "9.30.20", "Big V");
		beach [4] = new AllInclusive("Italy", "8.12.20", "8.15.20", "Go Jet");
		beach [5] = new AllInclusive("Spain", "12.20.20", "12.25.20", "Go Go Vacay");
		beach [6] = new Detailed();
		beach [7] = new Detailed();
		beach [8] = new Detailed();
		beach [9] = new Detailed("China", "2.23.20", "2.25.20", 118.55, 220.20, 86.25, 23.65);
		beach [10] = new Detailed("Bangkok", "4.10.20", "4.15.20", 225.80, 255.30, 78.30, 32.35);
		beach [11] = new Detailed("Peru", "2.2.20", "2.20.20", 487.20, 251.30, 56.40, 34.95);
		
		/***********************************************************
		 * Assigning price and rating for AllInclusive()
		 * *********************************************************
		 */
		((AllInclusive) beach [3]).setPrice(5034.35);
		((AllInclusive) beach [3]).setRating(4);
		
		((AllInclusive) beach [4]).setPrice(6545.35);
		((AllInclusive) beach [4]).setRating(3);
		
		((AllInclusive) beach [5]).setPrice(7453.35);
		((AllInclusive) beach [5]).setRating(4);
		
		/************************************************************
		 * Creating a loop that prints out the toString() of all
		 * of the beach objects. Some of these objects use the default
		 * classes
		 * **********************************************************
		 */
		for (int i = 0; i < beach.length; i++)
		{
			System.out.println(beach[i].toString());
		}
		
		/**********************************************************
		 * Using mutators to fill in the default classes with
		 * information and the then reprinting the objects
		 * ********************************************************
		 */

		beach [0].setDestination("Cancun");
		beach [0].setDepartureDate("4.24.20");
		beach [0].setReturnDate("4.25.20");
		((AllInclusive) beach [0]).setBrand("Go Go Jet");
		((AllInclusive) beach [0]).setRating(4);
		((AllInclusive) beach [0]).setPrice(1232.65);
		
		beach [1].setDestination("Italy");
		beach [1].setDepartureDate("8.23.20");
		beach [1].setReturnDate("8.26.20");
		((AllInclusive) beach [1]).setBrand("Big V");
		((AllInclusive) beach [1]).setRating(3);
		((AllInclusive) beach [1]).setPrice(3023.25);
		
		beach [2].setDestination("Spain");
		beach [2].setDepartureDate("2.09.20");
		beach [2].setReturnDate("2.20.20");
		((AllInclusive) beach [2]).setBrand("Go Go Vacay");
		((AllInclusive) beach [2]).setRating(5);
		((AllInclusive) beach [2]).setPrice(2503.30);
		
		beach [6].setDestination("China");
		beach [6].setDepartureDate("3.23.20");
		beach [6].setReturnDate("3.28.20");
		((Detailed)beach [6]).setHotelCost(150.55);
		((Detailed)beach [6]).setAirfareCost(246.55);
		((Detailed)beach [6]).setMealCost(130.25);
		((Detailed)beach [6]).setTransfersCost(56.90);
		
		beach [7].setDestination("Bangkok");
		beach [7].setDepartureDate("2.23.20");
		beach [7].setReturnDate("4.23.20");
		((Detailed)beach [7]).setHotelCost(543.35);
		((Detailed)beach [7]).setAirfareCost(1045.30);
		((Detailed)beach [7]).setMealCost(254.35);
		((Detailed)beach [7]).setTransfersCost(103.30);
		
		beach [8].setDestination("Peru");
		beach [8].setDepartureDate("3.20.20");
		beach [8].setReturnDate("3.25.20");
		((Detailed)beach [8]).setHotelCost(433.40);
		((Detailed)beach [8]).setAirfareCost(403.30);
		((Detailed)beach [8]).setMealCost(150.40);
		((Detailed)beach [8]).setTransfersCost(90.20);
		
		
		for (int i = 0; i < beach.length; i++)
		{
			System.out.println(beach[i].toString());
		}
		
		System.out.println();
		
		/***************************************************
		 * Uses getter methods for each object and uses the
		 * abstract method
		 * *************************************************
		 */
		
		for (int i = 0; i < beach.length; i++)
		{
			System.out.println(beach[i].getDestination() + "\n" +
			beach[i].getDepartureDate() + "\n" +
			beach[i].getReturnDate() + "\n" +
			beach[i].getTotalCost() + "\n");
			
		}

	}

}
