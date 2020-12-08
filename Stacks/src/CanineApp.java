 /*************************************************
 * Name: Joseph White  
 * Date: 11.03.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: Creates a stack, then prints out the
 * contents. It also prints out custom content
 * based on what is in the stack.
 * ************************************************
 */

import jsjf.ArrayStack;
import java.util.Scanner;

public class CanineApp
{


   public static void main (String[] args)
   {
	   /*************************************
	    * Creating variables
	    * ***********************************
	    */
	  String dir = "";
	  String flag = "";
	  String temp = "";
      ArrayStack<String> stack1 = new ArrayStack<String>();
      ArrayStack<String> stack2 = new ArrayStack<String>();
      Scanner scan = new Scanner(System.in);
      
     
      /************************************
       * Building the stack
       * **********************************
       */
      while (flag != "DONE")
      {
    	  System.out.println("1 = North" + "\n" + "2 = South" + "\n" + "3 = East" + "\n" + "4 = West" + "\n" + "DONE = stop");
    	  System.out.println("Please enter number that represents the direction you are going: ");
    	  temp = scan.nextLine();
    	  if (temp.equals("1"))
    	  {
    		  dir = "North";
    		  stack1.push(dir);
    		  stack2.push(dir);
    	  }
    	  else if (temp.equals("2"))
    	  {
    		  dir = "South";
    		  stack1.push(dir);
    		  stack2.push(dir);
    	  }
    	  else if (temp.equals("3"))
    	  {
    		  dir = "East";
    		  stack1.push(dir);
    		  stack2.push(dir);
    	  }
    	  else if (temp.equals("4"))
    	  {
    		  dir = "West";
    		  stack1.push(dir);
    		  stack2.push(dir);
    	  }
    	  else if (temp.equals("DONE"))
    	  {
    		  System.out.println("Thank you");
    		  flag = "DONE";
    	  }
    	  else
    	  {
    		  System.out.println("Try Again");
    	  }
      }
      
      /********************************************
       * Printing out the opposite directions to get back 
       * to where you started
       * ******************************************
       */
      System.out.println("--------------------");
      System.out.println();
      int x = stack1.size();
      System.out.println("Directions Home: ");
      for (int i = 0; i < x;i++)
      {
    	  if (stack1.peek().equals("North"))
    	  {
    		  System.out.println("South");
    		  
    	  }
    	  else if (stack1.peek().equals("South"))
    	  {
    		  System.out.println("North");
    		 
    	  }
    	  else if (stack1.peek().equals("West"))
    	  {
    		  System.out.println("East");
    		 
    	  }
    	  else if (stack1.peek().equals("East"))
    	  {
    		  System.out.println("West");
    		  
    	  }
    	  stack1.pop();
      }
      
      /**********************************
       * Prints out the quickest route
       * to the pet owner
       * ********************************
       */
      System.out.println("");
      System.out.println("---------------");
      int northBlocks = 0;
      int southBlocks = 0;
      int eastBlocks = 0;
      int westBlocks = 0;
      int block = 0;
      int block2 = 0;
      String n = "North";
      String s = "South";
      String e = "East";
      String w = "West";
      x = stack2.size();
      System.out.println("Quickest Route to Find Owner:" + "\n");
      for (int i = 0; i < x;i ++)
      {
    	 if (stack2.peek().equals("North"))
    	 {
    		 northBlocks++;
  
    	 }
    	 if (stack2.peek().equals("South"))
    	 {
    		 southBlocks++;
    		
    	 }
    	 if (stack2.peek().equals("East"))
    	 {
    		 eastBlocks++;
    		
    	 }
    	 if (stack2.peek().equals("West"))
    	 {
    		 westBlocks++;
    		 
    	 }
    	 stack2.pop();
      }
      block = northBlocks - southBlocks;
      if (block < 0)
      {
    	  System.out.println(s + " " + (block + northBlocks) + " blocks");
      }
      else if (block > 0)
      {
    	  System.out.println(n + " " + block + " blocks");
      }
      block2 = eastBlocks - westBlocks;
      if (block2 < 0)
      {
    	  System.out.println(w + " " + (block2 + eastBlocks) + " blocks");
      }
      else if (block2 > 0)
      {
    	  System.out.println(e + " " + block2 + " blocks");
      }
   }
}

