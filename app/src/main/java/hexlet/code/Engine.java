package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static void start(String description, String[][] answers) {

        String name = Cli.hello();
        System.out.println(description);
        Scanner scanner = new Scanner(System.in);
        int[] k = {0, 1, 2};
        for (var i : k) {
            System.out.println("Question: " + answers[i][0]);
            System.out.print("Your answer: ");
            String rezult = scanner.next();
            if (rezult.equals(answers[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + rezult + "'" + " is wrong answer ;(. Correct answer was " + "'" + answers[i][1] + "'" + ".");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
