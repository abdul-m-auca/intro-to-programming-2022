import java.util.Locale;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("some of real number? ");

        double x = input.nextDouble();

        // CTRL-ALT-L
        double r = x;

        if (r < 0) {
            r = -r;
        }

        System.out.printf("|%.2f| = %.2f%n", x, r);
    }
}
