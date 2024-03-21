package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;
import java.util.Scanner;
//import

public class Even {

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        String[][] answers = new String[3][2];
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.generateNumber(1,100);
            answers[i][0] = Integer.toString(number);
            answers[i][1] = isEven(number) ? "yes" : "no";
        }
        Engine.start(description, answers);
    }
    public static Boolean isEven(int number) {
        return (number % 2) == 0;
    }
}