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
        calculate(answers);
        Engine.start(description, answers);
    }
    private static void calculate(String[][] answers) {

        for (var i = 0; i < Engine.ROUNDS; i++) {

            int number1 = Utils.generateNumber(1,50);
            int number2 = Utils.generateNumber(1,50);;
            int operation = Utils.generateNumber(0,2);;
            String strOperation = Character.toString("+-*".charAt(operation));

            answers[i][0] = Integer.toString(number1) + " " + strOperation + " " + Integer.toString(number2);
            int rezult = number1 + number2;

            if (operation == 1) {
                rezult = number1 - number2;
            }
            if (operation == 2) {
                rezult = number1 * number2;
            }
            answers[i][1] = Integer.toString(rezult);
        }

    }
}
