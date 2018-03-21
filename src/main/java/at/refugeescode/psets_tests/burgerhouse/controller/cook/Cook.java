package at.refugeescode.psets_tests.burgerhouse.controller.cook;

import at.refugeescode.psets_tests.burgerhouse.model.dish.Dish;
import at.refugeescode.psets_tests.burgerhouse.model.Order;

public interface Cook {

    Dish cook(Order order);

    String getType();

}
