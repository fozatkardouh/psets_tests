package at.refugeescode.psets_tests.pset1;

import at.refugeescode.psets_tests.pset1.model.Summary;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class Pset1MainTest {

    @Test
    void summarizer() {
        Summary result = Pset1Main.summarizer();
        String maleFemaleRatio = "64.1 %female, 35.9 %male";

        String mostAppearingGenresOne = "Drama (14495)";
        String mostAppearingGenresTwo = "Comedy (8955)";

        String mostHiredActorsOne = "Bess Flowers (82)";
        String mostHiredActorsTwo = "Christopher Lee (69)";
        String mostHiredActorsThree = "Grey Griffin (58)";
        String mostHiredActorsFour = "Danny Trejo (54)";
        String mostHiredActorsFive = "Eric Roberts (52)";

        String mostRatedMoviesOne = "Reckless (10.0)";
        String mostRatedMoviesTwo = "Girl in the Cadillac (10.0)";
        String mostRatedMoviesThree = "The Haunted World of Edward D. Wood, Jr. (10.0)";
        String mostRatedMoviesFour = "Carmen Miranda: Bananas Is My Business (10.0)";
        String mostRatedMoviesFive = "Other Voices Other Rooms (10.0)";

        Integer numberOfActors = 274570;
        Integer numberOfMovies = 29947;

        assertEquals(maleFemaleRatio, result.getMaleFemaleRatio());

        assertEquals(numberOfActors, result.getNumberOfActors());
        assertEquals(numberOfMovies, result.getNumberOfMovies());

        assertEquals(mostAppearingGenresOne, result.getMostAppearingGenres().get(0));
        assertEquals(mostAppearingGenresTwo, result.getMostAppearingGenres().get(1));

        assertEquals(mostHiredActorsOne, result.getMostHiredActors().get(0));
        assertEquals(mostHiredActorsTwo, result.getMostHiredActors().get(1));
        assertEquals(mostHiredActorsThree, result.getMostHiredActors().get(2));
        assertEquals(mostHiredActorsFour, result.getMostHiredActors().get(3));
        assertEquals(mostHiredActorsFive, result.getMostHiredActors().get(4));

        assertEquals(mostRatedMoviesOne, result.getMostRatedMovies().get(0));
        assertEquals(mostRatedMoviesTwo, result.getMostRatedMovies().get(1));
        assertEquals(mostRatedMoviesThree, result.getMostRatedMovies().get(2));
        assertEquals(mostRatedMoviesFour, result.getMostRatedMovies().get(3));
        assertEquals(mostRatedMoviesFive, result.getMostRatedMovies().get(4));
    }
}