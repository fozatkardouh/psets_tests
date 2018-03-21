package main.optional;

import java.util.Optional;
import java.util.Random;

public class Cook {

    public Schnitzel pretendThatIMakeASchnitzel(){
        return null;
    }

    public Optional<Schnitzel> makeSchnitzel() {
        if(iAmOnHolidays()){
            return Optional.empty();
        }
        return Optional.of(new Schnitzel());
    }

    private boolean iAmOnHolidays() {
        Random randomGenerator = new Random();
        int number = randomGenerator.nextInt(10);
        return isEven(number);
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

}
