/***************************************************************************
 * Name: Joseph White
 * Date: 02-03-2020
 * Instructor: Cindy Tucker
 * Class: CIT 149
 * Project: Learning an Easy Cipher
 * *************************************************************************
 */

import java.util.Scanner;


class Caesar
{
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner (System.in);
        
        /***************************************************************
         * First we will declare our variables. I made ssn and pin a short 
         * data type since we will only need for digits for both of them.
         * I made the cipher a constant byte CAESAR because it will always
         * be 3. I thought for a second that I could use short
         * for the encrypted and decrypted variables but quickly realized 
         * that the +3 could push the short variable too far if they used
         * 9999 for their pin or ssn.
         * *************************************************************
         */
         
        String firstName;
        String lastName;
        short ssn;
        short pin;
        final byte CAESAR;
        int encryptSsn;
        int encryptPin;
        int decryptSsn;
        int decryptPin;
        
        firstName = " ";
        lastName = " ";
        ssn = 0;
        pin = 0;
        CAESAR = 43;
        encryptSsn = 0;
        encryptPin = 0;
        decryptSsn = 0;
        decryptPin = 0;
        
        System.out.println("Please enter your first name: ");
        firstName = scan.nextLine();
        System.out.println("Please enter your last name: ");
        lastName = scan.nextLine();
        System.out.println("Please enter the last four digits of your Social Security Number: ");
        ssn = scan.nextShort();
        /****************************************************************
         * Since we haven't really gone into while loops yet I wanted to 
         * do something that showed that I was thinking about them. So
         * I made this if statement that breaks pretty easy, but it's a 
         * proof of concept to keep the user from entering anything over
         * 9999 or under 1000.
         * **************************************************************
         */
         if ((ssn > 9999) || (ssn < 1000) ) {  
             System.out.println("ERROR: Please enter the last four digits of your Social Security Number: ");
            ssn = scan.nextShort();
        }
        
        System.out.println("Please enter your four digit PIN: ");
        pin = scan.nextShort();
         if ((pin > 99999) || (pin < 10000) ) {
             System.out.println("ERROR: Please enter your four digit PIN: ");
             pin = scan.nextShort();
            }
        
            encryptSsn = ssn + CAESAR;
            encryptPin = pin + CAESAR;
            
            decryptSsn = encryptSsn - CAESAR;
            decryptPin = encryptPin - CAESAR;
            
            System.out.println("Customer:           " +firstName + " " + lastName);
            System.out.println("PIN:                " + pin);
            System.out.println("Caesar shift:       " + CAESAR);
            System.out.println("Encrypted PIN:      " + encryptPin);
            System.out.println("Encrypted SSN:      " + encryptSsn);
            System.out.println("Decrypted PIN:      " + decryptPin);
            System.out.println("Decrypted SSN:      " + decryptSsn);
          
            
           
        
        
    }
}
        
        
        
        
