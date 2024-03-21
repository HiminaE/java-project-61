package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;
import java.util.Random;

public class Gcd {

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        String[][] answers = new String[3][2];
        String description = "Find the greatest common divisor of given numbers.";

        for (var i = 0; i < Engine.ROUNDS; i++) {

            int number1 = Utils.generateNumber(1,50);
            int number2 = Utils.generateNumber(1,50);
            answers[i][0] = Integer.toString( number1) + " " + Integer.toString(number2);
            answers[i][1] = Integer.toString(gcd(number1, number2));
        }
        Engine.start(description, answers);
    }
    public static int gcd(int number1, int number2) {
        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
        }
        return number1;
    }
}
