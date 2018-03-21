package main.polymorphism.calculator3.model.operator;

public class DivisionOperator implements Operator {

    DivisionOperator() {
    }

    @Override
    public String getSymbol() {
        return "/";
    }

    @Override
    public Double operate(Double number1, Double number2) {
        if (number2 == 0) {
            return null;
        }
        return number1 / number2;
    }
}
