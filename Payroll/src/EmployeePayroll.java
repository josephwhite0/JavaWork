//********************************************************************
//  EmployeePayroll.java
//
//  For secure coding laboratory exercise which addresses
//  potential vulnerabilities in extensibility through inheritance
//********************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class EmployeePayroll
{
   //-----------------------------------------------------------------
   //  Creates an array of hourly employees, adds hours to the objects,
   //  and pays the employees.
   //
   //  Creates an array of salaried employees, adds comp time, pays
   //  the employees and pays compTime.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {     DecimalFormat fmt = new DecimalFormat("$,###,##0.00");

	     HourlyEmployee[] HourlyList = new HourlyEmployee[5];
   		 SalariedEmployee[] SalariedList = new SalariedEmployee[5];
   		 String tab = "\t";

  	     HourlyList[0] = new HourlyEmployee("Sandra", "White", "500 Main Street - Room 10B",
	           "5128391190", "415456679", 15.75);
	     HourlyList[1] = new HourlyEmployee("Benjamin", "Sanders", "500 Main Street - Room 101D",
	           "5128399978", "451442323", 21.10);
 		 HourlyList[2] = new HourlyEmployee ("Julie", "Plummer", "500 Main Street - Room 101C",
	           "5128392334", "434559900", 15.23);
	     HourlyList[3] = new HourlyEmployee ("David", "Snow", "500 Main Street - Room 11F",
	           "5128398899", "402556640", 14.20);
	     HourlyList[4] = new HourlyEmployee ("Fred", "Fortner", "500 Main Street - Room 11B",
	           "5128391119", "401800098", 17.89);
		 HourlyList[0].addHoursWorked(10.0);
		 HourlyList[1].addHoursWorked(40.0);
		 HourlyList[2].addHoursWorked(38.5);
		 HourlyList[3].addHoursWorked(39.5);
		 HourlyList[4].addHoursWorked(25.0);

	     SalariedList[0] = new SalariedEmployee ("Juan", "Gomez", "500 Main Street - Room 239",
	           "5128394409", "536882019", 8321.87);
	  	 SalariedList[1] = new SalariedEmployee ("Anita", "Francois", "500 Main Street - Room 241",
	           "5128390879", "908770009", 8411.00);
	  	 SalariedList[2] = new SalariedEmployee ("Eloise", "Harrison", "500 Main Street - Room 215",
	           "5128390879", "411209987", 7958.43);
	  	 SalariedList[3] = new SalariedEmployee ("Roberta", "O'Toole", "500 Main Street - Room 224",
	           "5128390879", "380045060", 7997.56);
	  	 SalariedList[4] = new SalariedEmployee ("Herbert", "Sawyer", "500 Main Street - Room 231",
	           "5128390879", "312000098", 8751.91);
		 SalariedList[0].addCompHours(150);
		 SalariedList[1].addCompHours(210);
		 SalariedList[2].addCompHours(175);
		 SalariedList[3].addCompHours(200);
		 SalariedList[4].addCompHours(250);


		//------------------------------------------------------
		//  Pay the Hourly Employees
		//------------------------------------------------------
		System.out.println("------Payroll----------");
		System.out.println("\n\nHourly Employees: \n");
		for (int i= 0; i< HourlyList.length; i++)
		{	double pay = HourlyList[i].pay();
			if (HourlyList[i].getFirstName().length() + HourlyList[i].getLastName().length() <= 12)
				tab = "\t\t";
			else
				tab = "\t";

			System.out.println(HourlyList[i].getFirstName() + " " + HourlyList[i].getLastName() + tab +
				"  Total Pay: \t" + fmt.format(pay));
		}

		//------------------------------------------------------
		//  Pay the Salaried  Employees
		//------------------------------------------------------
		System.out.println("\n\nSalaried Employees: \n");
		for (int i= 0; i< SalariedList.length; i++)
		{	double pay = SalariedList[i].pay();
			if (SalariedList[i].getFirstName().length() + SalariedList[i].getLastName().length() <= 14)
				tab = "\t\t";
			else
				tab = "\t";

			System.out.println(SalariedList[i].getFirstName() + " " + SalariedList[i].getLastName() + tab +
				"  Total Pay: \t" + fmt.format(pay));
		}

		//------------------------------------------------------
		//  Pay Comp Time for the Salaried  Employees
		//------------------------------------------------------
		System.out.println("\n\nSalaried Employees Comp Time: \n");
		for (int i= 0; i< SalariedList.length; i++)
		{	double compHours = SalariedList[i].getCompHours();
			double pay = SalariedList[i].payCompTime();
			if (SalariedList[i].getFirstName().length() + SalariedList[i].getLastName().length() <= 14)
				tab = "\t\t";
			else
				tab = "\t";

			System.out.println(SalariedList[i].getFirstName() + " " + SalariedList[i].getLastName() + tab +
				"Comp Hours: "  + compHours + "\tTotal Pay: \t" + fmt.format(pay));
		}
		System.out.println("\n\n");
   }
}
