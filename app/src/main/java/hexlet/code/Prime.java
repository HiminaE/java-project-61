package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static Boolean prime(int x) {
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
    public static String[] startGame() {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        String[] rez = new String[2];
        int number = (r.nextInt(100) + 1);
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        String input = scanner.next();
        rez[0] = input;
        if (prime(number)) {
            rez[1] = "yes";
        } else {
            rez[1] = "no";
        }
        return rez;
    }
}
