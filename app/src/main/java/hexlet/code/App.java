package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println();
            System.out.println("Welcome to the Brain Games!");

            System.out.println("May I have your name?");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name);
        }

//        make run-dist
//        Please enter the game number and press Enter.
//        1 - Greet
//        0 - Exit
//        Your choice: 1
//
//        Welcome to the Brain Games!
//                May I have your name? John
//        Hello, John!



    }
}
