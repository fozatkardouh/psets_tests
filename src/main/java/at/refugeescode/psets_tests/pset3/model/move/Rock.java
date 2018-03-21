package at.refugeescode.psets_tests.pset3.model.move;

public class Rock implements Move {

    Rock() {
    }

    @Override
    public boolean defeats(Move move) {
        return move.getClass() == Scissors.class || move.getClass() == Lizard.class;
    }

}
