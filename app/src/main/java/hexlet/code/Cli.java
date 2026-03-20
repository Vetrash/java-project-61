package hexlet.code;

import java.util.Scanner;

public class Cli {
    private Scanner scanner;

    Cli(Scanner scanner){
        this.scanner = scanner;
    }

    public void run() {
        System.out.print("May I have your name? ");
        String userName = this.scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}