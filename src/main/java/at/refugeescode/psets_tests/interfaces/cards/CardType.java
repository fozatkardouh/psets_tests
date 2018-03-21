package main.interfaces.cards;

public enum CardType {

    QUEEN_OF_HEARTS(0), KING_OF_HEARTS(1), ACE_OF_SPADES(2), TEN_OF_SPADES(3);

    private Integer number;

    CardType(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
}
