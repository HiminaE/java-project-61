package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        int input = scanner.nextInt();
        if (input == 1) {
            Cli.hello();
        } else if (input == 2) {
            Even.startGame();
        } else if (input == 3) {
            Calc.startGame();
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
