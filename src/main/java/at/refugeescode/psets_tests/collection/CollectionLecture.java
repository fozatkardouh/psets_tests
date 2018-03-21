package at.refugeescode.psets_tests.collection;

import java.util.List;
import java.util.Set;

public class CollectionLecture {

    public static void main(String[] args) {
        NameFactory factory = new NameFactory();
        List<String> names = factory.createNames();
        if (names.isEmpty()) {
            System.out.println("I'm sorry, there are no names.");
        } else {
            System.out.println("List of names:");
        }
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("----------");
        System.out.println("Set of names:");
        Set<String> uniqueNames = factory.createUniqueNames();
        for (String name : uniqueNames) {
            System.out.println(name);
        }

        System.out.println("----------");
        System.out.println("List of a Set of names:");
        List<String> uniqueNamesAsList = factory.createUniqueNamesAsList();
        for (String name : uniqueNamesAsList) {
            System.out.println(name);
        }
    }

}
