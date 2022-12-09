import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double numberOfCandles = 0;

        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                int NumberOfCase = input.nextInt();
                System.out.println(NumberOfCase + ' ');
            } else {
                double days = input.nextDouble();
                numberOfCandles = ((1 + days) * days) / 2 + days;
                System.out.print((int) numberOfCandles);
            }


        }
    }
}
