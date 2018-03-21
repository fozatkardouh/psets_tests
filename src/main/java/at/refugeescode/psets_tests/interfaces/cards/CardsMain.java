package main.interfaces.cards;

public class CardsMain {

    public static void main(String[] args) {

        Crupier crupier = new Crupier();
        Refree refree = new Refree();

        Deck deck = crupier.getDeck();

        Card card = crupier.getOneAtRandom(deck);

        refree.sayWhoWins(card);
    }

}
