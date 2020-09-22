/********************************************************
 *Name: Joseph White
 *Class: CIT 149
 *Teacher: Cindy Tucker
 *Program: Class driver to test UserAccount class
 ********************************************************
 */

import java.util.Random;

public class UserAccount
{
    /*********************************************************
     * Setting userName, password, and CaesarShift as private
     * variables.
     * *******************************************************
     */
    
   private String userName;
   private String password;
   private int CaesarShift;
   
   /************************************************************
    * Creating default and validated constructors so that
    * userName can only be 8 to 16 characters and password can 
    * only be 8 to 20 characters.
    * **********************************************************
    */
   
   public UserAccount()
   {
       userName = "";
       password = "";
       CaesarShift = 0;
    }
    
   public UserAccount(String name, String pass)
   {
       if (name.length() > 7 && name.length() < 17)
       {
           userName = name;
        }
       if (pass.length() > 7  && pass.length() < 21)
       {
           password = pass;
        }
    }
    
   /***********************************************************
    * Creating accessors getUserName() and getPassword() for
    * class UserAccount.
    * *********************************************************
    */
   
   public String getUserName()
   {
       return userName;
    }
    
   public String getPassword()
   {
       return password;
    }
    
   /*****************************************************
    * Creating validated mutator setPassword() to only have
    * 8 to 20 characters for class UserAccount.
    * ***************************************************
    */
    
   public void setPassword(String pass)
   {
       if (pass.length() > 7  && pass.length() < 21)
       {
           password = pass;
        }
    }
    
   //-----------------------------------------------------------------
   //  This method uses a Caesar  to encrypt the password. 
   //  The shift amount is passed in as a parameter.
   //  It will not encrypt an already encrypted password.
   //  The Caesar cipher shift is not restricted to certain characters
   //  such as letters.  It shifts based upon ASCII codes.
   //-----------------------------------------------------------------
   
   public void encrypt(int shift)
   {

      if (CaesarShift == 0 && (shift > 0 && shift < 20))
      {
         String masked = "";
         
         for (int index = 0; index < password.length(); index++)
            masked = masked + (char)(password.charAt(index)+shift);
        
         password = masked;
         CaesarShift = shift;
      }

   }
   
   /*************************************************************
    * Creating decryption method by adjusting a negative shift and
    * resetting CaesarShift back to 0
    * ***********************************************************
    */
   
   public void decrypt()
   {
       if (CaesarShift > 0)
       {
           String unmasked = "";
           
           for(int index = 0; index < password.length(); index++)
           unmasked = unmasked + (char)(password.charAt(index)-CaesarShift);
           
           password = unmasked;
           CaesarShift = 0;
        }    
    }
   
    /**************************************************************
     * Creating boolean method isEncrypted() to return true if 
     * CaesarShift is greater than 0
     * ************************************************************
     */
    
   public boolean isEncrypted()
   {
       if (CaesarShift > 0)
       {
           return true;
       }
       else{
           return false;
       }
   }
   
   /********************************************************************
    * Creating a toString method that prints userName and password when
    * called.
    * ******************************************************************
    */
   
   public String toString()
   {
       return "User Name: \t" + userName + "\n" + "Password: \t" + password;
        
   }
    
    
    
    
    
  
}
