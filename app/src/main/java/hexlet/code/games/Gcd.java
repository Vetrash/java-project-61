package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Gcd {

    private static int gcdCheck(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcdCheck(num2, num1 % num2);
    };

    private static  String[] round() {
        var num1 = Random.getInRange(0, 100);
        var num2 = Random.getInRange(0, 100);
        var correctAnswer =  gcdCheck(num1, num2);
        String question = "Question: " + num1 + " " + num2;
        return new String[] {question, String.valueOf(correctAnswer)};
    }

    public static void start() {
        String rules = "Find the greatest common divisor of given numbers.";
        Engine.startGame(() -> round(), rules);
    }
}
