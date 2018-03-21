package main.interfaces.travelingspeeds;

import java.util.List;

public class TravelingSpeedsMain {

    public static void main(String[] args) {
        TransportationFactory factory = new TransportationFactory();
        List<Transportation> transportations = factory.getTransportations();
        transportations.forEach(e -> e.travel());
    }



}
