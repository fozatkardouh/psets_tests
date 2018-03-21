package main.interfaces.walkingspeeds;

public class Hosam implements Hiker {

    @Override
    public void hike() {
        System.out.println("Hosam - I start hiking.");
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I got there!");
    }

}
