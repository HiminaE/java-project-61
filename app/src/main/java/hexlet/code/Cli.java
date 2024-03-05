package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("make run-dist");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

    }
}
