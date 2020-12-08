/*************************************************
 * Name: Joseph White
 * Date: 10.22.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This program creates an array that is filled
 * by a user. The input is a string and is converted
 * to a double. If there is a NumberFormatException
 * it will be thrown
 * ************************************************
 */

import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] num = new double[10];
		String[] input = new String[10];
		int flag = 0;
		int i = 0;

		while (flag == 0)
		{
		try
		{
		for (i = 0; i < 10; i++)
		{
			System.out.println("Please enter number: ");
			input[i] = scan.nextLine();
			num[i] = Double.parseDouble(input[i]);
			flag = 1;
		}
		}

		catch(NumberFormatException e)
		{
			System.out.println(e);
		}

		}
	
	}
}


