package at.refugeescode.psets_tests.burgerhouse.controller.cook;

import at.refugeescode.psets_tests.burgerhouse.model.Order;
import at.refugeescode.psets_tests.burgerhouse.model.dish.Dish;
import at.refugeescode.psets_tests.burgerhouse.model.dish.Salad;

public class SaladCook implements Cook {

    @Override
    public Dish cook(Order order) {
        return new Salad(order.getName());
    }

    @Override
    public String getType() {
        return "salad";
    }
}
