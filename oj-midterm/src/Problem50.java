import java.util.*;

public class Problem50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the range of integers and modulo divisor
        int range = input.nextInt();
        int modDivisor = input.nextInt();

        // Determine the greatest result of x mod modDivisor, for all integers x within [1; range];
        int greatestResult;
        if (range >= modDivisor) {
            greatestResult = modDivisor - 1;
        } else {
            greatestResult = range;
        }

        // Display the result
        System.out.println(greatestResult);
    }
}