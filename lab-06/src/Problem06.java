import java.util.*;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for an integer
        System.out.print("Enter an integer: ");
        long n = input.nextLong();

        // Display the sum of its digits
        System.out.println("The sum of its digits: " + sumDigits(n));
    }

    // sumDigits: Returns the sum of the digits of an integer n
    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
