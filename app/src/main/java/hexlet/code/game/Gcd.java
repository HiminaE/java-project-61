package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;
import java.util.Random;

public class Gcd {
    public static int gcd(int x, int y) {
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        return x;
    }
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        String[][] answers = new String[3][2];
        String description = "Find the greatest common divisor of given numbers.";
        int[] k = {0, 1, 2};

        for (var i : k) {

            int number1 = Utils.generateNumber(1,50);
            int number2 = Utils.generateNumber(1,50);
            answers[i][0] = Integer.toString( number1) + " " + Integer.toString(number2);
            answers[i][1] = Integer.toString(gcd(number1, number2));
        }
        Engine.start(description, answers);
    }
}
