package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Gcd {
    public static int gcd(int x, int y) {
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        return x;
    }
    public static String[] startGame() {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        String[] rez = new String[2];

        System.out.println();

        int number1 = (r.nextInt(50) + 1);
        int number2 = (r.nextInt(50) + 1);
        System.out.println("Question: " + number1 + " " + number2);
        System.out.print("Your answer: ");
        int input = scanner.nextInt();
        rez[0] = Character.toString(input);
        rez[1] = Character.toString(gcd(number1,number2));
        return rez;
    }

}
