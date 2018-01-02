package models;


public class ScrabbleScorer {
    public Integer runScrabbleScorer(String letters){
        int score = 0;

        char[] charLetters = letters.toCharArray();

        for (char letter : charLetters){
           score += LetterScore.checkScore(letter);
        }

        return score;
    }
}
