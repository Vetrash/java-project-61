package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Random;
import java.util.Scanner;
public  class Prime {



private static boolean isPrime (int num) {
        for (var n = 2; n < num; n += 1) {
            if (num % n == 0) { return false; }
        }
        return true;
    };

    public static void start(Scanner scanner) {
        Cli.greeting();
        var wins = 0;

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (wins < 3) {
            var num = Random.getInRange(1,100);
            var correctAnswer =  isPrime(num) ? "yes": "no";

            System.out.println("Question: " + num);
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


        };
        System.out.println("Congratulations, Sam!");
    }

}