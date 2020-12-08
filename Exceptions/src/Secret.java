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

import java.util.Random;

public class Secret implements Encryptable {
	
	/**************************************************
	 * Class for encryption
	 * ************************************************
	 */
	private String message;
	private boolean encrypted;
	private int shift;
	private Random generator;
	
	/**********************************
	 * Constructors
	 * ********************************
	 */
	public Secret(String msg)
	{
		message = msg;
		encrypted = false;
		generator = new Random();
		shift = generator.nextInt(10) + 5;
	}
	
	public Secret()
	{
		message = "";
		encrypted = false;
		shift = 0;
	}
	
	/*******************************
	 * encryption method
	 * *****************************
	 */
	public void encrypt()
	{
		if (!encrypted)
		{
			String masked = "";
			for (int index = 0; index < message.length(); index++)
				masked = masked + (char)(message.charAt(index) + shift);
			message = masked;
			encrypted = true;
		}
	}
	
	/******************************
	 * decryption method
	 * ****************************
	 */
	public String decrypt()
	{
		if (encrypted)
		{
			String unmasked = "";
			for(int index = 0; index < message.length(); index++)
				unmasked = unmasked + (char)(message.charAt(index) - shift);
			message = unmasked;
			encrypted = false;
		}
		
		return message;
	}
	
	public boolean isEncrypted()
	{
		return encrypted;
	}
	
	public String toString()
	{
		return message;
	}
}
