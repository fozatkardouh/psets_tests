package main.interfaces.walkingspeeds;

public class Farah implements Hiker {
    @Override
    public void hike() {
        System.out.println("Farah - I am the fastest, haha!");
        try {
            Thread.sleep(1* 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I was there already ;)");
    }
}
