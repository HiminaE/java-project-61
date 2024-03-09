package hexlet.code;

public class Engine {
    public static void start(int number) {
        String name = Cli.hello();
        int[] k = {1, 2, 3};
        String[] startText = {"", "", "Answer 'yes' if the number is even, otherwise answer 'no'.", "What is the result of the expression?"};
        String[] ans = new String[2];
        System.out.println(startText[number]);
        if (number > 1) {
            for (var i : k) {
                System.out.println();
                switch (number) {
                    case 2:
                        ans = Even.startGame();
                        break;
                    case 3:
                        ans = Calc.startGame();
                        break;
                }
                if ((ans[0]).equals(ans[1])) {
                    System.out.println("Correct!");
                } else {
                    System.out.println(ans[0] + " is wrong answer ;(. Correct answer was " + ans[1] + ".");
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }
            }
        } else {
            return;
        }
    }
}
