package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import models.LetterScore;

public class ScrabbleScorer {
    public Integer runScrabbleScorer(String letter){
        int score = 0;

        char charLetter = letter.charAt(0);

        score += LetterScore.checkScore(charLetter);

        //input of letter "f"
        //"f" is mapped to 4
        //return 4

        //score += ;
        //score++;

        return score;
    }
}
