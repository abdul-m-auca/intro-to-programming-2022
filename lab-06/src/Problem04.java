import java.util.*;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for numbers
        System.out.print("A: ");
        int a = input.nextInt();
        System.out.print("B: ");
        int b = input.nextInt();

        // Display the gcd
        try {
            System.out.printf("GCD(%d, %d) = %d%n", a, b, gcd(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println("GCD(0, 0) is not defined.");
        }
    }

    static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            throw new IllegalArgumentException();
        } else if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }

        int gcd = Math.min(a, b);
        while (a % gcd != 0 || b % gcd != 0) {
            gcd--;
        }

        return gcd;
    }
}
