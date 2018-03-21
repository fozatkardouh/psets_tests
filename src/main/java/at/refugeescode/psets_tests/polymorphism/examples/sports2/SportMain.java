package main.polymorphism.examples.sports2;


public class SportMain {

    public static void main(String[] args) {
        // ------ Sports
        Sport sportOne = new Football();
        display(sportOne);
        Basketball sportTwo = new Basketball();
        display(sportTwo);

        // Basketball also has Sport methods
        String name = sportTwo.getName();
        System.out.println("Basketball has this name: " + name);
    }

    private static void display(Sport sport) {
        System.out.println("Sport one is " + sport.getName()
                + " and it is played by " + sport.getNumberOfPlayers()
                + " players");
    }

}
