package main.polymorphism.examples.sports;

public class Football implements Sport {
    @Override
    public String getName() {
        return "Football";
    }

    @Override
    public Integer getNumberOfPlayers() {
        return 22;
    }
}
