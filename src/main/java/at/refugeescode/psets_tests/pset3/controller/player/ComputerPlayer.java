package at.refugeescode.psets_tests.pset3.controller.player;

import at.refugeescode.psets_tests.pset3.model.move.Move;
import at.refugeescode.psets_tests.pset3.model.move.Moves;

import java.util.List;
import java.util.Random;

public class ComputerPlayer implements Player {

    private Random random = new Random();

    ComputerPlayer() {
    }

    @Override
    public Move getMove() {
        List<Move> moves = Moves.asList();
        int randomIndex = random.nextInt(moves.size());
        return moves.get(randomIndex);
    }

    @Override
    public boolean wantsToPlayAgain() {
        return true;
    }
}
