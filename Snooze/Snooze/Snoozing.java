
/**
 * Author: Joseph White
 * Date: 1.25.2020
 * Instructor: Cindy Tucker
 * Class: CIT 149
 * Purpose: Program to calculate hour many hours, days, and years you've slept
 */

import java.util.Scanner;

public class Snoozing
{
   public static void main ()
   {
       // declaration of variables
       int age = 0, hoursDay = 24, daysYear = 365; 
       float hoursSleep = 0, sleptLifeHours = 0, sleptLifeDays = 0,
       sleptLifeYears = 0;
       String myName = "";
       
       // create Scanner
       Scanner input = new Scanner (System.in);
       
       // input data
       System.out.println("Please enter your name: ");
       myName = input.nextLine();
       
       System.out.println("Please enter your age: ");
       age = input.nextInt();
       
       System.out.println("How many hourse of sleep would you say you get a night?: ");
       hoursSleep = input.nextFloat();
       
       // calculation
       sleptLifeHours = age * daysYear * hoursSleep;
       sleptLifeDays = sleptLifeHours / hoursDay;
       sleptLifeYears = sleptLifeDays / daysYear;
       
       // output
       System.out.println("You have slept " + sleptLifeYears + " years, " + sleptLifeDays + " days, and " + sleptLifeHours + " hours in your lifetime!");
      
       
       
       
    }
}
