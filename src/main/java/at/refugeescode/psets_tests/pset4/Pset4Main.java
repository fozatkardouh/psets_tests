package at.refugeescode.psets_tests.pset4;

import at.refugeescode.psets_tests.pset4.controller.Airport;
import at.refugeescode.psets_tests.pset4.model.Luggage;
import at.refugeescode.psets_tests.pset4.parse.LuggageParser;

import java.util.List;

public class Pset4Main {

    private static Airport airport = new Airport();

    public static void main(String[] args) {
        airportStarter();
    }

    public static List<Luggage> airportStarter() {
        LuggageParser luggageParser = new LuggageParser();
        List<Luggage> departureLuggage = luggageParser.asList("/home/fozat/Documents/Java Development/psets_tests/src/main/java/at/refugeescode/psets_tests/pset4/data/luggage.csv");

        return airport.travel(departureLuggage);
    }

    public static List<Luggage> getRejectedLuggage() {
        return airport.getRejectedLuggage();
    }

}
