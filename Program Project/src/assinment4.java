/*************************************************
 * Name: Joseph White
 * Date: 10.22.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This program is a variation on assignment 3
 * but now the strings will be printed on a .txt file
 * ************************************************
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class assinment4 {

	public static void main(String[] args) throws IOException {
		String s = "";
		String print = "";
		Scanner scan = new Scanner(System.in);
		StringTooLong stl = new StringTooLong("String must be less than 5 characters");
while (!s.equals("DONE"))
{
		try
		{

			PrintWriter outFile = null;
			
			outFile = new PrintWriter(new FileWriter("src/assignment3.txt"));
			
			System.out.println("Enter a string: \n");
			s = scan.nextLine();
			print = print + "\n" + s;
			outFile.println(print);

			if(outFile != null)
			{
				outFile.close();
			}
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
			System.out.println("Enter a string: \n");
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

