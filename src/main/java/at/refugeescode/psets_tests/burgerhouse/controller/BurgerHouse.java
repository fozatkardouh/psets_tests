package at.refugeescode.psets_tests.burgerhouse.controller;

import at.refugeescode.psets_tests.burgerhouse.model.dish.Dish;
import at.refugeescode.psets_tests.burgerhouse.model.Menu;
import at.refugeescode.psets_tests.burgerhouse.model.Order;
import at.refugeescode.psets_tests.burgerhouse.view.Waiter;

import java.util.List;

public class BurgerHouse {

    private Menu menu = Management.getMenu();
    private Waiter waiter = new Waiter(menu);
    private KitchenManager kitchenManager = new KitchenManager();

    public void visit() {
        // showMenu the menu -- we need one menu
        // write oders -- waiter is giving us a list of orders
        // give orders to kitchen manager -- he gives us back a list of dishes
        // display dishes -- waiter displays the dishes


        waiter.showMenu();
        List<Order> orders = waiter.getOders();
        List<Dish> dishes = kitchenManager.cook(orders);
        waiter.show(dishes);
    }
}
