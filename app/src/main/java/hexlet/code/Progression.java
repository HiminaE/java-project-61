package hexlet.code;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Progression {
    public static String[] startGame() {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        String[] rez = new String[2];
        int quantity = 10;
        String[] progres = new String[quantity];

        //System.out.println();

        int pos = r.nextInt(10);
        int el = r.nextInt(20);

        for (var i = 0; i < quantity; i++) {
            if (i == pos) {
                progres[i] = "..";
                rez[1] = Character.toString(el);
            } else {
                progres[i] = Integer.toString(el);
            }
            el += pos;
        }
        System.out.print("Question: ");
        System.out.println(Arrays.toString(progres));
        System.out.print("Your answer: ");
        int input = scanner.nextInt();
        rez[0] = Integer.toString(input);
        return rez;
    }
}
