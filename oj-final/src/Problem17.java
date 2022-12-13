import java.util.*;

public class Problem17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the integer
        int number = input.nextInt();

        // Find the smallest power of 2 so that the result is greater
        // than or equal to the given number
        int power = 0;
        while (Math.pow(2, power) < number) {
            power++;
        }

        // Display the result
        System.out.println(power);
    }
}
