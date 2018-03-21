package main.polymorphism.calculator2.view;

public class Display {

    public void display(Double result) {
        if (result == null) {
            System.out.println("Operation not permited.");
            return;
        }
        System.out.println("Result: " + result);
    }
}
