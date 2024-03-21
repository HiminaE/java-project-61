package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Progression {
    public static String[] progression() {
        int quantity = 10;
        String[] progress = new String[quantity];
        int pos = Utils.generateNumber(0,9);
        int el = Utils.generateNumber(1,20);
        for (var j = 0; j < quantity; j++) {
            progress[j] = Integer.toString(el);
            el += pos;
        }
        return progress;
    }
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        String[][] answers = new String[3][2];

        String description = "What number is missing in the progression?";
        int[] k = {0, 1, 2};
        for (var i : k) {
            String[] prog = progression();
            int pos = Utils.generateNumber(0,9);
            String prog1 = "";
            String prog2 = "";
            answers[i][1] = prog[pos];
            for (var j = 0; j < pos; j++) {
                prog1 = prog1 + prog[j] + " ";
            }
            for (var j = pos + 1; j < prog.length; j++) {
                prog2 = prog2 + prog[j] + " ";
            }
            answers[i][0] = prog1 + ".. " +prog2;
        }
        Engine.start(description, answers);
    }
}
