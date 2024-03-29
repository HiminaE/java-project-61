package hexlet.code;

import hexlet.code.game.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                Cli.hello();
                break;
            case 2:
                Even.startGame();
                break;
            case 3:
                Calc.startGame();
                break;
            case 4:
                Gcd.startGame();
                break;
            case 5:
                Progression.startGame();
                break;
            case 6:
                Prime.startGame();
                break;
            default:
                System.out.println("Input error!!!");
                break;
        }
    }
}
