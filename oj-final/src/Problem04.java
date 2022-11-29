import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double SumOfCandles = 0;

        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                int numberOfCase = input.nextInt();
                System.out.print(numberOfCase + " ");
            } else {
                double days = input.nextDouble();
                SumOfCandles = ((1 + days) * days) / 2 + days;
                System.out.println((int) SumOfCandles);
            }
        }
    }
}
