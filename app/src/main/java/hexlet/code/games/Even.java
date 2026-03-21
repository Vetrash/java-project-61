package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Random;
import java.util.Scanner;

public class Even{

    public static void start(Scanner scanner) {
        Cli.greeting();
        var wins = 0;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (wins < 3) {
            var generateNum = Random.getInRange(0,100);
            var isEven = generateNum % 2 == 0;
            var correctAnswer = isEven ? "yes" : "no";

            System.out.println("Question: " + generateNum);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if ((!answer.equals("yes") && !answer.equals("no")) || !answer.equals(correctAnswer)) {
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
    };
}


