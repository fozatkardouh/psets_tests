package main.optional.trust;

import main.optional.trust.door.Door;
import main.optional.trust.door.Key;

import java.util.Optional;

public class TrustMain {

    public static void main(String[] args) {
        Door door = new Door();
        Nur nur = new Nur();

        Key key = nur.getKey();

        // I DON'T TRUST YOU

        if (key != null) {
            key.open(door);
        } else {
            System.out.println("Nur didn't give me the key");
        }

        // I TRUST NOBODY
        // I HAVE TRUST ISSUES

        // YOU STILL DIDN'T OPEN THE DOOR


        Sawas sawas = new Sawas();
        Optional<Key> sawasKey = sawas.getKey();
        // LOOK, I TRUST YOU.
        if (sawasKey.isPresent()) {
            System.out.println("Sawas had the key!");
            sawasKey.get().open(door);
        } else {
            // I ALSO TRUST NUR 100%
            // even if he's a dangerous person.
            System.out.println("Sawas didn't have the key");
            key = nur.getKey();
            key.open(door);
        }
    }

}
