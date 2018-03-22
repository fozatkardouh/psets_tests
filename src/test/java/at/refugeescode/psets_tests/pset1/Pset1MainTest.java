package at.refugeescode.psets_tests.pset1;

import at.refugeescode.psets_tests.pset1.model.Summary;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class Pset1MainTest {

    @Test
    void summarizer() {
        Summary result = Pset1Main.summarizer();
        String maleFemaleRatio = "64.1 %female, 35.9 %male";

        List<String> mostAppearingGenres = Arrays.asList("Drama (14495)", "Comedy (8955)");

        List<String> mostHiredActors = Arrays.asList("Bess Flowers (82)", "Christopher Lee (69)"
                , "Grey Griffin (58)", "Danny Trejo (54)", "Eric Roberts (52)");

        List<String> mostRatedMovies = Arrays.asList("Reckless (10.0)", "Girl in the Cadillac (10.0)"
                , "The Haunted World of Edward D. Wood, Jr. (10.0)", "Carmen Miranda: Bananas Is My Business (10.0)"
                , "Other Voices Other Rooms (10.0)");

        Integer numberOfActors = 274570;
        Integer numberOfMovies = 29947;

        assertEquals(maleFemaleRatio, result.getMaleFemaleRatio());
        assertEquals(numberOfActors, result.getNumberOfActors());
        assertEquals(numberOfMovies, result.getNumberOfMovies());
        assertEquals(mostAppearingGenres, result.getMostAppearingGenres());
        assertEquals(mostHiredActors, result.getMostHiredActors());
        assertEquals(mostRatedMovies, result.getMostRatedMovies());
    }

}