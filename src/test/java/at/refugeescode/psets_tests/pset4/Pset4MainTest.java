package at.refugeescode.psets_tests.pset4;

import at.refugeescode.psets_tests.pset4.model.Luggage;
import at.refugeescode.psets_tests.pset4.util.TimeUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class Pset4MainTest {

    @Test
    void airportStarter() {
        List<String> result = Pset4Main.airportStarter().stream().limit(2)
                .map(this::reportAccepted)
                .collect(Collectors.toList());
        assertThat("Backpack of Hosam arrived to Athens at 23:00 (local time 00:00) and waited a total of 08 hours 20 minutes", is(result.get(0)));
        assertThat("Baggage of Ismael arrived to Paris at 16:45 (local time 16:45) and waited a total of 05 hours 15 minutes", is(result.get(1)));
    }

    private String reportAccepted(Luggage luggage) {
        StringBuilder builder = new StringBuilder();
        builder.append(luggage.getType());
        builder.append(" of ");
        builder.append(luggage.getOwner());
        builder.append(" arrived to ");
        builder.append(luggage.getDestination());
        builder.append(" at ");
        builder.append(TimeUtils.formatTime(luggage.getArrivalTime()));
        builder.append(" (local time ");
        builder.append(TimeUtils.formatLocalTime(luggage.getArrivalTime(), luggage.getDestination()));
        builder.append(") and waited a total of ");
        builder.append(TimeUtils.format(luggage.getWaitingDuration()));

        return builder.toString();
    }

    @Test
    void getRejectedLuggage() {
        Pset4Main.airportStarter();
        List<String> result = Pset4Main.getRejectedLuggage()
                .stream()
                .map(this::reportRejected)
                .collect(Collectors.toList());
        assertThat("Baggage of Mohammad Alsakini arrived to the drop off 14 minutes late.", is(result.get(0)));
        assertThat("Baggage of Rami arrived to the drop off 25 minutes late.", is(result.get(1)));
    }

    private String reportRejected(Luggage luggage) {
        StringBuilder builder = new StringBuilder();
        builder.append(luggage.getType());
        builder.append(" of ");
        builder.append(luggage.getOwner());
        builder.append(" arrived to the drop off ");
        Duration interval = Duration.between(luggage.getDropOffTime(), luggage.getDepartureTime());
        long delay = interval.toMinutes();
        builder.append(delay);
        builder.append(" minutes late.");

        return builder.toString();
    }

}