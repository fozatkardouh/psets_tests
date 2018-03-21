package at.refugeescode.psets_tests.burgerhouse.controller.cook;

import at.refugeescode.psets_tests.burgerhouse.model.Order;
import at.refugeescode.psets_tests.burgerhouse.model.dish.Dessert;
import at.refugeescode.psets_tests.burgerhouse.model.dish.Dish;

public class DessertCook implements Cook {

    @Override
    public Dish cook(Order order) {
        return new Dessert(order.getName());
    }

    @Override
    public String getType() {
        return "dessert";
    }
}
