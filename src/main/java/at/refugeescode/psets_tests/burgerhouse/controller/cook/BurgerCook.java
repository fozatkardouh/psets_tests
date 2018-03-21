package at.refugeescode.psets_tests.burgerhouse.controller.cook;

import at.refugeescode.psets_tests.burgerhouse.model.Order;
import at.refugeescode.psets_tests.burgerhouse.model.dish.Burger;
import at.refugeescode.psets_tests.burgerhouse.model.dish.Dish;

public class BurgerCook implements Cook {

    @Override
    public Dish cook(Order order) {
        return new Burger(order.getName());
    }

    @Override
    public String getType() {
        return "burger";
    }
}
