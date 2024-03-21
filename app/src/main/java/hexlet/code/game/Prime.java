package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;
import java.util.Scanner;

public class Prime {

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        String[][] answers = new String[3][2];
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (var i = 0; i < Engine.ROUNDS; i++) {
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
    public static Boolean isPrime(int number) {
        int count = 0;
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return (count == 0);
    }
}
