import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 0;
        double total = 0;
        int a = input.nextInt();

        for (int i = 0; i < a; ++i) {
            int now = input.nextInt();

            if (now < 0) continue;

            n++;
            total += (double) now;
        }
        System.out.println(total / n);

    }
}
