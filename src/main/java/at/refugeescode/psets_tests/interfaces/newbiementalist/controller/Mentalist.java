package main.interfaces.newbiementalist.controller;

import main.interfaces.newbiementalist.model.Card;

import java.util.Collections;
import java.util.List;

public class Mentalist implements Participant {

    @Override
    public Card pickUpOne(Deck deck) {
        return useMentalPowersToChooseTheRightCard(deck);
    }

    private Card useMentalPowersToChooseTheRightCard(Deck deck) {
        List<Card> cards = deck.getCards();
        Collections.shuffle(cards);
        return cards.get(0);
    }
}
