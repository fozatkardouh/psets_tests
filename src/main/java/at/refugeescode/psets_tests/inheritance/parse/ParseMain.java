package at.refugeescode.psets_tests.inheritance.parse;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ParseMain {

    public static void main(String[] args) {
        System.out.println("Parsing things!");


        System.out.println("Parsing dishes!");
        DishParser dishParser = new DishParser();
        String dishesFilepath = "src/oop/inheritance/parse/menu-small.csv";
        List<Dish> dishes = dishParser.asList(dishesFilepath).stream()
                .map(object -> (Dish) object)
                .collect(Collectors.toList());
        dishes.forEach(dish -> System.out.println(dish));

        System.out.println("Parsing developers!");
        DeveloperParser developerParser = new DeveloperParser();
        String developersFilepath = "src/oop/inheritance/parse/developers.csv";
        List<Developer> developers = developerParser.asList(developersFilepath).stream()
                .map(object -> (Developer) object)
                .collect(Collectors.toList());
        developers.forEach(developer -> System.out.println(developer));

        Object developer = (Object) developers.get(0);
        System.out.println("Developer class: " + developer.getClass());
        Developer theDeveloper = (Developer) developer;
        System.out.println(theDeveloper.getName());

        //showMostPopularLanguage(developers);



    }

    private static void showMostPopularLanguage(List<Developer> developers) {
        System.out.println("Which one is the most popular development language?");
        Optional<String> mostPopular = developers.stream()
                .map(developer -> developer.getStrengths())
                .flatMap(strengths -> strengths.stream())
                //.......... only strengths one by one
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(1)
                .map(entry -> entry.getKey() + " appears " + entry.getValue() + " times")
                .findFirst();
        if (mostPopular.isPresent()){
            System.out.println("Most popular: " + mostPopular.get());
        } else {
            System.out.println("There were no programming languages!");
        }
    }

}
