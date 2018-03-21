package at.refugeescode.psets_tests.pset3.controller.player;

import java.util.Arrays;
import java.util.List;

public class Players {

    private Players() {
    }

    public static List<Player> getTwoPlayers() {
        return Arrays.asList(new HumanPlayer(), new ComputerPlayer());
    }
}
