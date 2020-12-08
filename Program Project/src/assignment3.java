/*************************************************
 * Name: Joseph White
 * Date: 10.22.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This program is a variation on assignment2
 * but instead of having the program stop, it throws 
 * the exception then continues the program until
 * user inputs "DONE"
 * ************************************************
 */

import java.util.Scanner;

public class assignment3 {

	public static void main(String[] args) {
		String s = "";
		Scanner scan = new Scanner(System.in);
		StringTooLong stl = new StringTooLong("String must be less than 5 characters");
while (!s.equals("DONE"))
{
		try
		{

			System.out.println("Enter a string: ");
			s = scan.nextLine();
			if (s.length() > 5)
			{
				throw stl;
			}
		}
		catch(StringTooLong e)
		{
			System.out.print(e + "\n");
		}
		finally
		{
			try {
			System.out.println("Enter a string: ");
			s = scan.nextLine();
			if (s.length() > 5)
			{
				throw stl;
			}
			}
			catch(StringTooLong e)
			{
				System.out.print(e);
			}
		}
		}

	}
}
