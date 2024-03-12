package hexlet.code;

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
        System.out.println("5 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int input = scanner.nextInt();
        String[] startText = {"", "", "Answer 'yes' if the number is even, otherwise answer 'no'.", "What is the result of the expression?", "Find the greatest common divisor of given numbers.","What number is missing in the progression?","Answer 'yes' if the number is even, otherwise answer 'no'."};
        String[][] ans = new String[3][2];

        if ((input > 0) && (input < 7) ) {
            switch (input) {
                case 1:
                    Cli.hello();
                    break;
                case 2:
                    ans = Even.startGame();
                    break;
                case 3:
                    ans = Calc.startGame();
                    break;
                case 4:
                    ans = Gcd.startGame();
                    break;
                case 5:
                    ans = Progression.startGame();
                    break;
                case 6:
                    ans = Prime.startGame();
                    break;
            }
        } else {
            return;
        }
        System.out.println(startText[input]);
        Engine.start(ans);
        return;
    }
}
