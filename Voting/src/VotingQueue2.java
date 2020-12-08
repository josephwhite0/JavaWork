/*************************************************
 * Name: Joseph White
 * Date: 11.10.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This program creates a queue from data
 * that is inputed by a user
 * ************************************************
 */

import jsjf.CircularArrayQueue;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.Formatter;

public class VotingQueue2
{
	/*-----------------------------------------------------------------------------
	*   This program should use the Scanner class to input the number of voters arriving at a 
	*	voting precinct. There are 2 items on each line (record) in the file:
	*		(1)  A sequential car number
	*		(2)  The number of voters arriving in the car
	*	
	*
	*   This program will be used to process the voters in a queue.             
	*---------------------------------------------------------------------------------*/
   
   public static void main (String[] args) throws FileNotFoundException, IOException
   {
      /*******************************
       * creating variables
       * *****************************
       */
      CircularArrayQueue<Integer> voters = new CircularArrayQueue<Integer>();
      ArrayList<String> list = new ArrayList<String>();
      
      Scanner scan = new Scanner(System.in);
      int numberOfVoters = 0;
      int voterTime = 0;
      int voter = 0;
      int totalVoters = 0;
      Random rand = new Random();
      int voterTurn = 0;
      int randNum = 0;
      int avgTime = 0;
      int y = 1;
      int T = 0;
      int voted = 0;
      String letter = "";
      String flag = "";
      
      /************************
       * Setting up PrintWriter for
       * outfile
       * **********************
       */
      PrintWriter outFile = null;
		 outFile = new PrintWriter(new FileWriter("src/VoterReport2.txt"));
		 
		 outFile.println("Voter Report");
		 outFile.println("");
		 outFile.printf("%-25s %-25s %-25s\n","Number in line:", "Number of voters:", "Time took to vote:");
		 outFile.println("");
		 
		 /******************************
		  * Setting up loop so that user
		  * can choose different options
		  * A. add voter B. process voter
		  * C. Display and END to end program
		  * *****************************
		  */
      while(!letter.equals("END"))
      {
    	 System.out.println("Choose A, B, C, or END");
    	 System.out.println("A. Add Voters B. Process Voter C. Display");
    	 letter = scan.next();
    	 if(letter.equals("A")|letter.equals("a"))
    	 {
    		 System.out.println("Enter the number of voters: ");
    		 try
    		 {
    		 voter = scan.nextInt();
    		 
    		 }
    		 catch(Exception e){
    			 System.out.println("Try Again");
    		 }
    		 voters.enqueue(voter);
    		 totalVoters = totalVoters + voter;
    	 }
    	 if(letter.equals("B")|letter.equals("b"))
    	 {
    		 if(voters.isEmpty())
    		 {
    			 System.out.println("Please enter data");
    		 }
    		 else
    		 {
    		 int randX = rand.nextInt(901);
    		 if (randX >= 60)
    		 {
    			 randNum = randX;
    		 }
    		 voted++;
    		 voterTime = voterTime + randNum;
    		 for(int i = 0;i < voters.size();i++)
    		 {
    			 voterTurn++;
    		 outFile.printf("%-25d %-25d %25d\n", voterTurn, voters.dequeue(), randNum);
    		 }
    		 }
    		 }
    		 
    	 if(letter.equals("C")|letter.equals("c"))
    	 {
    		 avgTime = voterTime / voterTurn;
    		 System.out.printf("%-25d %-25d %-25d\n", voted, voterTime, avgTime);
    		 
    	 }
    	 if(letter.equals("END"))
    	 {
    		 System.out.printf("%-25d %-25d %-25d %-25d\n", totalVoters, voterTime, avgTime, voterTurn);
    		 if(outFile != null)
    		 {
    			 outFile.close();
    		 }
    	 }
      }

      
      
   }
}

