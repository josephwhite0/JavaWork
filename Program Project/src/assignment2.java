/*************************************************
 * Name: Joseph White
 * Date: 10.22.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This is a program that lets a user
 * enter a string, but if the string is too long then
 * a custom Exception will be thrown and an
 * appropriate message will be displayed.
 * ************************************************
 */
import java.util.Scanner;

public class assignment2 {
	
	public static void main(String[] args) {

	String end = "";
	String s = "";
	Scanner scan = new Scanner(System.in);
	StringTooLong stl = new StringTooLong("String must be less than 5 characters");

	try
	{
	while (end != "DONE")
	{
		System.out.println("Enter a string: ");
		s = scan.nextLine();
		if (s.length() > 5)
		{
			throw stl;
		}
	}
	}
	catch(StringTooLong e)
	{
		System.out.print(e + "\n");
	}
}
}

