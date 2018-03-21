package main.interfaces.travelingspeeds;

public class Car implements Transportation {
    @Override
    public void travel() {
        System.out.println("The car drives");
    }
}
