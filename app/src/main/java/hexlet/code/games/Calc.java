package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Calc {

    private static final int START_RANGE_NUM = 1;
    private static final int END_RANGE_NUM = 100;
    private static final int START_RANGE_OPPERAND = 0;
    private static final int END_RANGE_OPPERAND = 2;

    private static  String[] round() {

        var num1 = Random.getInRange(START_RANGE_NUM, END_RANGE_NUM);
        var num2 = Random.getInRange(START_RANGE_NUM, END_RANGE_NUM);
        var operandCode =  String.valueOf(Random.getInRange(START_RANGE_OPPERAND, END_RANGE_OPPERAND));

        var operandString = "";
        var correctAnswer = 0;

        switch (operandCode) {
            case "0":
                operandString = "+";
                correctAnswer = num1 + num2;
                break;
            case "1":
                operandString = "-";
                correctAnswer = num1 - num2;
                break;
            case "2":
                operandString = "*";
                correctAnswer = num1 * num2;
                break;
            case "3":
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

