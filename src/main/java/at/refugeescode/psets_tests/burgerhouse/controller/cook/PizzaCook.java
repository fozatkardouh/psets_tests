package at.refugeescode.psets_tests.burgerhouse.controller.cook;

import at.refugeescode.psets_tests.burgerhouse.model.Order;
import at.refugeescode.psets_tests.burgerhouse.model.dish.Dish;
import at.refugeescode.psets_tests.burgerhouse.model.dish.Pizza;

public class PizzaCook implements Cook {

    @Override
    public Dish cook(Order order) {
        return new Pizza(order.getName());
    }

    @Override
    public String getType() {
        return "pizza";
    }
}
