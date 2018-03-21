package main.interfaces.cards;

import java.util.HashMap;
import java.util.Map;

public class Refree {

    private Map<CardType, String> winningResults;

    public Refree() {
        this.winningResults = new HashMap<>();
        winningResults.put(CardType.QUEEN_OF_HEARTS, "Yazan");
        winningResults.put(CardType.KING_OF_HEARTS, "Sadra");
        winningResults.put(CardType.ACE_OF_SPADES, "L");
    }

    public void sayWhoWins(Card card) {
        CardType name = card.getName();
        System.out.println("Refree - the card is: " + name);
        String winner = winningResults.get(name);
        if (winner == null) {
            System.out.println("Nobody wins...");
            return;
        }
        System.out.println(winner + " wins!");
        System.out.println("The card number is: " + card.getName().getNumber());
    }

}
