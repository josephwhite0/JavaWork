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
 * Creating AAS class as a child of Degree
 * and setting up private variables
 * ********************************************
 */
public class AAS extends Degree {
	
	private int AASCoreHours;
	private String track;
	private int trackHours;
	
	/********************************************************
	 * Building Constructors and validating parameters
	 * *******************************************************
	 */
	public AAS(int genEdHours, int electiveHours, int coreHours, String track, int trackHours)
	{
		degree = "AAS";
		super.setDescription(degree);
		
		if (genEdHours >= 0 && genEdHours <= 60)
		{
			this.genEdHours = genEdHours;
		}
		
		if (electiveHours >= 0 && electiveHours <= 60)
		{
			this.electiveHours = electiveHours;
		}
		
		if (coreHours >= 0 && coreHours <= 60)
		{
			this.AASCoreHours = coreHours;
		}
		
		if (trackHours >= 0 && trackHours <= 60)
		{
			this.trackHours = trackHours;
		}
		
		this.track = track;
	}
	
	/***********************
	 * Default Constructor
	 * *********************
	 */
	public AAS()
	{
		degree = "AAS";
		super.setDescription(degree);
		this.track = "";
		this.trackHours = 0;
	}
	public int getCoreHours()
	{
		return this.AASCoreHours;
	}
	
	/*********************************************************
	 * Setting up getters
	 * *******************************************************
	 */
	public String getTrack()
	{
		return track;
	}
	
	public int getTrackHours()
	{
		return this.trackHours;
	}
	
	/******************************************************
	 * Creating mutators
	 * ****************************************************
	 */
	public void setTrack(String track)
	{
		this.track = track;
	}
	
	public void addCoreHours(int hours)
	{
		if (this.AASCoreHours >= 0 && this.AASCoreHours <= 60)
		{
			this.AASCoreHours = this.AASCoreHours + hours;
		}
	}
	
	public void addTrackHours(int hours)
	{
		if (this.AASCoreHours >= 0 && this.AASCoreHours <= 60)
		{
			this.AASCoreHours = this.AASCoreHours + hours;
		}
	}
	
	/*****************************************************
	 * Setting up toString()
	 * ***************************************************
	 */
	public String toString()
	{
		return super.toString() + "\n" + "AAS Core Hours: " + this.AASCoreHours + "\n" + "Track: " + this.track + "\n" + "Track Hours: " + this.trackHours;
	}
	
	/**********************************************************
	 * Defining abstract Method
	 * ********************************************************
	 */
	public int calcTotalHours()
	{
		return super.getGenEdHours() + super.getElectiveHours() + this.AASCoreHours + this.trackHours;
	}

}
