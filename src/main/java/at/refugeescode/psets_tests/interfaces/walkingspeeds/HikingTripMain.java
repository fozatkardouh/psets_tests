package main.interfaces.walkingspeeds;

import java.util.*;

public class HikingTripMain {

    public static void main(String[] args) {
        Hiker hosam = new Hosam();
        Hiker rami = new Rami();
        Hiker farah = new Farah();

        List<Hiker> hikers = new LinkedList<>();

        hikers.add(hosam);
        hikers.add(rami);
        hikers.add(farah);
        hikers.add(farah);

        System.out.println("Lists");
        hikers.forEach(hiker -> hiker.hike());

        Set<Hiker> uniqueHikers = new HashSet<>();
        uniqueHikers.add(hosam);
        uniqueHikers.add(rami);
        uniqueHikers.add(farah);
        uniqueHikers.add(farah);

        System.out.println("Sets");
        uniqueHikers.forEach(hiker -> hiker.hike());

//        String sentence = 9;

        System.out.println("Individual");
        Hiker hiker2 = hikers.get(2);
        hiker2.hike();

    }

}
