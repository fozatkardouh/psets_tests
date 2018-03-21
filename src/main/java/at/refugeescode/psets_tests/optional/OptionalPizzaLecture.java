package main.optional;

import java.util.Optional;

public class OptionalPizzaLecture {

    public static void main(String[] args) {
        PizzaRestaurant restaurant = new PizzaRestaurant();
        Optional<Pizza> pizza = restaurant.orderPizza("Fungi");
        if (pizza.isPresent()) {
            pizza.get().eat();
        }
        Optional<Pizza> anotherPizza = restaurant.orderPizza("Margarita");
        if (anotherPizza.isPresent()) {
            anotherPizza.get().eat();
        }
    }

}
