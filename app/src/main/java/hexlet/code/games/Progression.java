package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Random;
import java.util.Scanner;

public class Progression {


    public static void start(Scanner scanner) {
        Cli.greeting();
        var wins = 0;

        System.out.println("Find the greatest common divisor of given numbers.");

        while (wins < 3) {
            var lengthArray = Random.getInRange(5,10);
            var enigmaIndex = Random.getInRange(0,lengthArray);
            var stepProgression = Random.getInRange(1,50);
            var arrProgression  = new String [lengthArray];
            for( var i = 0; i<lengthArray; i++) {
                arrProgression[i] =String.valueOf(stepProgression * i+1);
            }
            var correctAnswer =  arrProgression[enigmaIndex];
            arrProgression[enigmaIndex] = "..";



            System.out.println("Question: " + String.join(" ", arrProgression));
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (!answer.equals(correctAnswer)) {
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
