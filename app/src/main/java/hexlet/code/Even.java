package hexlet.code;

import java.util.Random;
import java.util.Scanner;
//import

public class Even {

    public static String[] startGame() {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        String[] rez = new String[2];
        int number = (r.nextInt(100) + 1);
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        String input = scanner.next();
        rez[0] = input;
        if (number % 2 == 0) {
            rez[1] = "yes";
        } else {
            rez[1] = "no";
        }
        return rez;

    }

}