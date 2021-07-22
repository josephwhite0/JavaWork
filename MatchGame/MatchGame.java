
/****************************************************************************************
 * Name: Joseph White
 * Class: CIT 149
 * Teacher: Cindy Tucker
 * Program: Part of a tile matching game where if your three tile values match you win
 * **************************************************************************************
 */

import java.util.Random;
import java.util.Scanner;

public class MatchGame
{
    public static void main(String[] args)
    {
        Random ranNum = new Random();
        Scanner input = new Scanner(System.in);
        /*************************************************************************
         * Creation of three Tile objects: tile1, tile2, tile3
         * ***********************************************************************
         */
        Tile tile1 = new Tile();
        Tile tile2 = new Tile();
        Tile tile3 = new Tile();
        /**************************************************************
         * Declaration of variables.
         * ************************************************************
         */
        int chooserValue;
        int tileValue;
        String tileColor;
        byte cont;
        
        chooserValue = 0;
        tileValue = 0;
        tileColor = "";
        cont = -1;
        /***********************************************************************
         * Random number generated in a range of 0 to 3 and switch statement created to choose a random color
         * for the tile. 0 = Blue, 1 = Red, 2 = Yellow, and 3 = Green.
         * *********************************************************************
         */
        chooserValue = ranNum.nextInt(4);
        
        switch (chooserValue)
        {
        case 0:
            tileColor = "Blue";
            break;
        case 1:
            tileColor = "Red";
            break;
        case 2:
            tileColor = "Yellow";
            break;
        case 3:
            tileColor = "Green";
            break;
        }
        /***************************************************************************
         * Random number generated in a range of 1 to 13 to create a value for the tile.
         * *************************************************************************
         */
        tileValue = ranNum.nextInt(13) + 1;
        /***********************************************************************
         * Tile1 color and value is set through the methods created in Class Tile.
         * *********************************************************************
         */
        tile1.setColor(tileColor);
        tile1.setValue(tileValue);
        
        /*********************************************************************
         * Repeated the same process for both tile2 and tile3.
         * *******************************************************************
         */
        chooserValue = ranNum.nextInt(4);
        
        switch (chooserValue)
        {
        case 0:
            tileColor = "Blue";
            break;
        case 1:
            tileColor = "Red";
            break;
        case 2:
            tileColor = "Yellow";
            break;
        case 3:
            tileColor = "Green";
            break;
        }
        
        tileValue = ranNum.nextInt(13) + 1;
        
        tile2.setColor(tileColor);
        tile2.setValue(tileValue);
        
                 chooserValue = ranNum.nextInt(4);
        
        switch (chooserValue)
        {
        case 0:
            tileColor = "Blue";
            break;
        case 1:
            tileColor = "Red";
            break;
        case 2:
            tileColor = "Yellow";
            break;
        case 3:
            tileColor = "Green";
            break;
        }
        
        tileValue = ranNum.nextInt(13) + 1;
        
        tile3.setColor(tileColor);
        tile3.setValue(tileValue);
        /***************************************************************
         * In this game there can only be two tiles that are the same so 
         * created a while loop to make sure that tile1, tile2, and tile3
         * will never equal each other.
         * *************************************************************
         */
        while ((tile1.equals(tile2)) && (tile2.equals(tile3)))
        {
        chooserValue = ranNum.nextInt(4);
        
        switch (chooserValue)
        {
        case 0:
            tileColor = "Blue";
            break;
        case 1:
            tileColor = "Red";
            break;
        case 2:
            tileColor = "Yellow";
            break;
        case 3:
            tileColor = "Green";
            break;
        }
        
        tileValue = ranNum.nextInt(13) + 1;
        
        tile3.setColor(tileColor);
        tile3.setValue(tileValue);
    }
        /***************************************************
         * Printing out tile color and values. If the three values match then 
         * the program prints out 'You've won'.
         * *************************************************
         */
        System.out.println("Tile 1: " + tile1.toString());
        System.out.println("Tile 2: " + tile2.toString());
        System.out.println("Tile 3: " + tile3.toString());
        System.out.println();
        
        if ((tile1.getValue() == tile2.getValue()) && (tile2.getValue() == tile3.getValue()))
        {
            System.out.println("You've won!");
        }
        
        System.out.println();
        System.out.println("Would you like to play again? Enter 1 for yes or 2 for no: ");
        /************************************************************************************
         * Created while loop to make sure that input cannot be a string
         * **********************************************************************************
         */
        while (!input.hasNextByte())
        {
            System.out.println("Please try again: ");
            input.nextLine();
        }
        cont = input.nextByte();
        /***********************************************************************
         * Created a range so that you can't overload byte 'cont'.
         * *********************************************************************
         */
        
        
        if ((cont <= 0) || (cont > 2))
        {
            System.out.println("Please try again: ");
            cont = input.nextByte();
        }
        /************************************************************************
         * Created while loop so that you can continue the game as many times as you want
         * as long as you press 1 and quit the game if you press 2.
         * **********************************************************************
         */
        while (cont == 1)
        {
        chooserValue = ranNum.nextInt(4);
        
        switch (chooserValue)
        {
        case 0:
            tileColor = "Blue";
            break;
        case 1:
            tileColor = "Red";
            break;
        case 2:
            tileColor = "Yellow";
            break;
        case 3:
            tileColor = "Green";
            break;
        }
        
        tileValue = ranNum.nextInt(13) + 1;
        
        tile1.setColor(tileColor);
        tile1.setValue(tileValue);
        
        
                chooserValue = ranNum.nextInt(4);
        
        switch (chooserValue)
        {
        case 0:
            tileColor = "Blue";
            break;
        case 1:
            tileColor = "Red";
            break;
        case 2:
            tileColor = "Yellow";
            break;
        case 3:
            tileColor = "Green";
            break;
        }
        
        tileValue = ranNum.nextInt(13) + 1;
        
        tile2.setColor(tileColor);
        tile2.setValue(tileValue);
        
                 chooserValue = ranNum.nextInt(4);
        
        switch (chooserValue)
        {
        case 0:
            tileColor = "Blue";
            break;
        case 1:
            tileColor = "Red";
            break;
        case 2:
            tileColor = "Yellow";
            break;
        case 3:
            tileColor = "Green";
            break;
        }
        
        tileValue = ranNum.nextInt(13) + 1;
        
        tile3.setColor(tileColor);
        tile3.setValue(tileValue);
        
        while ((tile1.equals(tile2)) && (tile2.equals(tile3)))
        {
        chooserValue = ranNum.nextInt(4);
        
        switch (chooserValue)
        {
        case 0:
            tileColor = "Blue";
            break;
        case 1:
            tileColor = "Red";
            break;
        case 2:
            tileColor = "Yellow";
            break;
        case 3:
            tileColor = "Green";
            break;
        }
        
        tileValue = ranNum.nextInt(13) + 1;
        
        tile3.setColor(tileColor);
        tile3.setValue(tileValue);
    }
        System.out.println("Tile 1: " + tile1.toString());
        System.out.println("Tile 2: " + tile2.toString());
        System.out.println("Tile 3: " + tile3.toString());
        System.out.println();
        
        if ((tile1.getValue() == tile2.getValue()) && (tile2.getValue() == tile3.getValue()))
        {
            System.out.println("You've won!");
        }
        
        System.out.println();
        System.out.println("Would you like to play again?  Enter 1 for yes or 2 for no: ");
        
        while (!input.hasNextByte())
        {
            System.out.println("Please try again: ");
            input.nextLine();
        }
        cont = input.nextByte();
        
        if ((cont <= 0) || (cont > 2))
        {
            System.out.println("Please try again: ");
            cont = input.nextByte();
        }
    }
    
    
}
}
