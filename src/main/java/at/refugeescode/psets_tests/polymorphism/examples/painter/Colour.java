package main.polymorphism.examples.painter;

public interface Colour {

    // we focus on the what, not on the how
    // every class that implements Colour will be forced to implement this method
    String getName();

}
