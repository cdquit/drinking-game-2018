/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handin;

/**
 *
 * @author jmm4115
 */
public class DrinkingGame {
    public static void main(String[] args)
    {
        Deck drinkingDeck = new Deck(true);
        
        drinkingDeck.shuffle();
        
        int player1Count = 0;
        int player2Count = 0;

        while (drinkingDeck.hasCardsRemaining())
        {
            Card player1Card = drinkingDeck.drawCard();
            Card player2Card = drinkingDeck.drawCard();

            System.out.println("Player 1 draws [" + player1Card + "]");
            System.out.println("Player 2 draws [" + player2Card + "]");

            if (player1Card.compareTo(player2Card) < 0)
            {
                System.out.print("Player 1 ");
                player1Count++;
            }
            else
            {
                System.out.print("Player 2 ");
                player2Count++;
            }

            System.out.println("must SHOT!!!!\n");
        }
        
        System.out.println("Total Shots: player 1 = " + player1Count + " and " + "player 2 = " + player2Count);
    }
}
