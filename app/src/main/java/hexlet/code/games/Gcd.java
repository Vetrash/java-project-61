package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Random;
import java.util.Scanner;

public class Gcd {

    private static int gcdCheck  (int num1, int num2){
        if (num2 == 0) {
            return num1;
        }
        return gcdCheck(num2, num1 % num2);
    };

    public static void start(Scanner scanner) {
        Cli.greeting();
        var wins = 0;

        System.out.println("Find the greatest common divisor of given numbers.");

        while (wins < 3) {
            var num1 = Random.getInRange(0,100);
            var num2 = Random.getInRange(0,100);
            var correctAnswer =  gcdCheck(num1, num2);

            System.out.println("Question: " + num1 +" "+ num2);
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

        };
        System.out.println("Congratulations, Sam!");
    }
}