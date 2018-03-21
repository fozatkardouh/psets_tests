package main.polymorphism.calculator3.model.operator;

public class HosamOperator implements Operator {

    HosamOperator() {
    }

    @Override
    public String getSymbol() {
        return "$";
    }

    @Override
    public Double operate(Double number1, Double number2) {
        return (number1 + number2) * 1.61;
    }
}
