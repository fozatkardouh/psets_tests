package main.interfaces.newbiementalist.controller;

import main.interfaces.newbiementalist.model.AceOfSpades;
import main.interfaces.newbiementalist.model.Card;

public class SawasMentalist implements Participant {

    @Override
    public Card pickUpOne(Deck deck) {
        AceOfSpades aceOfSpades = new AceOfSpades();
        boolean thereIsAnAceOfSpades = deck.getCards().stream()
                .anyMatch(card -> card.getName().equalsIgnoreCase(aceOfSpades.getName()));

        if (thereIsAnAceOfSpades) {
            return aceOfSpades;
        }
        return deck.getCards().get(0);
    }
}
