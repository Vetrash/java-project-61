package hexlet.code.games;

import hexlet.code.Cli;
import java.util.Scanner;

public class Calc {
    public static void start(Scanner scanner) {
        Cli.greeting();
        var wins = 0;

        System.out.println("What is the result of the expression?");

        while (wins < 3) {
            var num1 = Random.getInRange(0,100);
            var num2 = Random.getInRange(1,100);
            var operandCode = Random.getInRange(0,4);

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
                    operandString = "/";
                    correctAnswer = num1 / num2;
                    break;
                case 3:
                    operandString = "*";
                    correctAnswer = num1 * num2;
                    break;
            }
            System.out.println("Question: " + num1 + operandString + num2);
            int answer = Integer.parseInt(scanner.next());
            System.out.println("Your answer: " + answer);
            if (answer != correctAnswer) {
                wins = 0;
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let's try again, Bill!");
            }
            else {
                System.out.println("Correct!");
                wins += 1;
            }

        }
        System.out.println("Congratulations, Sam!");
    }
}

