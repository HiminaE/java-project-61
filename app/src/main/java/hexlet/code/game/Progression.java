package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Progression {

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        String[][] answers = new String[3][2];
        String description = "What number is missing in the progression?";

        for (var i = 0; i < Engine.ROUNDS; i++) {
            String[] progress = progression();
            int pos = Utils.generateNumber(0,9);
            String first_part_progress = "";
            String second_part_progress = "";
            answers[i][1] = progress[pos];
            for (var j = 0; j < pos; j++) {
                first_part_progress = first_part_progress + progress[j] + " ";
            }
            for (var j = pos + 1; j < progress.length; j++) {
                second_part_progress = second_part_progress + progress[j] + " ";
            }
            answers[i][0] = first_part_progress + ".. " + second_part_progress;
        }
        Engine.start(description, answers);
    }
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
}
