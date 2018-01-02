package models;

import java.util.HashMap;
import java.util.Map;

public class LetterScore {
    public static Integer checkScore(char letter) {
        String onePoint = "aeioulnrst";
        String twoPoint = "dg";
        String threePoint = "bcmp";
        String fourPoint = "fhvwy";
        String fivePoint = "k";
        String eightPoint = "jx";
        String tenPoint = "qz";

        String[] points = {onePoint, twoPoint, threePoint, fourPoint, fivePoint, eightPoint, tenPoint};


        Map<Object, Integer> charValues = new HashMap<Object, Integer>();
        charValues.put(onePoint, 1);
        charValues.put(twoPoint, 2);
        charValues.put(threePoint, 3);
        charValues.put(fourPoint, 4);
        charValues.put(fivePoint, 5);
        charValues.put(eightPoint, 8);
        charValues.put(tenPoint, 10);

        for (String piece : points ) {
            if (piece.indexOf(letter) > -1){
                return charValues.get(piece);
            } else {
                continue;
            }
        }

        return 0;
    }

}
