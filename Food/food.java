
/**************************************************************************************
 * Name: Joseph White
 * Instructor: Cindy Tucker
 * Date: 2.17.2020
 * Class: CIT 149
 * Program: Prints off a schedule of events and food trucks 
 * ************************************************************************************
 */

import java.util.Scanner;


public class food
{
    public static void main(String[] args)
    {
    
    
        Scanner scan = new Scanner(System.in);
    
        /******************************************************************************************************************************
         * Declaring variables. The numbers in play in this program are all single digit numbers and the days of the week will not change throughout
         * so the days of the week are final bytes while 'day' is simply a byte. 
         * ****************************************************************************************************************************
         */
        String park;
        final byte SUN;
        final byte MON;
        final byte TUES;
        final byte WED;
        final byte THURS;
        final byte FRI;
        final byte SAT;
        byte day;
        String truck1;
        String truck2;
        String truck3;
        String truck4;
        String truck5;
        String truck6;
        String truck7;
        String trivia;
        String karaoke;
       
        
        park = "Mesozoic Park";
        SUN = 1;
        MON = 2;
        TUES = 3;
        WED = 4;
        THURS = 5;
        FRI = 6;
        SAT = 7;
        day = 0;
        truck1 = "Strawberry Fields Icecream";
        truck2 = "Gyro Comes the Sun";
        truck3 = "Live and Let Fry";
        truck4 = "Take a Little Pizza My Heart";
        truck5 = "Black Dog BBQ";
        truck6 = "Wot's...Uh, the Meal";
        truck7 = "Soul Kitchen";
        trivia = "Looney Tunes";
        karaoke = "80's Hits";
     
        /****************************************************************************************************
         * Used \t for tabs and %n for new lines. Also an extra System.out.println() for white space.
         * **************************************************************************************************
         */
        System.out.printf("Welcome to " + park +"!%n" + "\t" + "We are delighted you are interested in the food trucks coming to our park and our special events.");
        System.out.println();        
        System.out.printf("Please enter a day of the week (1 for Sunday, 2 for Monday, ..., 7 for Saturday): ");
        day = scan.nextByte();
        System.out.println();
        System.out.println("Food trucks and events for the remainder of the week: ");
        System.out.println();
    
        /***********************************************************************************************************
         * Beginning of switch. By not using the break I've set it up so that by inputing 1 it will perform all
         * commands down to 7, but if 7 is the input then it will only print case 7. I set the default to print a 
         * generic error message to print if anything other than 1 - 7 is used. I used printf for formating.
         * *********************************************************************************************************
         */
        switch (day){
            
            case 1:
            System.out.printf("Sunday Night:%n" + "\t" + truck7 + "%n" + "\t" + truck1);
            System.out.println();
            
            case 2:
            System.out.printf("Monday Night:%n" + "\t" + truck6 + "%n" + "\t" + truck2);
            System.out.println();
            
            case 3:
            System.out.printf("Tuesday Night:%n" + "\t" + truck5 + "%n" + "\t" + truck3);
            System.out.println();
            System.out.printf("\t" + "SPECIAL EVENT: Trivia Night-" + trivia);
            System.out.println();
            
            case 4:          
            System.out.printf("Wednesday Night:%n" + "\t" + truck4 + "%n" + "\t" + truck1);
            System.out.println();            
            
            case 5:            
            System.out.printf("Thursday Night:%n" + "\t" + truck3 + "%n" + "\t" + truck5);
            System.out.println();
            
            case 6:
            System.out.printf("Friday Night:%n" + "\t" + truck2 + "%n" + "\t" + truck6);            
            System.out.println();
            System.out.printf("\t" + "SPECIAL EVENT: Karaoke Night-" + karaoke);
            System.out.println();
            
            case 7:
            System.out.printf("Saturday Night:%n" + "\t" + truck1 + "%n" + "\t" + truck7);
            System.out.println();
            break;
            
            default:
            System.out.println("You have entered an invalid number.");
            
        }
            
            
            
            
        
            
            
            
            
            
          
            
            
            
            
            
            
            
            
        
        
    
    
    
    
    
    
   
    
        
        
        }
}    
 


