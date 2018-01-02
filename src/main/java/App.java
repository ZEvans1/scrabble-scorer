import models.ScrabbleScorer;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word (lowercase only please):");

        try {
            String letters = bufferedReader.readLine();
            ScrabbleScorer scrabbleScorer = new ScrabbleScorer();
            System.out.println(scrabbleScorer.runScrabbleScorer(letters));
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
