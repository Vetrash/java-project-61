package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        var scanner = new Scanner(System.in);
        var cli = new Cli(scanner);

        cli.run();
        scanner.close();
    }

}
