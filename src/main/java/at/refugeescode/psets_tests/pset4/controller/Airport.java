package at.refugeescode.psets_tests.pset4.controller;

import at.refugeescode.psets_tests.pset4.controller.travelstage.*;
import at.refugeescode.psets_tests.pset4.model.Luggage;
import at.refugeescode.psets_tests.pset4.view.SummaryReporter;

import java.util.List;
import java.util.stream.Collectors;

public class Airport {

    private SecurityControl securityControl = new SecurityControl();

    private TravelStage dropOff = new DropOffStand();
    private TravelStage storageArea = new StorageArea();
    private TravelStage transportCart = new TransportCart();
    private TravelStage flight = new Flight();
    private TravelStage luggageClaim = new LuggageClaim();

    private SummaryReporter summaryReporter = new SummaryReporter();

    public List<Luggage> travel(List<Luggage> departureLuggage) {
        List<Luggage> arrivalLuggage = departureLuggage.stream()
                .filter(luggage -> securityControl.isAllowedToTravel(luggage))
                .map(luggage -> dropOff.process(luggage))
                .map(luggage -> storageArea.process(luggage))
                .map(luggage -> transportCart.process(luggage))
                .map(luggage -> flight.process(luggage))
                .map(luggage -> transportCart.process(luggage))
                .map(luggage -> luggageClaim.process(luggage))
                .collect(Collectors.toList());

        summaryReporter.reportRejected(securityControl.getRejectedLuggage());
        summaryReporter.reportAccepted(arrivalLuggage);

        return arrivalLuggage;
    }

    public List<Luggage> getRejectedLuggage() {
        return securityControl.getRejectedLuggage();
    }

}
