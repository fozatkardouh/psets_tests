package at.refugeescode.psets_tests.inheritance.parse;

import java.util.function.Function;

public class DishParser extends AbstractParser{

    @Override
    protected Function<String[], Object> toObject() {
        return columns -> {
            Dish dish = new Dish();
            dish.setName(columns[0]);
            dish.setType(columns[1]);
            dish.setPrice(Double.parseDouble(columns[2]));
            return dish;
        };
    }


//    private Function<String[], Dish> toDish() {
//        return columns -> {
//            Dish dish = new Dish();
//            dish.setName(columns[0]);
//            dish.setType(columns[1]);
//            dish.setPrice(Double.parseDouble(columns[2]));
//            return dish;
//        };
//    }

}
