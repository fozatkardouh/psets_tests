package main.stream.zoo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zoo {

    public List<Animal> getAnimals() {
        String animalNames = "Lion, Lion, Tiger, Fozat, Rat, Elephant, Rabbit, Cat, Eagle, Bear, Panda, Cammel, Horse, Giraff, Chicken, Chicken, Chicken, Hedgehog, Hedgehog, Hedgehog, Hedgehog, Spider, Canary, Snake, Steak, Donkey";
        String[] names = animalNames.split(", ");
        return Stream.of(names) // Stream<String> names
                .map(name -> new Animal(name)) // Stream<Animal> animals
                .collect(Collectors.toList()); // Collect into a list
    }


}
