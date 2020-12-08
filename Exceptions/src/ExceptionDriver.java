/*************************************************
 * Name: Joseph White
 * Date: 10.22.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This program creates a class for a customer,
 * encrypts and decrypts their password, creates an
 * outFile report, a report on the console, creates
 * a custom exception, and counts the times thrown
 * ************************************************
 */

import java.io.*;  
import java.util.Scanner;
import javax.swing.*;
import java.util.Formatter;

public class ExceptionDriver {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		/********************************************
		 * instantiating variables
		 * ******************************************
		 */
		Scanner fileScan, lineScan;
		String str = "";
		Customer[] custData = new Customer[200];
		int i = 0;
		int num = 0;
		fileScan = new Scanner(new File("src/Customer.csv"));
		except passcheck = new except("");
		int sCount = 0;
		int cCount = 0;
		int bCount = 0;


	
		/******************************************************
		 * Creating outFile Report
		 * ****************************************************
		 */
		PrintWriter outFile = null;
		
		outFile = new PrintWriter(new FileWriter("src/CustomerReport.txt"));
		
		System.out.println("\n---Processing in Progress...Please wait...");
		
		outFile.println("Customer Report");
		outFile.println("");
		outFile.printf("%-20s %-20s %-20s %-40s %-20s %-20s %-20s\n","Customer ID","Last Name","First Name","Email","User Name","Bank Balance", "Password");
		outFile.println("");

		while (fileScan.hasNext())
		{
			/********************************************
			 * Filling custData array with data from file
			 * ******************************************
			 */
			str = fileScan.nextLine();
			//System.out.println(str);
			
			lineScan = new Scanner(str);
			lineScan.useDelimiter(",");
			custData[i] = new Customer(lineScan.next(), lineScan.next(), lineScan.next(), lineScan.next(), lineScan.next(), lineScan.nextFloat(), lineScan.next());
			i++;
		}

		fileScan = new Scanner(new File("src/Customer.csv"));
		str = "";
		while (fileScan.hasNext())
		{
			str = fileScan.nextLine();
			
			lineScan = new Scanner(str);
			lineScan.useDelimiter(",");

			outFile.printf("%-20s %-20s %-20s %-40s %-20s %-20s %-20s\n",lineScan.next(),lineScan.next(), lineScan.next(),lineScan.next(), lineScan.next(),lineScan.nextFloat(), lineScan.next());
			outFile.println("");
		}
		
		/**********************************************
		 * Checking passwords using custom exception
		 * ********************************************
		 */
		for(i = 0; i < custData.length;i++)
		{
			passcheck = new except(custData[i].getPassword());
			sCount = sCount + passcheck.getShort();
			cCount = cCount + passcheck.getComplex();
			bCount = bCount + passcheck.getBoth();
			
		}
		
		/*************************************************
		 * Creating report for console and adding exception
		 * count to outFile report
		 * ***********************************************
		 */
		System.out.printf("%-20s %-20s %-20s %-40s %-20s %-20s %-20s %-20s %-20s\n","Customer ID","Last Name","First Name","Email","User Name","Bank Balance", "Password", "Encrypted Password","Decrypted Password");
		for (i = 0; i < custData.length;i++)
		{
			System.out.printf("%-20s %-20s %-20s %-40s %-20s %-20s %-20s %-20s %-20s\n",custData[i].getCustomerID(),custData[i].getFirstName(),custData[i].getLastName(),custData[i].getEmail(),custData[i].getUserName(),custData[i].getBankBalance(),custData[i].getPassword(),custData[i].getEncPassword(),custData[i].getDecrypt());
		}
		System.out.println("Number of passwords that are too short: " + sCount);
		System.out.println("Number of passwords that are not complex: " + cCount);
		System.out.println("Number of passwords that are both too short and not complex: " + bCount);
		outFile.println("Number of passwords that are too short: " + sCount);
		outFile.println("Number of passwords that are not complex: " + cCount);
		outFile.println("Number of passwords that are both too short and not complex: " + bCount);

		if(outFile != null)
		{
			outFile.close();
		}


	}
}


