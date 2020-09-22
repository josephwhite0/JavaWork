/*************************************************
 * Name: Joseph White   
 * Date: 09.22.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This is a program that sets up classes and
 * methods for different degrees in CIT
 * ************************************************
 */


/**********************************
 * Creating Driver class
 **********************************
 */
public class BCTCDegrees {

	public static void main(String[] args) {
		
		/*****************************************************
		 * Creating AA, AS, AAS objects and filling parameters
		 * ***************************************************
		 */
		AA art = new AA(6, 5, 34, 2);
		AS science = new AS(2, 34, 5, "blood", 20);
		AAS appliedScience = new AAS(4, 45, 4, "more blood", 2);
		
		/****************************************************
		 * Testing the getDegree() method
		 * **************************************************
		 */
		System.out.println(art.getDegree());
		System.out.println(science.getDegree());
		System.out.println(appliedScience.getDegree());
		System.out.println();
		
		/***************************************************
		 * Testing the getDescription() method
		 * *************************************************
		 */
		System.out.println(art.getDescription());
		System.out.println(science.getDescription());
		System.out.println(appliedScience.getDescription());
		System.out.println();
		
		/************************************************
		 * Testing the getElectiveHours() method
		 * **********************************************
		 */
		System.out.println(art.getElectiveHours());
		System.out.println(science.getElectiveHours());
		System.out.println(appliedScience.getElectiveHours());
		System.out.println();
		
		/**************************************************
		 * Testing the toString() method
		 * ************************************************
		 */
		System.out.println(art.toString());
		System.out.println();
		System.out.println(science.toString());
		System.out.println();
		System.out.println(appliedScience.toString());
		System.out.println();
		
		/************************************************
		 * Testing the methods unique to the AA class
		 * and testing the mutators
		 * **********************************************
		 */
		System.out.println(art.getForeignLangHours());
		System.out.println(art.getAAhours());
		System.out.println(art.calcTotalHours());
		System.out.println();
		
		art.addFLhours(5);
		art.addAAhours(5);
		
		System.out.println(art.getForeignLangHours());
		System.out.println(art.getAAhours());
		System.out.println(art.calcTotalHours());
		System.out.println();
		
		/************************************************
		 * Testing the methods unique to the AS class
		 * and testing the mutators
		 * **********************************************
		 */
		System.out.println(science.getAShours());
		System.out.println(science.getFocusArea());
		System.out.println(science.getFocusHours());
		System.out.println(science.calcTotalHours());
		System.out.println();
		
		science.setFocusArea("skin");
		science.addAShours(5);
		science.addFocusHours(5);
		
		System.out.println(science.getAShours());
		System.out.println(science.getFocusArea());
		System.out.println(science.getFocusHours());
		System.out.println(science.calcTotalHours());
		System.out.println();
		
		/***********************************************
		 * Testing the methods unique to the AAS class
		 * and testing the mutators
		 * *********************************************
		 */
		System.out.println(appliedScience.getTrackHours());
		System.out.println(appliedScience.getCoreHours());
		System.out.println(appliedScience.getTrack());
		System.out.println(appliedScience.calcTotalHours());
		System.out.println();
		
		appliedScience.setTrack("more skin");
		appliedScience.addCoreHours(5);
		appliedScience.addTrackHours(5);
		
		System.out.println(appliedScience.getTrackHours());
		System.out.println(appliedScience.getCoreHours());
		System.out.println(appliedScience.getTrack());
		


	}

}
