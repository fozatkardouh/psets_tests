package main.stream.zoo;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ZooApplication {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        List<Animal> animals = zoo.getAnimals(); // Lake

        Optional<Animal> first = animals.stream() // River
                .findFirst();
        System.out.println(first.get().getName());

        Optional<Animal> any = animals.stream() // River
                .findAny();
        System.out.println(any.get().getName());

        Optional<Animal> anotherAny = animals.stream() // River
                .collect(Collectors.toSet())
                .stream()
                .findAny();
        System.out.println(anotherAny.get().getName());

        System.out.println("-------");
        animals.stream()
                .map(animal -> animal.getName())
                .filter(name -> name.startsWith("S"))
                .limit(2)
                .peek(name -> System.out.println(name))
                .map(name -> name.toUpperCase())
                .peek(name -> System.out.println(name))
                .forEach(name -> System.out.println(name));


        System.out.println("-------");
        // collect the animals that have 4 letters or less sorted alphabetically

        List<Animal> collect = animals.stream()
                .filter(animal -> animal.getName().length() <= 4)
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());
        collect.forEach(animal -> System.out.println(animal.getName()));

        System.out.println("-------");
        // join first 3 animal names that have 5 or more letters separated by -
        String names = animals.stream()
                .map(animal -> animal.getName())
                .filter(name -> name.length() >= 5)
                .sorted((e1, e2) -> e1.length() > e2.length() ? -1 : 1)
                .collect(Collectors.joining("-"));
        System.out.println(names);

        // sell all animals and each animal will cost as much as the letters of its name
        // all the money will be reduced into one variable

        Optional<Integer> price = animals.stream()
                .map(animal -> animal.getName())
                .map(name -> name.length())
                .reduce((p1, p2) -> p1 + p2);
        if (price.isPresent()) {
            System.out.println("Price of all animals: " + price.get());
        } else {
            System.out.println("Couldn't calculate the price of all animals");
        }

        // find out which animals are repeated more than once and how many times

        Map<String, Long> map = animals.stream()
                .map(animal -> animal.getName())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        // and display them
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(entry -> "animal: " + entry.getKey() + " times: " + entry.getValue())
                .forEach(line -> System.out.println(line));


    }

}
