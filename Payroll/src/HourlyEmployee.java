//********************************************************************
//  HourlyEmployee.java
//
//  For secure coding laboratory exercise which addresses
//  potential vulnerabilities in extensibility through inheritance
//********************************************************************

public class HourlyEmployee extends EmployeePayInfo

{
   private double hoursWorked;

   //-----------------------------------------------------------------
   //  Constructor:  Establishes pay information for an hourly employee
   //   			 Primarily uses the EmployeePayInfo parent data/constructor
   //-----------------------------------------------------------------
   public HourlyEmployee (String firstName, String lastName, String officeAddress,
   			String officePhone, String socialSecurityNumber, double payRate)
   {  super (firstName, lastName, officeAddress, officePhone, socialSecurityNumber,
   			 payRate);
	  hoursWorked = 0.0;
   }

   //-----------------------------------------------------------------
   //  Adds hours worked for a given period of time to an hourly
   //  employees data
   //-----------------------------------------------------------------
   public void addHoursWorked (double moreHours)
   { 
	   if(moreHours >= 0 && moreHours <= 750)
		   {
		   hoursWorked += moreHours;  }
		   }

   //-----------------------------------------------------------------
   //  Calculates and returns pay for hourly employee and resets
   //  hours worked to zero.
   //-----------------------------------------------------------------
   public double pay()
   {  double payment = payRate * hoursWorked;
      hoursWorked = 0.0;
      return payment;
   }

   //-----------------------------------------------------------------
   //  Returns information about this hourly employee as a string.
   //-----------------------------------------------------------------
   public String toString()
   {  String result = super.toString();
      result += "\nCurrent hours: " + hoursWorked;
      return result;
   }
}
