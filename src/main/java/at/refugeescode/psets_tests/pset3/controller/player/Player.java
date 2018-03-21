package at.refugeescode.psets_tests.pset3.controller.player;

import at.refugeescode.psets_tests.pset3.model.move.Move;

public interface Player {

    Move getMove();

    boolean wantsToPlayAgain();

}
