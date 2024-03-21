package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static void startGame() {

        Scanner scanner = new Scanner(System.in);
        String[][] answers = new String[3][2];
        String description = "What is the result of the expression?";
        int[] k = {0, 1, 2};

        for (var i : k) {

            int number1 = Utils.generateNumber(1,50);
            int number2 = Utils.generateNumber(1,50);;
            int operation = Utils.generateNumber(0,2);;
            String soperation = Character.toString("+-*".charAt(operation));

            answers[i][0] = Integer.toString(number1) + " " + soperation + " " + Integer.toString(number2);
            int rezult = number1 + number2;

            if (operation == 1) {
                rezult = number1 - number2;
            }
            if (operation == 2) {
                rezult = number1 * number2;
            }
            answers[i][1] = Integer.toString(rezult);
        }
        Engine.start(description, answers);
    }
}
