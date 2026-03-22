package hexlet.code.games;

import hexlet.code.Random;
import hexlet.code.Engine;

public class Even {

    private static  String[] round() {
        var generateNum = Random.getInRange(0, 100);
        var isEven = generateNum % 2 == 0;
        var correctAnswer = isEven ? "yes" : "no";

        String question = "Question: " + generateNum;
        return new String[] {question, String.valueOf(correctAnswer)};
    }

    public static void start() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.startGame(() -> round(), rules);
    };
}


