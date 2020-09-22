/*************************************************
 * Name: Joseph White   
 * Date: 09.22.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This is a program that sets up classes and
 * methods for different degrees in CIT
 * ************************************************
 */

/*********************************************
 * Creating Abstract Class Degree
 * and setting up protected variables for
 * children
 * *******************************************
 */
abstract public class Degree {

	protected String degree;
	protected String description;
	protected int genEdHours;
	protected int electiveHours;
	
	/********************************************************
	 * Building Constructors and validating parameters
	 * *******************************************************
	 */
	public Degree(String degree, int genEdHours, int electiveHours)
	{
		this.degree = degree;
		
		if (genEdHours >= 0 && genEdHours <= 60)
		{
		this.genEdHours = genEdHours;
		}
		
		if (electiveHours >= 0 && electiveHours <= 60)
		{
		this.electiveHours = electiveHours;
		}
	}
	
	/***********************
	 * Default Constructor
	 * *********************
	 */
	public Degree()
	{
		this.degree = "AS";
		this.description = "Associate in Science";
		this.genEdHours = 0;
		this.electiveHours = 0;
	}
	
	/*********************************************************
	 * Setting up getters
	 * *******************************************************
	 */
	public String getDegree()
	{
		
		return degree;
	}
	

	public String getDescription()
	{
		return this.description;
	}
	
	
	public int getGenEdHours()
	{
		return this.genEdHours;
	}
	
	public int getElectiveHours()
	{
		return this.electiveHours;
	}
	
	/******************************************************
	 * Creating mutators
	 * ****************************************************
	 */
	public void setDescription(String description)
	{
		if (description == "AA")
		{
			this.description = "Associates in Art";
		}
		
		if (description == "AS")
		{
			this.description = "Associates in Science";
		}
		
		if (description == "AAS")
		{
			this.description = "Associates in Applied Science";
		}
	}
	
	public void addGenEdHours(int hours)
	{
		if (this.genEdHours >= 0 && this.genEdHours <= 60)
		{
		this.genEdHours = this.genEdHours + hours;
		}
	}
	
	public void addElectiveHours(int hours)
	{
		if (this.electiveHours >= 0 && this.electiveHours <= 60)
		{
			this.electiveHours = this.electiveHours + hours;
		}
	
	}
	
	/*****************************************************
	 * Setting up toString()
	 * ***************************************************
	 */
	public String toString()
	{
		return "Degree: " + this.degree + "\n" + "Degree Description: " + this.description + "\n" + "Gen Ed Hours: " + this.genEdHours + "\n" + "Elective Hours: " + this.electiveHours;
	}
	
	/************************************************
	 * Setting up Abstract Method
	 * **********************************************
	 */
	public abstract int calcTotalHours();
	
	
}
