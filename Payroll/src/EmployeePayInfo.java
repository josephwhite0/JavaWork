//********************************************************************
//  EmployeePayInfo.java
//
//
//  For secure coding laboratory exercise which addresses
//  potential vulnerabilities in extensibility through inheritance
//********************************************************************

public class EmployeePayInfo extends Employee
{
   private String socialSecurityNumber;
   protected double payRate;

   //-----------------------------------------------------------------
   //  Constructor:  Establishes pay information for an employee
   //-----------------------------------------------------------------
   public EmployeePayInfo (String firstName, String lastName, String officeAddress,
   			String officePhone, String socialSecurityNumber, double payRate)
   {  super (firstName, lastName, officeAddress, officePhone);
      this.socialSecurityNumber = socialSecurityNumber;
      if(payRate >= 0)
      {
      this.payRate = payRate;
      }
   }

   //-----------------------------------------------------------------
   //  Returns information about an employee as a string, including
   //  pay information.
   //-----------------------------------------------------------------
   public String toString()
   {  String result = super.toString();
      result += "\nSocial Security Number: " + socialSecurityNumber;
      result += "\nPay Rate: " + payRate;
      return result;
   }

   //-----------------------------------------------------------------
   //  Accessor and mutator methods for data members
   //-----------------------------------------------------------------
   public double  getPayRate()
   {  return payRate;     }
   public String getSocialSecurityNumber()
   {  return socialSecurityNumber;     }
   public void setPayRate(double payRate)
   {	this.payRate = payRate;	}



}
