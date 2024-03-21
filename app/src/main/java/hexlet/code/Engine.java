package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static void start(String description, String[][] answers) {

        String name = Cli.hello();
        System.out.println(description);
        Scanner scanner = new Scanner(System.in);

        for (var i = 0; i < ROUNDS; i++) {
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
