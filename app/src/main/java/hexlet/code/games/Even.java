package hexlet.code.games;

import hexlet.code.Random;
import hexlet.code.Engine;

public class Even {

    private static final int START_RANGE_NUM = 1;
    private static final int END_RANGE_NUM = 100;

    private static  String[] round() {


        var generateNum = Random.getInRange(START_RANGE_NUM, END_RANGE_NUM);
        var isEven = generateNum % 2 == 0;
        var correctAnswer = isEven ? "yes" : "no";

        String question =  String.valueOf(generateNum);
        return new String[] {question, String.valueOf(correctAnswer)};
    }

    public static void start() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.startGame(() -> round(), rules);
    };
}


