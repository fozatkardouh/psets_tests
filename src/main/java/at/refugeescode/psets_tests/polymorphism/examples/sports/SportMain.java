package main.polymorphism.examples.sports;

public class SportMain {

    public static void main(String[] args) {
        // ------ Sports
        Sport sportOne = new Football();
        display(sportOne);
        Sport sportTwo = new Basketball();
        display(sportTwo);
    }

    private static void display(Sport sport) {
        System.out.println("Sport one is " + sport.getName() + " and it is played by " + sport.getNumberOfPlayers() + " players");
    }

}
