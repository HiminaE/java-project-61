package hexlet.code;
<<<<<<< HEAD
import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static String[] startGame() {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        String[] rez = new String[2];

        System.out.println();

        int number1 = (r.nextInt(100) + 1);
        int number2 = (r.nextInt(100) + 1);
        int operation = (r.nextInt(3));
        String soperation = Character.toString("+-*".charAt(operation));

        System.out.println("Question: " + number1 + " " + soperation + " " + number2);
        System.out.print("Your answer: ");

        int input = scanner.nextInt();
        rez[0] = Character.toString(input);
        var ans = number1 + number2;
        if (operation == 1) {
            ans = number1 - number2;
        }
        if (operation == 2) {
            ans = number1 * number2;
        }
        rez[1] = Character.toString(ans);
        return rez;
=======

public class Calc {
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
            System.out.println("What is the result of the expression?");
            int number1 = (r.nextInt(1000) + 1);
            int number2 = (r.nextInt(1000) + 1);
            int operation = (r.nextInt(3));
            String soperation = Character.toString("+-*".charAt(operation));

            System.out.println("Question: " + number1 + " " + soperation + " " + number2);
            System.out.print("Your answer: ");

            int input = scanner.nextInt();
            var tryAns = number1 + number2;
            if (operation == 1) {
                tryAns = number1 - number2;
            }
            if (operation == 2) {
                tryAns = number1 * number2;
            }

            if (input == tryAns) {
                System.out.println("Correct!");
            } else {
                System.out.println(input + " is wrong answer ;(. Correct answer was " + tryAns + ".");
                System.out.println("Let's try again, " + name + "!");
                return;     // прерывается весь  метод startGame()
            }
        }

        System.out.println();
        System.out.println("Congratulations, " + name + "!");

>>>>>>> origin/main
    }
}
