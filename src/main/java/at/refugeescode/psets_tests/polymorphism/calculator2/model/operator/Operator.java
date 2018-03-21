package main.polymorphism.calculator2.model.operator;

public interface Operator {

    String getSymbol();

    Double operate(Double number1, Double number2);

}
