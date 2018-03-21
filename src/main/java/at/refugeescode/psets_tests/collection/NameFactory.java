package at.refugeescode.psets_tests.collection;

import java.util.*;

public class NameFactory {

    public List<String> createNames() {
        List<String> names = new ArrayList<>();

        names.add("Anna");
        names.add("Alex");
        names.add("Anna");
        names.add("Stefan");
        names.add("L");

        names.add("1234");
        names.remove("1234");
        names.remove("1234");

        System.out.println("I will create this many names: " + names.size());

        Collections.reverse(names);
        Collections.shuffle(names);
        Collections.sort(names);

        return names;
    }

    public Set<String> createUniqueNames(){
        Set<String> names = new HashSet<>();

        names.add("Anna");
        names.add("Alex");
        names.add("Anna");
        names.add("Anna");
        names.add("Stefan");
        names.add("L");

        names.add("1234");
        names.remove("1234");
        names.remove("1234");

        return names;
    }

    public List<String> createUniqueNamesAsList(){
        List<String> names = new ArrayList<>();

        Set<String> uniqueNames = createUniqueNames();

        names.addAll(uniqueNames);
        names.add("Anna");

        Collections.sort(names);

        return names;
    }

}
