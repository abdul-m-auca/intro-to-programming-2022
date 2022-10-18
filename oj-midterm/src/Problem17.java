import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int S = input.nextInt();
        int M = input.nextInt();
        int L = input.nextInt();

        int score = (1 * S) + (2 * M) + (3 * L);

        if (score >= 10) {
            System.out.print("happy");
        } else {
            System.out.print("sad");
        }
    }
}
