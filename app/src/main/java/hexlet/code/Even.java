package hexlet.code;

import java.util.Random;
import java.util.Scanner;
//import

public class Even {

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        int[] k = {1,2,3};
        for (var i : k ) {
            System.out.println();
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            int number = (r.nextInt(6) + 1);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");

            String input = scanner.next();

            if (((number % 2) == 0) && (input.equals("yes")) || (((number % 2) != 0) && (input.equals("no")))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name + "!");
                return;     // прерывается весь  метод startGame()
            }
        }

        System.out.println();
        System.out.println("Congratulations, " + name + "!");

    }

}