package main.polymorphism.calculator3.model.operator;

public interface Operator {

    String getSymbol();

    Double operate(Double number1, Double number2);

}
