import java.util.Random;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rnd = new Random();

        double r = Math.random();

        System.out.print("Number of tests? ");
        int nTests = input.nextInt();

        int nCorrectAnswers = 0;
        int i = 0;
        while (i < nTests) {
            int op1 = -50 + rnd.nextInt(101);
            int op2 = -50 + rnd.nextInt(101);
            System.out.printf("%d + %d = ");
            int answer = input.nextInt();
            if (answer == op1 + op2) {
                ++nCorrectAnswers;
            }
            ++i;
        }
        System.out.println("Number of correct: " + nCorrectAnswers);
        System.out.println("Number of incorrect: " + (nTests - nCorrectAnswers);
    }

}
