package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static void start(String[][] ans) {
        String name = Cli.hello();
        Scanner scanner = new Scanner(System.in);
        int[] k = {0, 1, 2};
        for (var i : k) {
            System.out.println("Question: " + ans[0][i]);
            System.out.print("Your answer: ");
            String rez = scanner.next();
            if (rez.equals(ans[1][i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + rez + "'" + " is wrong answer ;(. Correct answer was " + "'" + ans[1][i] + "'" + ".");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
