package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static Boolean isPrime(int x) {
        int k = 0;
        for (var i = 2; i < x; i++) {
            if (x%i == 0) {
                k = k + 1;
            }
        }
        if (k == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        String[][] answers = new String[3][2];
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int[] k = {0, 1, 2};

        for (var i : k) {
            int number = Utils.generateNumber(1,100);
            answers[i][0] = Integer.toString(number);

            if (isPrime(number)) {
                answers[i][1] = "yes";
            } else {
                answers[i][1] = "no";
            }
        }
        Engine.start(description, answers);
    }
}
