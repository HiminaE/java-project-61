package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static void startGame() {

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        String[][] ans = new String[3][2];
        String description = "What is the result of the expression?";
        int[] k = {0, 1, 2};

        for (var i : k) {

            int number1 = (r.nextInt(100) + 1);
            int number2 = (r.nextInt(100) + 1);
            int operation = (r.nextInt(3));
            String soperation = Character.toString("+-*".charAt(operation));

            ans[0][i] = Integer.toString(number1) + " " + soperation + " " + Integer.toString(number2);
            int rez = number1 + number2;

            if (operation == 1) {
                rez = number1 - number2;
            }
            if (operation == 2) {
                rez = number1 * number2;
            }
            ans[1][i] = Integer.toString(rez);
        }
        Engine.start(description, ans);
    }
}
