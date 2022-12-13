import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int SumOfCandles = 0;

        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0) {
                int nOfCases = input.nextInt();
                System.out.println(nOfCases + " ");
            } else {
                double days = input.nextDouble();
                SumOfCandles += (1 + days) * days / days + 2;
            }
            System.out.println((int) SumOfCandles);
        }

    }
}