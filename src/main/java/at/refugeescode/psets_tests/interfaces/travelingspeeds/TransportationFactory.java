package main.interfaces.travelingspeeds;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransportationFactory {

    public List<Transportation> getTransportations() {
        return Stream.of(new Dolphin(), new Car(), new Bycicle())
                .collect(Collectors.toList());
    }
}
