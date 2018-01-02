import org.junit.*;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class ScrabbleScorerTest {

    @Test
    public void runScrabbleScorer_returnsScoreForSingleLetter_1() throws Exception {
        models.ScrabbleScorer testScrabbleScorer = new models.ScrabbleScorer();
        Integer expected = 1;
        assertEquals(expected, testScrabbleScorer.runScrabbleScorer("a"));
    }

    @Test
    public void runScrabbleScorer_returnsScoreForAnyLetter_4() throws Exception {
        models.ScrabbleScorer testScrabbleScorer = new models.ScrabbleScorer();
        Integer expected = 10;
        assertEquals(expected, testScrabbleScorer.runScrabbleScorer("q"));
    }
}
