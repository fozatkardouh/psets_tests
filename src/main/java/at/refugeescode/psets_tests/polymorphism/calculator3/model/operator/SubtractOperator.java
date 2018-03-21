package main.polymorphism.calculator3.model.operator;

public class SubtractOperator implements Operator {

    SubtractOperator() {
    }

    @Override
    public String getSymbol() {
        return "-";
    }

    @Override
    public Double operate(Double number1, Double number2) {
        return number1 - number2;
    }
}
