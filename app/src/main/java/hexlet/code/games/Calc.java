package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Calc {

    private static  String[] round() {
        var startRangeNum = 1;
        var endRangeNum = 100;

        var startRangeOpperand = 0;
        var endRangeOpperand = 2;

        var num1 = Random.getInRange(startRangeNum, endRangeOpperand);
        var num2 = Random.getInRange(startRangeNum, endRangeOpperand);
        var operandCode = Random.getInRange(startRangeOpperand, endRangeOpperand);

        var operandString = "";
        var correctAnswer = 0;

        switch (operandCode) {
            case 0:
                operandString = "+";
                correctAnswer = num1 + num2;
                break;
            case 1:
                operandString = "-";
                correctAnswer = num1 - num2;
                break;
            case 2:
                operandString = "*";
                correctAnswer = num1 * num2;
                break;
            case 3:
                operandString = "/";
                num1 = num2 * num1; //  для получения целого числа в ответе
                correctAnswer = num1 / num2;
                break;
            default:
                operandString = "+";
                correctAnswer = num1 + num2;
                break;
        }
        String question = "Question: " + num1 + " " + operandString + " " + num2;
        return new String[] {question, String.valueOf(correctAnswer)};
    }

    public static void start() {
        String rules = "What is the result of the expression?";
        Engine.startGame(() -> round(), rules);
    }
}

