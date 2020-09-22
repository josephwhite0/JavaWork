/*************************************************
 * Name: Joseph White   
 * Date: 09.22.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This is a program that sets up classes and
 * methods for different degrees in CIT
 * ************************************************
 */

/**********************************************
 * Creating AA class as a child of Degree
 * and setting up private variables
 * ********************************************
 */
public class AA extends Degree {
	
	private int foreignLanguageHours;
	private int AAhours;
	
	/********************************************************
	 * Building Constructors and validating parameters
	 * *******************************************************
	 */
	public AA(int genEdHours, int electiveHours, int AAhours, int foreignLanguageHours)
	{
		degree = "AA";
		super.setDescription(degree);
		
		if (genEdHours >= 0 && genEdHours <= 60)
		{
		this.genEdHours = genEdHours;
		}
		
		if (genEdHours >= 0 && genEdHours <= 60)
		{
		this.electiveHours = electiveHours;
		}
		
		if (AAhours >= 0 && genEdHours <= 60)
		{
		this.AAhours = AAhours;
		}
		
		if (foreignLanguageHours >= 0 && genEdHours <= 60)
		{
		this.foreignLanguageHours = foreignLanguageHours;
		}
	}
	
	/***********************
	 * Default Constructor
	 * *********************
	 */
	public AA()
	{
		degree = "AA";
		super.setDescription(degree);
		this.foreignLanguageHours = 0;
		this.AAhours = 0;
	}
	
	/*********************************************************
	 * Setting up getters
	 * *******************************************************
	 */
	public int getForeignLangHours()
	{
		return this.foreignLanguageHours;
	}
	
	public int getAAhours()
	{
		return this.AAhours;
	}
	
	/******************************************************
	 * Creating mutators
	 * ****************************************************
	 */
	public void addFLhours(int hours)
	{
		if (this.foreignLanguageHours >= 0 && this.foreignLanguageHours <= 60)
		{
			this.foreignLanguageHours = this.foreignLanguageHours + hours;
		}
	}
	
	public void addAAhours(int hours)
	{
		if ( this.AAhours >= 0 && this.AAhours <= 60)
		{
			this.AAhours = this.AAhours + hours;
		}
	}
	
	/*****************************************************
	 * Setting up toString()
	 * ***************************************************
	 */
	public String toString()
	{
		return super.toString() + "\n" + "AA Hours: " + this.AAhours + "\n" + "Foreign Language Hours: " + this.foreignLanguageHours;
	}
	
	/**********************************************************
	 * Defining abstract Method
	 * ********************************************************
	 */
	public int calcTotalHours()
	{
		return super.getGenEdHours() + super.getElectiveHours() + this.foreignLanguageHours + AAhours;
	}

}
