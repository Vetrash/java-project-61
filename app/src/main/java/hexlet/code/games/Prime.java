package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public  class Prime {

    private static int startRangeNum = 1;
    private static int endRangeNum = 100;

    private static  String[] round() {

        var num = Random.getInRange(startRangeNum, endRangeNum);
        var correctAnswer =  isPrime(num) ? "yes" : "no";

        String question = "Question: " + num;
        return new String[] {question, String.valueOf(correctAnswer)};
    }

    public static void start() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.startGame(() -> round(), rules);
    }

    private static boolean isPrime(int num) {
        for (var n = 2; n < num; n += 1) {
            if (num % n == 0) {
                return false;
            }
        }
        return true;
    };
}
