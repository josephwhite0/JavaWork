/*************************************************
 * Name: Joseph White
 * Date: 11.10.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This program creates a queue from data
 * scanned from a file and then outputs the data into
 * a report
 * ************************************************
 */


import jsjf.CircularArrayQueue;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.Formatter;

public class VotingQueue
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
	   /************************************************
	    * Created variables
	    * **********************************************
	    */
      CircularArrayQueue<String> queue = new CircularArrayQueue<String>();
      CircularArrayQueue<String> voters = new CircularArrayQueue<String>();
      ArrayList<String> list = new ArrayList<String>();
      
      Scanner scan = new Scanner(new File("src/Voters.csv"));
      int numberOfVoters = 0;
      int voterTime = 0;
      int totalVoters = 0;
      Random rand = new Random();
      int voterTurn = 1;
      int randNum = 0;
      int avgTime = 0;
      int y = 1;
      int T = 0;
      
      /*************************************
       * setting up PrintWriter for the outFile
       * ***********************************
       */
      PrintWriter outFile = null;
		 outFile = new PrintWriter(new FileWriter("src/VoterReport.txt"));
		 
		 outFile.println("Voter Report");
		 outFile.println("");
		 outFile.printf("%-25s %-25s %-25s\n","Number in line:", "Number of voters:", "Time took to vote:");
		 outFile.println("");
		 
		 /*************************************
		  * reading data from file
		  * ***********************************
		  */
      while(scan.hasNext())
      {
    	 
    	 String lineRead = scan.next();
    	 
    	 if (lineRead.length() > 0)
    	 {
    		 String[] values = lineRead.split(",");
    		 queue.enqueue(values[1]);
    	 }
    	 
    	 
    	 
    	 while (!queue.isEmpty())
    	 {
    		 String val = queue.dequeue();
    		 voters.enqueue(val);
    	 }
    	 for(int i = 0;i < voters.size();i++)
    	 {
    		 int randX = rand.nextInt(901);
    		 if (randX >= 60)
    	      {
    			 
    			 for(int j = 0; j< voters.size();j++)
    	    	  randNum = randX;
 
    	      }
    		 numberOfVoters = Integer.parseInt(voters.dequeue());
    		 totalVoters = totalVoters + numberOfVoters;
    		 outFile.printf("%-25d %-25d %-25d\n", y, numberOfVoters, randNum);
    		 y++;
    		 T = T + randNum;
    	 }
    	 avgTime = T/y;
    	 

    	 

     } 
      	outFile.println("");
    	 outFile.printf("%-25s %-25s %-25s\n", "Total Voters", "Total Time", "Average Time");
    	 outFile.printf("%-25d %-25d %-25d\n", totalVoters, T, avgTime);
      if(outFile != null)
    	 {
    		 outFile.close();
    	 }
   }
}
