
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
public class DalmutiDeal
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
       
        dealCards(DECK);
       
        
        
 
        
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
     * This is a method that deals the out the deck to each player, one at
     * a time, until all the cards have been dealt.
     * *****************************************************************
     */
    public static void dealCards(String [] deck)
    {
        System.out.printf("%-20s", "Player1");
        System.out.printf("%-20s", "Player2");
        System.out.printf("%-20s", "Player3");
        System.out.printf("%-20s %n", "Player4");
        System.out.println("=====================================================================");
        
        
        /***************************************************************
         * This is a loop within a loop to automate dealing out four cards
         * then going to the next line
         * *************************************************************
         */
        int k = 1;
        
           for (int i = 1; i < deck.length; ++i)
            for (int j = 0; j < 4; ++j)
            {
                if (k > 80)
                {
                    break;
                }
                if (j <= 2)
                {
                    System.out.printf("%-20s",deck[k]);
                    k = ++k;
                }
                else if (j == 3)
                {
                    System.out.printf(deck[k] + "\n");
                    k = ++k;
                }
                
            }
           
    }
}

