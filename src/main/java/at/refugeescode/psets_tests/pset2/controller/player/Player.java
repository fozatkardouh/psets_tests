package main.opencoding.pset2.controller.player;

import main.opencoding.pset2.model.move.Move;

public interface Player {

    Move getMove();

    boolean wantsToPlayAgain();

}
