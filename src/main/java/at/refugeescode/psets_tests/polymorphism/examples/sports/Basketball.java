package main.polymorphism.examples.sports;

public class Basketball implements Sport {
    @Override
    public String getName() {
        return "Basketball";
    }

    @Override
    public Integer getNumberOfPlayers() {
        return 10;
    }
}
