package main.interfaces.newbiementalist.view;

import main.interfaces.newbiementalist.model.Card;

public class Jury {

    public void sayResult(Card card1, Card card2) {
        System.out.println("The Volunteer picked: " + card1.getName());
        System.out.println("The Mentalist picked: " + card2.getName());

        if (card1.getName().equalsIgnoreCase(card2.getName())) {
            System.out.println("The Mentalist has mental powers!");
        } else {
            System.out.println("The Mentalist is a fraud!");
        }
    }
}
