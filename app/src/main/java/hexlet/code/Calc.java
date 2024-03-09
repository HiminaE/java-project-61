package hexlet.code;
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
    }
}
