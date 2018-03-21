package main.optional;

import java.util.Optional;

public class PizzaRestaurant {

    public Optional<Pizza> orderPizza(String type){
        if(type.equals("Fungi")){
            Pizza pizza = new Pizza("Fungi");
            return Optional.of(pizza);
        }
        return Optional.empty();
    }

}
