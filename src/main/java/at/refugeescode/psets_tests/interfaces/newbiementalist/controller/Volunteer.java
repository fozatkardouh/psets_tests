package main.interfaces.newbiementalist.controller;

import main.interfaces.newbiementalist.model.Card;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Volunteer implements Participant {

    @Override
    public Card pickUpOne(Deck deck) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick up one card among the following: ");
        show(deck);
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();
        return toCard(choice, deck);
    }

    private void show(Deck deck) {
        String cards = deck.getCards().stream()
                .map(card -> card.getName())
                .collect(Collectors.joining(", "));
        System.out.println(cards);
    }

    private Card toCard(String choice, Deck deck) {
        return deck.getCards().stream()
                .filter(card -> card.getName().equalsIgnoreCase(choice))
                .findFirst().get();
    }

}
