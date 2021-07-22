/* ************************************************************************
 * Name: Joseph White
 * Date: 2/10/2020
 * Class: CIT 149
 * Purpose: Program that prints off a receipt for popcorn
 * ************************************************************************
 */

/**************************************************************************
 * Importing Scanner, Random, and DecimalFormat class
 * ************************************************************************
 */

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;


public class Popcorn{
   public static void main (String[] args){
   
       /*****************************************************************
        * Creating new objects from the imported classes and creating the
        * format for the DecimalFormat.
        * ***************************************************************
        */
       
       Scanner scan = new Scanner (System.in);
       Random dice = new Random();
       DecimalFormat fmt1 = new DecimalFormat ("$##,##0.00");
       
       /*****************************************************************
        * Initializing variables
        * ***************************************************************
        */
       
       String dateOfPurchase;
       String firstName;
       String lastName;
       byte numOfBags;
       byte numOfDrink;
       String vendID;
       final short POPCORN;
       final byte SOFTDRINK;
       int popTotal;
       int softTotal;
       int total;
       double total2;
       int conf;
       String confirm;
       String sub1;
       String sub2;
       String sub3;
       String date;
       
       POPCORN = 450;
       SOFTDRINK = 100;
       dateOfPurchase = " ";
       firstName = " ";
       lastName = " ";
       numOfBags = 0;
       numOfDrink = 0;
       vendID = " ";
       popTotal = 0;
       softTotal = 0;
       total = 0;
       total2 = 0;
       conf = 0;
       confirm = " ";
       sub1 = " ";
       sub2 = " ";
       sub3 = " ";
       date = " ";
       
       System.out.println("Please enter the date of purchase in the MMDDYYYY format: "); 
       dateOfPurchase = scan.nextLine();
       System.out.println();
       
       System.out.println("Please enter buyer's first name: ");
       firstName = scan.nextLine();
       System.out.println();
       
       System.out.println("Please enter buyer's last name: ");
       lastName = scan.nextLine();
       System.out.println();
       
       System.out.println("Please enter the number of bags of popcorn buyer purchased: ");
       numOfBags = scan.nextByte();
       System.out.println();
       
       System.out.println("Please enter the number of soft drinks buyer purchased: ");
       numOfDrink = scan.nextByte();
       System.out.println();
       
       System.out.println("Please enter your 5-character street vender ID: ");
       
       /*****************************************************************
        * Clearing the buffer by using a blank scan.nextLine()
        * ***************************************************************
        */
       
       scan.nextLine();
       vendID = scan.nextLine();
       System.out.println();
       System.out.println();
       
       conf = dice.nextInt(3999) + 1000;
       confirm = "POPCORN#" + lastName + "#" + firstName.charAt(0) + "#" + conf + "#" + vendID;
       
       /*******************************************************************
        * Creating new string for the date using substring to add "-"
        * *****************************************************************
        */
       
       sub1 = dateOfPurchase.substring(0,2);
       sub2 = dateOfPurchase.substring(2,4);
       sub3 = dateOfPurchase.substring(4,8);
       date = sub1 + "-" + sub2 + "-" + sub3;
       System.out.println();
       
       /*******************************************************************
        * I initally had popTotal and softTotal as 'short' but it would not
        * compile that way, so I left them as 'int'.
        * *****************************************************************
        */
       
       popTotal = numOfBags * POPCORN;
       softTotal = numOfDrink * SOFTDRINK;
       total = (popTotal + softTotal);
       
       /********************************************************************
        * Casting the total as a double to create a decimal number to format.
        * Then dividing it by 100 to create dollars since we were initially using
        * pennies.
        * ******************************************************************
        */
       
       total2 = (double) total;
       total2 = total2 / 100;
       System.out.println("      **Popcorn For Sale**");
       System.out.println();
       System.out.println("      Confirmation for " + firstName + " " + lastName);
       System.out.println();
       System.out.println("      Confirmation Number: " + confirm);
       System.out.println();
       System.out.println("      Popcorn:         " + numOfBags + "@" + " $4.50 each");
       System.out.println("      Soft Drinks:     " + numOfDrink + "@" + " $1.00 each");
       System.out.println();
       System.out.println();
       System.out.println("      TOTAL: " + fmt1.format(total2));
       System.out.println();
       System.out.println("      Thanks for visiting our booth on " + date);
       
       
       
       
       
       
       
       
       
    }
}    
       
       

