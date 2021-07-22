/************************************************************
 * Name: Joseph White
 * Class: CIT 149
 * Teacher: Cindy Tucker
 * Program: Class created with information about states derived from a .txt file
 * *********************************************************************
 */
import java.util.Calendar;

public class State
{
    /*****************************************************
     * Setting all private variables
     * ***************************************************
     */
	private String stateName;
	private String stateCapital;
	private	String stateBird;
	private String stateFlower;
	private String stateNickName;
	private String dateEnteredUnion;
	private int yearSettled;


//--------------------------------------------------
//    Constructor for the State class
//--------------------------------------------------
/************************************************************
 * Creating constructor for class and setting up validation for variable
 * yearSettled.
 * **********************************************************
 */
	public State (String stateName, String stateCapital, String stateBird, String stateFlower,
	String stateNickName, String dateEnteredUnion, int yearSettled)
	{
		this.stateName = stateName;
		this.stateCapital = stateCapital;
		this.stateBird = stateBird;
		this.stateFlower = stateFlower;
		this.stateNickName = stateNickName;
		this.dateEnteredUnion = dateEnteredUnion;
		if (yearSettled >= 1400 && yearSettled <= Calendar.getInstance().get(Calendar.YEAR))
		{
		    this.yearSettled = yearSettled;
		  }
		  else
		  {
		      this.yearSettled = 0;
		  }
		}
	/****************************************************************
	 * Created default constructor variables
	 * **************************************************************
	 */
	public State ()
	{
	       this.stateName = "";
	       this.stateCapital = "";
	       this.stateBird = "";
	       this.stateFlower = "";
	       this.stateNickName = "";
	       this.dateEnteredUnion = "";
	       this.yearSettled = 0;
	   }
//--------------------------------------------------
//    Accessors for the State class
//--------------------------------------------------

	public String getStateName()
	{	return stateName;	}

	public String getStateCapital()
	{	return stateCapital;	}

	public String getStateBird()
	{	return stateBird;	}

	public String getStateFlower()
	{	return stateFlower;	}
	
	public String getNickName()
	{      return stateNickName;   }
	
	public String getDateEnteredUnion()
	{      return dateEnteredUnion;    }
	
	public int getYearSettled()
	{      return yearSettled;     }
	

/************************************************************
 * I diabled the mutators for this class because there is no need to 
 * change any of the information. It is all being pulled from a .txt file and
 * if a change is needed it should be changed there.
 * **************************************************************
 */
//--------------------------------------------------
//    Mutators for the State class
//--------------------------------------------------

	//public void setStateName(String stateName)
	//{	this.stateName = stateName;	}

	//public void setStateCapital(String stateCapital)
	//{	this.stateCapital = stateCapital;	}

	//public void setStateBird(String stateBird)
	//{	this.stateBird = stateBird;	}

	//public void setStateFlower(String stateFlower)
	//{	this.stateFlower = stateFlower;	}
	
	//public void setNickName (String nickName)
	//{      this.stateNickName = nickName;   }
	
	//public void setDateEnteredUnion (String dateEnteredUnion)
	//{      this.dateEnteredUnion = dateEnteredUnion;   }
	
	//public void setYearSettled (int yearSettled)
	//{      
	    //if (yearSettled >= 1400 && yearSettled <= Calendar.getInstance().get(Calendar.YEAR))
		//{
		//    this.yearSettled = yearSettled;
		//  }
		
	//}

//--------------------------------------------------
//    toString() method to override method from 
//	  Object class
//--------------------------------------------------

	public String toString ()
	{ return stateName + "\t" + stateCapital;	}

}