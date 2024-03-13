package hexlet.code;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Progression {
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        String[][] ans = new String[3][2];
        String description = "What number is missing in the progression?";
        int[] k = {0, 1, 2};

        for (var i : k) {

            int quantity = 10;
            String[] progres = new String[quantity];
            int pos = r.nextInt(10);
            int el = r.nextInt(20);

            for (var j = 0; j < quantity; j++) {
                if (j == pos) {
                    progres[j] = "..";
                    ans[1][i] = Character.toString(el);
                } else {
                    progres[j] = Integer.toString(el);
                }
                el += pos;
            }
            ans[0][i] = Arrays.toString(progres);
        }
        Engine.start(description, ans);
    }
}
