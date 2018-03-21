package main.polymorphism.calculator3.model.operator;

public class MultiplicationOperator implements Operator {

    MultiplicationOperator() {
    }

    @Override
    public String getSymbol() {
        return "*";
    }

    @Override
    public Double operate(Double number1, Double number2) {
        return number1 * number2;
    }

    public void goShopping() {
        System.out.println("The multiplication goes shopping");
    }
}
