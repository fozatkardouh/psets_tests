package main.interfaces.cards;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Crupier {

    public Card getOneAtRandom(Deck deck) {
        List<Card> cards = deck.getCards();
        Collections.shuffle(cards);
        Card firstCard = cards.get(0);
        return firstCard;
    }

    public Deck getDeck() {
        List<Card> cards = Stream.of(
                new QueenOfHearts(),
                new KingOfHearts(),
                new AceOfSpades(),
                new TenOfSpades())
                .collect(Collectors.toList());
        return new Deck(cards);
    }

}
