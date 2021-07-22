
/******************************************************************************
 * Name: Joseph White
 * Instructor: Cindy Tucker
 * Date: 2.24.2020
 * Class: CIT 149
 * Program: Prints off groupings of certain cards in a Dalmuti deck, draws a card
 *  for a user and a computer, and assigns a winner between the two
 *  ***************************************************************************
 */
import java.util.Random;

public class Dalmuti
  {
    public static void main (String[] args)
    {
        Random deal = new Random();
        /*********************************************************
         * DECK is a final byte because it is 80 and will not change
         * *******************************************************
         */
        
        final byte DECK;
        byte deckLoop;
        int userCard;
        int compCard;
        
        DECK = 80;
        userCard = 0;
        compCard = 0;
        
        /******************************************************************
         * Beginning of iterating 'for' loop that goes into the switch loop.
         * ****************************************************************
         */
        
        for(deckLoop = 1; deckLoop <= DECK; ++deckLoop)
            {
                
                
                switch (deckLoop)
                {
                    case 1: System.out.println("Card" + deckLoop + ": " + " \t" + "Dalmuti");                    
                    break;
                    case 2: System.out.print("\n"); case 3: System.out.println("Card" + deckLoop + ": " + " \t" + "Archbishop");                   
                    break;
                    case 4: System.out.print("\n"); case 5: case 6: System.out.println("Card" + deckLoop + ": " + " \t" + "Earl Marshal");                    
                    break;
                    case 7: System.out.print("\n"); case 8: case 9: case 10: System.out.println("Card" + deckLoop + ": " + " \t" + "Baroness");                    
                    break;
                    case 11: System.out.print("\n"); case 12: case 13: case 14: case 15: System.out.println("Card" + deckLoop + ": " + " \t" + "Abbess");                    
                    break;
                    case 16: System.out.print("\n"); case 17: case 18: case 19: case 20: case 21: System.out.println("Card" + deckLoop + ": " + "\t" + "Knight");                    
                    break;
                    case 22: System.out.print("\n"); case 23: case 24: case 25: case 26: case 27: case 28: System.out.println("Card" + deckLoop + ": " + "\t" + "Seamstress");                    
                    break;
                    case 29: System.out.print("\n"); case 30: case 31: case 32: case 33: case 34: case 35: case 36: System.out.println("Card" + deckLoop + ": " + "\t" + "Mason");                    
                    break;
                    case 37: System.out.print("\n"); case 38: case 39: case 40: case 41: case 42: case 43: case 44: case 45: System.out.println("Card" + deckLoop + ": " + "\t" + "Cook");                    
                    break;
                    case 46: System.out.print("\n"); case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: System.out.println("Card" + deckLoop + ": " + "\t" + "Shepherdess");                    
                    break;
                    case 56: System.out.print("\n"); case 57: case 58: case 59: case 60: case 61: case 62: case 63: case 64: case 65: case 66: System.out.println("Card" + deckLoop + ": " + "\t" + "Stonecutter");
                    break;
                    case 67: System.out.print("\n"); case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78: System.out.println("Card" + deckLoop + ": " + "\t" + "Peasant");
                    break;
                    case 79: System.out.print("\n"); case 80: System.out.println("Card" + deckLoop + ": " + "\t" + "Jester");
                    break;
                }
        
       
        
            }
            
            /**********************************************************************************
             * Card dealt to User where the number equals the rank of a card and if loops 
             * that prints out name of card 
             * ********************************************************************************
             */
            userCard = deal.nextInt(13) + 1;
            System.out.print("\n" + "User: ");
            if(userCard == 1)
            {
                System.out.print("\n" + "Dalmuti");
            }
                if(userCard == 2)
                {
                    System.out.print("\n" +"Archbishop");
                }
                    if(userCard == 3)
                    {
                        System.out.print("\n" + "Earl Marshal");
                    }
                        if(userCard == 4)
                        {
                            System.out.print("\n" + "Baroness");
                        }
                            if(userCard == 5)
                            {
                                System.out.print("\n" + "Abbess");
                            }
                                if(userCard == 6)
                                {
                                    System.out.print("\n" + "Knight");
                                }
                                    if(userCard == 7)
                                    {
                                        System.out.print("\n" + "Seamstress");
                                    }
                                        if(userCard == 8)
                                        {
                                            System.out.print("\n" + "Mason");
                                        }
                                            if(userCard == 9)
                                            {
                                                System.out.print("\n" + "Cook");
                                            }
                                                if(userCard == 10)
                                                {
                                                    System.out.print("\n" + "Shepherdress");
                                                }
                                                    if(userCard == 11)
                                                    {
                                                        System.out.print("\n" + "Stonecutter");
                                                    }
                                                        if(userCard == 12)
                                                        {
                                                            System.out.print("\n" + "Peasant");
                                                        }
                                                            if(userCard == 13)
                                                            {
                                                                System.out.print("\n" + "Joker");
                                                            }
            /**************************************************************************
             * Card dealt to computer where the number equals a card's rank and if loops 
             * that print out the name of the card. But since there is only one Dalmuti card
             * there is a while loop that has the computer draw again if both the User and
             * the computer is dealt a one
             * ************************************************************************
             */
            compCard = deal.nextInt(13) + 1;
            System.out.print("\n\n" + "Computer: ");
            while(userCard == 1 && compCard == 1)
            {
                compCard = deal.nextInt(13) + 1;
            }
            if(compCard == 1)
            {
                System.out.print("\n" + "Dalmuti");
            }
                if(compCard == 2)
                {
                    System.out.print("\n" +"Archbishop");
                }
                    if(compCard == 3)
                    {
                        System.out.print("\n" + "Earl Marshal");
                    }
                        if(compCard == 4)
                        {
                            System.out.print("\n" + "Baroness");
                        }
                            if(compCard == 5)
                            {
                                System.out.print("\n" + "Abbess");
                            }
                                if(compCard == 6)
                                {
                                    System.out.print("\n" + "Knight");
                                }
                                    if(compCard == 7)
                                    {
                                        System.out.print("\n" + "Seamstress");
                                    }
                                        if(compCard == 8)
                                        {
                                            System.out.print("\n" + "Mason");
                                        }
                                            if(compCard == 9)
                                            {
                                                System.out.print("\n" + "Cook");
                                            }
                                                if(compCard == 10)
                                                {
                                                    System.out.print("\n" + "Shepherdress");
                                                }
                                                    if(compCard == 11)
                                                    {
                                                        System.out.print("\n" + "Stonecutter");
                                                    }
                                                        if(compCard == 12)
                                                        {
                                                            System.out.print("\n" + "Peasant");
                                                        }
                                                            if(compCard == 13)
                                                            {
                                                                System.out.print("\n" + "Joker");
                                                            }
            /***************************************************************
             * If loops that prints out who is the winner or if it is a tie
             * *************************************************************
             */
            if(userCard < compCard)
            {
                System.out.println("\n\n" + "User is the winner!");
            }
            if(compCard < userCard)
            {
                System.out.println("\n\n" + "Computer is the winner!");
            }
            if(compCard == userCard)
            {
                System.out.println("\n\n" + "It's a tie!");
            }
                                                            
                                                            
    }
                                                        
  }
                                                           
                                                    
                                                
                                            
                                        
                                    
                                
                            
                        
                    
                
            
                                                
                                                        
                                                    

