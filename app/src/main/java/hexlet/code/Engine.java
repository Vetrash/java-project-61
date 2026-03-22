package hexlet.code;

import java.util.Scanner;
import java.util.function.Supplier;

public class Engine {

    public static  void startGame(Supplier<String[]> round, String rules) {
        int winForEndGame = 3;
        var wins = 0;
        var isEndGame = false;

        System.out.println("Welcome to the Brain Games!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String nameUser = scanner.next();
        System.out.println("Hello, " + nameUser + "!");

        System.out.println(rules); // Озвучивание правил игры

        while (!isEndGame ) {
            var data = round.get(); // Получаем вопрос и ответ на раунд
            var question = data[0];
            var correctAnswer = data[1];

            System.out.println(question);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (correctAnswer.equals(answer)) {
                System.out.println("Correct!");
                wins += 1;
                if(wins >= winForEndGame) {
                    isEndGame = true;
                };
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again, " + nameUser + "!");
                isEndGame = true;
            }
        }
        if(wins >= winForEndGame) {
        System.out.println("Congratulations, " + nameUser + "!");
        };

    }
}
