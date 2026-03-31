package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Calc {

    private static final int START_RANGE_NUM = 1;
    private static final int END_RANGE_NUM = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};

    private  static int getCorrectAnswerOperation(char operandCode, int num1, int num2) {
        switch (operandCode) {
            case '+':
                return  num1 + num2;
            case '-':
                return   num1 - num2;
            case '*':
                return   num1 * num2;

//            case '/':
//                var numerator = num2 * num1; //  для получения целого числа в ответе
//                return numerator / num2;
            default:
                throw new RuntimeException("Unknown operator " + operandCode);
        }
    }

    private static  String[] round() {

        var num1 = Random.getInRange(START_RANGE_NUM, END_RANGE_NUM);
        var num2 = Random.getInRange(START_RANGE_NUM, END_RANGE_NUM);

        var indexOperator = Random.getInRange(0, OPERATORS.length - 1);
        var operand = OPERATORS[indexOperator];

        var correctAnswer = getCorrectAnswerOperation(operand, num1, num2);

        String question = num1 + " " + operand + " " + num2;
        return new String[] {question, String.valueOf(correctAnswer)};
    }

    public static void start() {
        String rules = "What is the result of the expression?";
        Engine.startGame(() -> round(), rules);
    }
}

