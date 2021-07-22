
/**
 * Name: Joseph White
 * Class: CIT 149
 * Teacher: Cindy Tucker
 * Program: creating a class to use with a program driver
 * ***************************************************
 */
public class Tile
{
    /***************************************
     * Assigning color and value as private variables
     * **************************************
     */
    private String color;
    private int value;
    
    /****************************************
     * Creating constructors for class Tile
     * **************************************
     */
   
    public Tile(String tColor,int tValue)
    {
        if (tColor.equals("Blue") || tColor.equals("Green") || tColor.equals("Yellow") ||
        tColor.equals("Red"))
        {
            color = tColor;
        }
        else
        {
            color = "No Color";
        }
        if (tValue <= 13 && tValue > 0)
        {
            value = tValue;
        }
        else
        {
            value = 0;
        }
        if (value == 0)
        {
            color = "No Color";
        }
        if (color.equals("No Color"))
        {
            value = 0;
        }
    }
    
    public Tile()
    {
        color = "No Color";
        value = 0;
    }
    
    /********************************************************
     * Creating the getters for Tile
     * ***************************************************
     */
    
    public String getColor()
    {
        return color;
    }
       
    public int getValue()
    {
        return value;
    }
    
    /*****************************************************
     * Creating the setters for the class Tile
     * ***************************************************
     */
    public void setColor(String tColor)
    {
       if (tColor.equals("Blue") || tColor.equals("Green") || tColor.equals("Yellow") ||
        tColor.equals("Red"))
        {
            color = tColor;
        }
        else
        {
            color = "No Color";
            value = 0;
        }
    }
    
    public void setValue(int tValue)
    {
        if (tValue <= 13 && tValue > 0)
        {
            value = tValue;
        }
        else
        {
            value = 0;
            color = "No Color";
        }
    }
    
    /*******************************************************
     * Creating method to trade invalid tiles
     * *****************************************************
     */
    public void tradeTiles(String tColor, int tValue)
    {
        if (tColor.equals("Blue") || tColor.equals("Green") || tColor.equals("Yellow") ||
        tColor.equals("Red"))
        {
            color = tColor;
        }
        else
        {
            color = "No Color";
        }
        if (tValue <= 13 && tValue > 0)
        {
            value = tValue;
        }
        else
        {
            value = 0;
        }
        if (value == 0)
        {
            color = "No Color";
        }
        if (color.equals("No Color"))
        {
            value = 0;
        }
    }
    /******************************************************
     * Creating a toString() method to override the default 
     * ****************************************************
     */
    public String toString()
    {
        return String.format("%s %s",color,value);
    }
        
    public boolean equals(Tile checkTile)
    {
        if (checkTile == null)
            return false;
            
        if ((this.color.equals(checkTile.getColor())) && (this.value ==
        checkTile.getValue()))
            return true;
        else
            return false;
        }
    
      
    
        
        
        
    
    
  
}
