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

public class InvalidPWException extends Exception
{
/*********************************
 * Custom Exception class
 * *******************************
 */
	InvalidPWException(String message)
	{
		super(message);
	}

}

