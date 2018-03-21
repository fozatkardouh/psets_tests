package at.refugeescode.psets_tests.pset3.controller;

import at.refugeescode.psets_tests.pset3.controller.player.Player;
import at.refugeescode.psets_tests.pset3.controller.player.Players;
import at.refugeescode.psets_tests.pset3.model.Result;
import at.refugeescode.psets_tests.pset3.model.move.Move;
import at.refugeescode.psets_tests.pset3.view.Host;

import java.util.List;

public class RockScissorsPaperGame {

    private Host host = new Host();
    private Judge judge = new Judge();

    public void play() {
        host.welcome();
        List<Player> players = Players.getTwoPlayers();
        Player player1 = players.get(0);
        Player player2 = players.get(1);

        boolean wantToPlayAgain = true;
        while (wantToPlayAgain) {
            playOneRound(player1, player2);
            wantToPlayAgain = ask(player1, player2);
        }

        host.goodbye();
    }

    private void playOneRound(Player player1, Player player2) {
        Move move1 = player1.getMove();
        Move move2 = player2.getMove();
        Result result = judge.getResult(move1, move2);
        host.display(result);
    }

    private boolean ask(Player player1, Player player2) {
        return player1.wantsToPlayAgain() && player2.wantsToPlayAgain();
    }
}
