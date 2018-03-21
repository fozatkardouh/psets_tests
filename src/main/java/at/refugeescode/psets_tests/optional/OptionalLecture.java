package main.optional;

import java.util.Optional;

public class OptionalLecture {

    public static void main(String[] args) {
        Cook cook = new Cook();
        Optional<Schnitzel> schnitzel = cook.makeSchnitzel();
        if (schnitzel.isPresent()) {
            schnitzel.get().eat();
            System.out.println("This restaurant is awesome.");
        } else {
            System.out.println("Where is my Schnitzel?");
        }
        System.out.println("And that was all, folks.");

        Schnitzel fakeSchnitzel = cook.pretendThatIMakeASchnitzel();
        if (fakeSchnitzel != null) {
            fakeSchnitzel.eat();
        } else {
            System.out.println("Really ??");
        }

        Schnitzel thirdSchnitzel = cook.pretendThatIMakeASchnitzel();
        try {
            thirdSchnitzel.eat();
        } catch (NullPointerException exception){
            System.out.println("Hey ! You didn't give me a third schnitzel!");
        }
    }

}
