package main.polymorphism.calculator3.view;

import java.util.Scanner;

public class Keyboard {

    private Scanner scanner = new Scanner(System.in);

    public String getOperation() {
        System.out.print("Write the operation: ");
        return scanner.nextLine(); // ie. 4+5 (always 3 digits where 2nd is the operator)
    }
}
