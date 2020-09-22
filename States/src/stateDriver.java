
/**
 * Write a description of class stateDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.*;

public class stateDriver
{
    public static void main(String[] args) throws IOException
    {
        /*******************************************************
         * creating a Scanner to read information from a .txt file
         * and populate the information in the class array
         * *****************************************************
         */
      String fileRecord = "";
      
      Scanner fileScan, lineScan;
      
      int count = 0;
      
      State stateArray [] = new State [50];
      
      String stateName = "";
      String stateCapital = "";
      String stateBird = "";
      String stateFlower = "";
      String stateNickName = "";
      String dateEnteredUnion = "";
      int yearSettled = 0;
      
      /****************************************************
       * Telling the Scanner what file to read from
       * **************************************************
       */
      fileScan = new Scanner (new File("StateData.txt"));
      
        while (fileScan.hasNext())
        {
            fileRecord = fileScan.nextLine();
            
            lineScan = new Scanner(fileRecord);
            lineScan.useDelimiter(",");
            
            stateName = lineScan.next();
            stateCapital = lineScan.next();
            stateBird = lineScan.next();
            stateFlower = lineScan.next();
            stateNickName = lineScan.next();
            dateEnteredUnion = lineScan.next();
            yearSettled = lineScan.nextInt();
            
                stateArray[count] = new State(stateName, stateCapital, stateBird,
                stateFlower, stateNickName, dateEnteredUnion, yearSettled);
                count++;
        }
            
        System.out.printf("%-25s %-25s %-25s %n","State Name","Nickname","Date Ratified");
        
        for (int i = 0; i < count; i++)
        {
            /*******************************************************
             * printing out three pieces of data from each object in the array
             * and formatting the date of getDateEnteredUnion() from 
             * yyyy-mm-dd to mm-dd-yyyy.
             * ******************************************************
             */
            System.out.printf("%-25s %-25s %-25s %n",stateArray[i].getStateName(),stateArray[i].getNickName(),
            stateArray[i].getDateEnteredUnion().substring(5,7) + "-" + stateArray[i].getDateEnteredUnion().substring(8,10) + "-" + 
            stateArray[i].getDateEnteredUnion().substring(0,4));
        }
        /************************************************************
         * creating a counter to count the number of states settled before
         * 1675 and the number of states that have a Cardinal for a state bird.
         * **********************************************************
         */
        int counter = 0;
        
        for (int i = 0; i < count; i++)
        {
            if (stateArray[i].getYearSettled() < 1675)
            {
                counter++;
            }
        }
        
        System.out.println();
        System.out.println("Number of states settled before 1675: " + counter);
        
        counter = 0;
        for (int i = 0; i < count; i++)
        {
            if (stateArray[i].getStateBird().contentEquals("Cardinal"))
            {
                counter++;
            }
        }
        
        System.out.println();
        System.out.println("Number of states with some type of Cardinal as a state bird: " + counter);
        
        /**************************************************************
         * To find the first state settled I simply found the lowest year
         * in the array.
         * ************************************************************
         */
        String first = "";
        int year = stateArray[0].getYearSettled();
        
        for (int i = 0; i < count; i++)
        {
            if (stateArray[i].getYearSettled() < year)
            {
                year = stateArray[i].getYearSettled();
                first = stateArray[i].getStateName();
            }
        }
        
        System.out.println();
        System.out.println("First state settled: " + first + " in " + year);
                
      
    }
}
