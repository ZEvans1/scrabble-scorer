import org.junit.*;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class ScrabbleScorerTest {

    @Test
    public void runScrabbleScorer_returnsScoreForSingleLetter_integer() throws Exception {
        models.ScrabbleScorer testScrabbleScorer = new models.ScrabbleScorer();
        Integer expected = 1;
        assertEquals(expected, testScrabbleScorer.runScrabbleScorer("a"));
    }

    @Test
    public void runScrabbleScorer_returnsScoreForAnyLetter_integer() throws Exception {
        models.ScrabbleScorer testScrabbleScorer = new models.ScrabbleScorer();
        Integer expected = 10;
        assertEquals(expected, testScrabbleScorer.runScrabbleScorer("q"));
    }

    @Test
    public void runScrabbleScorer_returnsScoreForMultipleLetters_integer() throws Exception {
        models.ScrabbleScorer testScrabbleScorer = new models.ScrabbleScorer();
        Integer expected = 7;
        assertEquals(expected, testScrabbleScorer.runScrabbleScorer("my"));
    }
}
