/*************************************************
 * Name: Joseph White  
 * Date: 10.08.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This program streams in data from an 
 * encrypted file, stores the data in an array, and
 * then counts the frequency of each letter instance
 * in the data.
 * ************************************************
 */

import java.io.*;


public class Frequency {
/*********************************
 * initiating the IO streaming objects and the array to hold the data
**********************************
 */
	public static void main(String[] args) throws IOException {
		BufferedReader inFile = null;
		PrintWriter outFile = null;
		String x = "";
		String[] data = new String[3000];
		int i = 0;

		
		/***************************************************
		 * data is streaming in and stored in array
		 * *************************************************
		 */
		try
		{
			inFile = new BufferedReader(new FileReader("src/Encrypted.csv"));
			outFile = new PrintWriter(new FileWriter("src/Decrypted.csv"));
			
				String readData;
				
				System.out.println("---OUTPUT FILE BEING PRODUCED---\n");
				
				while ((readData = inFile.readLine()) != null)
				{
					data[i] = readData;
					i++;
					outFile.println(readData);
					//System.out.println("Line of output: " + readData);
					
					
					
					
				}
		}
		/*****************************************************
		 * When finished streaming data the IO is closed
		 * ***************************************************
		 */
		finally
		{
			System.out.println("\n\n---PROCESSING COMPLETED---\n");
			System.out.println("Open Decrypted.csv to see the new file\n\n");
			
			if (inFile != null)
			{
				inFile.close();
			}
			if (outFile != null)
			{
				outFile.close();
			}
		}
		/**************************************
		 * Here I store the array into a single string
		 * ************************************
		 */
		for (i = 0; i < data.length;i++)
		{
			x = x + "\n" + data[i];
		}
		
/*****************************************
 * counting and displaying the frequency of 
 * letters
 * ***************************************
 */

char[] c = x.toCharArray();
int sz = c.length;
int j = 0, counter = 0;

for(i = 0 + 1; i < sz; ++i)
{
	counter = 0;
	for(j = 0; j < sz; ++j)
	{
		if (j < i && c[i] == c[j])
		{
			break;
		}
		if (c[j] == c[i])
		{
			counter++;
		}
		if (j == sz-1)
		{
			System.out.println(c[i] + "-" + counter);
		}
	}
}

}
}







