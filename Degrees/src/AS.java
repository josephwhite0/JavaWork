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
 * Creating AS class as a child of Degree
 * and setting up private variables
 * ********************************************
 */
public class AS extends Degree {
	
	private int AShours;
	private String focusArea;
	private int focusHours;
	
	/********************************************************
	 * Building Constructors and validating parameters
	 * *******************************************************
	 */
	public AS(int genEdHours, int electiveHours, int AShours, String focusArea, int focusAreaHours)
	{
		degree = "AS";
		super.setDescription(degree);
		
		if (genEdHours >= 0 && genEdHours <= 60)
		{
			this.genEdHours = genEdHours;
		}
		
		if (electiveHours >= 0 && electiveHours <= 60)
		{
			this.electiveHours = electiveHours;
		}
		
		if (AShours >= 0 && AShours <= 60)
		{
			this.AShours = AShours;
		}
		
		if (focusAreaHours >= 0 && focusAreaHours <= 60)
		{
			this.focusHours = focusAreaHours;
		}
		
		this.focusArea = focusArea;
		
	}
	
	/***********************
	 * Default Constructor
	 * *********************
	 */
	public AS()
	{
		degree = "AS";
		super.setDescription(degree);
		this.AShours = 0;
		this.focusHours = 0;
		this.focusArea = "";
		
	}
	
	/*********************************************************
	 * Setting up getters
	 * *******************************************************
	 */
	public int getAShours()
	{
		return this.AShours;
	}
	
	public String getFocusArea()
	{
		return this.focusArea;
	}
	
	public int getFocusHours()
	{
		return this.focusHours;
	}
	
	/******************************************************
	 * Creating mutators
	 * ****************************************************
	 */
	public void setFocusArea(String focus)
	{
		this.focusArea = focus;
	}
	
	public void addAShours(int hours)
	{
		if (this.AShours >= 0 && this.AShours <= 60)
		{
			this.AShours = this.AShours + hours;
		}
	}
	
	public void addFocusHours(int hours)
	{
		if (this.focusHours >= 0 && this.focusHours <= 60)
		{
			this.focusHours = this.focusHours + hours;
		}
	}
	
	/*****************************************************
	 * Setting up toString()
	 * ***************************************************
	 */
	public String toString()
	{
		return super.toString() + "\n" + "AS Hours: " + this.AShours + "\n" + "Focus: " + this.focusArea + "\n" + "Focus Hours: " + this.focusHours;
	}
	
	/**********************************************************
	 * Defining abstract Method
	 * ********************************************************
	 */
	public int calcTotalHours()
	{
		return super.genEdHours + super.electiveHours + this.AShours + this.focusHours;
	
	}
	
	

}
