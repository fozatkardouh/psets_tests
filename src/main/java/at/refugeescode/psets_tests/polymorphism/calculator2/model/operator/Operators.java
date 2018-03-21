package main.polymorphism.calculator2.model.operator;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// factory class
public class Operators {

    private static Set<Operator> operators = Stream.of(
            new AddOperator(),
            new SubtractOperator()
    ).collect(Collectors.toSet());


    private Operators() {
    }

    public static Optional<Operator> of(String symbol) {
        return operators.stream()
                .filter(operator -> operator.getSymbol().equals(symbol))
                .findFirst();
    }
}
