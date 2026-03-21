package hexlet.code;

import hexlet.code.games.*;
import hexlet.code.Cli;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);


        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        String gameCode = scanner.next();
        System.out.println("Your choice: " + gameCode);
        switch (gameCode){
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.start(scanner);
                break;
            case "3":
                Calc.start(scanner);
                break;
            case "4":
                Gcd.start(scanner);
                break;
            case "5":
                Progression.start(scanner);
                break;
            case "6":
                Prime.start(scanner);
                break;
            case "0":
                break;
        }
        scanner.close();
    }
}
