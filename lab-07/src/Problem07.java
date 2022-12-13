import java.util.*;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nInts = new int[100];

        // Prompt for integers
        System.out.print("Enter integers between 1 and 100: ");

        // Read the numbers and count occurrences of each
        int number;
        while ((number = input.nextInt()) != 0) {
            nInts[number - 1]++;
        }

        // Display the results
        for (int i = 0; i < 100; i++) {
            if (nInts[i] > 0) {
                System.out.printf("%d occurs %d time%s%n", i + 1, nInts[i], nInts[i] > 1 ? "s" : "");
            }
        }
    }
}
