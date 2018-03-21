package main.optional.trust;

import main.optional.trust.door.Key;

import java.util.Optional;
import java.util.Random;

public class Sawas {

    public Optional<Key> getKey() {
        Random random = new Random();
        int number = random.nextInt(2);
        if(isEven(number)){
           return Optional.of(new Key());
        }
        return Optional.empty();
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

}
