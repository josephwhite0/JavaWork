
/*************************************************************************
 * Name: Joseph White
 * Instructor: Cindy Tucker
 * Date: 4.6.2020
 * Class: CIT 149
 * Program: This is a program that loads an array with strings in the form
 * of a deck of cards, shuffles those cards, then deals them to 4 different
 * "players"
 * ************************************************************************
 */
import java.util.Scanner;

public class twoDDeal
{
    public static void main (String[] args)
    {
        /****************************************************************
         * The array has 80 elements and is loaded with the card strings.
         * The strings are created by concatenating the rank, the colon,
         * and the suit of the card.
         * **************************************************************
         */
        
        String[] DECK = new String[80 + 1];
        
        for (int i = 1; i < DECK.length; ++i)
        {
            if (i == 1)
            {
                DECK[i] = "1" + ": " + "Dalmuti";
            }
            else if (i > 1 && i <= 3)
            {
                DECK[i] = "2" + ": " + "Archbishop";
            }
            else if (i > 3 && i <= 6)
            {
                DECK[i] = "3" + ": " + "Earl Marshal";
            }
            else if (i > 6 && i <= 10)
            {
                DECK[i] = "4" + ": " + "Baroness";
            }
            else if (i > 10 && i <= 15)
            {
                DECK[i] = "5" + ": " + "Abbess";
            }
            else if (i > 15 && i <= 21)
            {
                DECK[i] = "6" + ": " + "Knight";
            }
            else if (i > 21 && i <= 28)
            {
                DECK[i] = "7" + ": " + "Seamstress";
            }
            else if (i > 28 && i <= 36)
            {  
                DECK[i] = "8" + ": " + "Mason";
            }
            else if (i > 36 && i <= 45)
            {
                DECK[i] = "9" + ": " + "Cook";
            }
            else if (i > 45 && i <= 55)
            {
                DECK[i] = "10" + ": " + "Shepherdess";
            }
            else if (i > 55 && i <= 66)
            {
                DECK[i] = "11" + ": " + "Stonecutter";
            }
            else if (i > 66 && i <= 78)
            {
                DECK[i] = "12" + ": " + "Peasant";
            }
            else if (i > 78 && i <= 80)
            {
                DECK[i] = "13" + ": " + "Jester";
            }
        }
           
        shuffleCards(DECK);
        /********************************************************************************************
         * Created a 2 dimensional array with 4 player's hands and 20 cards in each hand
         * ******************************************************************************************
         */
        String [][] deal = new String[20][4];
        
        deal= loadCards(DECK);
        
        dealCards(deal);
        
        dealPlayer(deal);
        /************************************************************************
         * Created a loop so that the program can continue if the user wants
         * **********************************************************************
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Would to like to restart? y or n? ");
        String ans = "";
        ans = scan.nextLine();
        if (ans.equals("y"))
        {
            shuffleCards(DECK);
            deal = loadCards(DECK);
            dealCards(deal);
            dealPlayer(deal);
            System.out.println("Would you like to restart? y or n? ");
            ans = scan.nextLine();
        }
        else
        {
            System.out.println("Thank you");
        }
            
        
        
 
        
    }
    
    /******************************************************************
     * This is a static method for shuffling the deck array
     * ****************************************************************
     */
    public static void shuffleCards(String [] deck)
    {
        int n = deck.length;
        for (int i = 1; i < deck.length; ++i)
        {
           int r = i + (int)(Math.random() * (n - i));
           String temp = deck[r];
           deck[r] = deck[i];
           deck[i] = temp;
        }
        
    }
    
    /*******************************************************************
     * This is a method that loads the 2 dim array with data
     * *****************************************************************
     */
    public static String[][] loadCards(String [] deck)
    {

        String [][] DEAL = new String[20][4];
        int k = 1;
        for (int i = 0; i < DEAL.length; i++)
            for (int j = 0; j < DEAL[i].length; j++)
            {
                DEAL[i][j] = deck[k++];
            }
            return DEAL;
        }
        /************************************************
         * This is a method that prints out all 4 hands
         * **********************************************
         */
    public static void dealCards (String [][] deal)
    {        
        
        System.out.printf("%-20s", "Player1");
        System.out.printf("%-20s", "Player2");
        System.out.printf("%-20s", "Player3");
        System.out.printf("%-20s %n", "Player4");
        System.out.println("=====================================================================");
        
        
        for (int i = 0; i < deal.length; i++)
            for (int j = 0; j < deal[i].length; j++)
            {
                if (j == 3)
                {
                    System.out.printf("%-20s %n", deal[i][j]);
                }
                else
                {
                    System.out.printf("%-20s", deal[i][j]);
                }
            }
    }
    /***********************************************************************
     * This method allows a user to choose which player's hand they want to see
     * while also validating the users input so that the array stays within
     * bounds.
     * *********************************************************************
     */
    public static void dealPlayer (String [][] hand)
    {
        Scanner scan = new Scanner(System.in);
        
        int player = -1;
        System.out.println("Please enter Player: ");
        player = scan.nextInt();
        
        int j;
         while (player > 3)
         {
             System.out.println("Please enter Player: ");
             player = scan.nextInt();
            }
             if (player == 0)
             {
                 System.out.printf("%-20s %n", "Player 1");
                 System.out.printf("%-20s %n", "===============");
             }
             if (player == 1)
             {
                 System.out.printf("%-20s %n", "Player 2");
                 System.out.printf("%-20s %n", "================");
             }
             if (player == 2)
             {
                 System.out.printf("%-20s %n", "Player 3");
                 System.out.printf("%-20s %n", "===============");
                }
             if (player == 3)
             {
                 System.out.printf("%-20s %n", "Player 4");
                 System.out.printf("%-20s %n", "===============");
                }
          j = player;
        for (int i = 0; i < hand.length; i++)
         {
           
             System.out.printf("%-20s %n", hand[i][j]);
           
         }
         
        
        
            
    }
    }
    

    
    


