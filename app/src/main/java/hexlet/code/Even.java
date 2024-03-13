package hexlet.code;

import java.util.Random;
import java.util.Scanner;
//import

public class Even {

    public static void startGame() {

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        String[][] ans = new String[3][2];
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int[] k = {0, 1, 2};

        for (var i : k) {
            int number = (r.nextInt(100) + 1);
            ans[0][i] = Integer.toString(number);
            if (number % 2 == 0) {
                ans[1][i] = "yes";
            } else {
                ans[1][i] = "no";
            }
        }
        Engine.start(description, ans);
    }
}