package main.interfaces.walkingspeeds;

public class Rami implements Hiker {

    @Override
    public void hike() {
        System.out.println("Rami - I want to walk.");
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I got there, yay!");
    }

}
