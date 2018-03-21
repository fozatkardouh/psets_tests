package main.polymorphism.calculator.controller;

public class Calculator {

    public Double calculate(String operation) {
        Double first = getFirstNumber(operation);
        Double second = getSecondNumber(operation);
        String symbol = getSymbol(operation);

        if (symbol.equals("+")) {
            return first + second;
        }

        return null;
    }

    private Double getFirstNumber(String operation) {
        String first = String.valueOf(operation.charAt(0));
        return Double.parseDouble(first);
    }

    private Double getSecondNumber(String operation) {
        String first = String.valueOf(operation.charAt(2));
        return Double.parseDouble(first);
    }

    private String getSymbol(String operation) {
        return String.valueOf(operation.charAt(1));
    }
}
