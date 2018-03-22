package at.refugeescode.psets_tests.pset3.controller;

import at.refugeescode.psets_tests.pset3.model.Result;
import at.refugeescode.psets_tests.pset3.model.move.Move;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class JudgeTest {

    private Judge judge = new Judge();
    private Move move1;
    private Move move2;

    @BeforeEach
    public void resetAll() {
        move1 = Mockito.mock(Move.class);
        move2 = Mockito.mock(Move.class);
    }

    @Test
    public void testMove1wins() {
        Mockito.when(move1.defeats(move2)).thenReturn(true);
        Result result = judge.getResult(move1, move2);
        makeAssertions(move1, move2, result, "Player 1 wins");
    }

    @Test
    public void testMove2wins() {
        Mockito.when(move2.defeats(move1)).thenReturn(true);
        Result result = judge.getResult(move1, move2);
        makeAssertions(move1, move2, result, "Player 2 wins");
    }

    @Test
    public void testNobodyWins() {
        Result result = judge.getResult(move1, move2);
        makeAssertions(move1, move2, result, "Nobody wins");
    }

    private void makeAssertions(Move move1, Move move2, Result result, String s) {
        assertThat(result, is(notNullValue()));
        assertThat(result.getMove1(), is(move1));
        assertThat(result.getMove2(), is(move2));
        assertThat(result.getWinner(), is(equalTo(s)));
    }

}