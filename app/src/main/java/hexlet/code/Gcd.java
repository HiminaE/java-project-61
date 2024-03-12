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
    public static String[][] startGame() {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        String[][] ans = new String[3][2];
        int[] k = {0, 1, 2};

        for (var i : k) {

            int number1 = (r.nextInt(50) + 1);
            int number2 = (r.nextInt(50) + 1);
            ans[0][i] = Integer.toString( number1) + " " + Integer.toString(number2);
            ans[1][i] = Integer.toString(gcd(number1, number2));
        }
        return ans;
    }

}
