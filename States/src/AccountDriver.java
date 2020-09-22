
/********************************************************
 *Name: Joseph White
 *Class: CIT 149
 *Teacher: Cindy Tucker
 *Program: Class driver to test UserAccount class
 ********************************************************
 */
import java.util.Scanner;

public class AccountDriver
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       
       String userName = "";
       String password = "";
       
       System.out.println("Welcome. This is a test driver for the class UserAccount. First we will test the constructor. This will test for three different users.");
       System.out.println();
       
       /********************************************************
        * Created a loop so that the constructor can be tested
        * three times.
        * ******************************************************
        */
       
       for (int i = 0; i < 3 ; i++)
       {
       System.out.println("Please enter your user name (min: 8 characters, max 16 characters): ");
       userName = scan.nextLine();
       System.out.println();
       System.out.println("Next enter your password (min: 8 characters, max 20 characters): ");
       password = scan.nextLine();
       System.out.println();
       UserAccount user1 = new UserAccount(userName, password);
       System.out.println(user1.toString());
       System.out.println();
       }
       
       /*********************************************************
        * Testing accessors by printing out using getUserName()
        * and getPassword()
        * *******************************************************
        */
       
       System.out.println();
       System.out.println("Next we will be testing the accessors.");
       System.out.println();
       userName = "John Smith";
       password = "Zab98W55k";
       UserAccount user1 = new UserAccount(userName, password);
       System.out.println(user1.getUserName());
       System.out.println(user1.getPassword());
       
       /*******************************************************
        * Testing the mutator setPassword() by creating a new 
        * password.
        * *****************************************************
        */
       
       System.out.println();
       System.out.println("Next we will be testing the mutators.");
       System.out.println();
       System.out.println("Please enter a new password for John Smith (min: 8 char, max 20 char): ");
       user1.setPassword(scan.nextLine());
       System.out.println("The new password is: \n" + user1.getPassword());
       
       /*******************************************************
        * Testing the encryption method.
        * *****************************************************
        */
       
       System.out.println();
       System.out.println("Next we will be testing the encryption method.");
       System.out.println();
       System.out.println(user1.toString());
       System.out.println();
       user1.encrypt(3);
       System.out.println(user1.toString());
       System.out.println();
       user1.encrypt(4);
       System.out.println(user1.toString());
       
       /***********************************************************
        * Testing the decryption method and the isEncrypted() method.
        * *********************************************************
        */
       
       System.out.println();
       System.out.println("Finally we will be testing the decryption method.");
       System.out.println();
       userName = "Sally McIntosh";
       password = "B1N8hop10";
       UserAccount user2 = new UserAccount(userName, password);
       System.out.println("Before Encryption: \n" + user2.toString());
       user2.encrypt(3);
       System.out.println("After Encryption: \n" + user2.toString());
       System.out.println("Encryption Status: \n" + user2.isEncrypted());
       user2.decrypt();
       System.out.println("After Decryption: \n" + user2.toString());
       user2.decrypt();
       System.out.println("After Decryption: \n" + user2.toString());
       System.out.println("Encryption Status: \n" + user2.isEncrypted());
       System.out.println();
       System.out.println("TESTING COMPLETE");
       
       
       
      
       
       
       
       
       
       
       
   }
    
}
