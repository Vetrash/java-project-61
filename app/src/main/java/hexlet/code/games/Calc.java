package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Calc {

    private static final int START_RANGE_NUM = 1;
    private static final int END_RANGE_NUM = 100;
    private static final int START_RANGE_OPPERAND = 0;
    private static final int END_RANGE_OPPERAND = 2;


    private  static String getOperand(String operandCode) {
        switch (operandCode) {
            case "0":
                return "+";
            case "1":
                return  "-";
            case "2":
                return  "*";
            case "3":
                return  "/";
            default:
                throw new RuntimeException("Unknown operator " + operandCode);
        }
    }

    private  static int getCorrectAnswerOperation(String operandCode, int num1, int num2) {
        switch (operandCode) {
            case "0":
                return  num1 + num2;
            case "1":
                return   num1 - num2;
            case "2":
                return   num1 * num2;
            case "3":
                var numerator = num2 * num1; //  для получения целого числа в ответе
                return nnumerator / num2;
            default:
                throw new RuntimeException("Unknown operator " + operandCode);
        }
    }

    private static  String[] round() {

        var num1 = Random.getInRange(START_RANGE_NUM, END_RANGE_NUM);
        var num2 = Random.getInRange(START_RANGE_NUM, END_RANGE_NUM);
        var operandCode =  String.valueOf(Random.getInRange(START_RANGE_OPPERAND, END_RANGE_OPPERAND));

        var operandString = getOperand(operandCode);
        var correctAnswer = getCorrectAnswerOperation(operandCode, num1, num2);

        String question = num1 + " " + operandString + " " + num2;
        return new String[] {question, String.valueOf(correctAnswer)};
    }

    public static void start() {
        String rules = "What is the result of the expression?";
        Engine.startGame(() -> round(), rules);
    }
}

