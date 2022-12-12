import java.util.*;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for the number of rows and display the pattern
        System.out.print("Enter n: ");
        displayPattern(input.nextInt());
    }


    public static void displayPattern(int n) {

        for (int row = 1; row <= n; row++) {
            // Print leading spaces
            for (int i = n; i > row; i--) {
                // Print as many spaces as the number would take if it was printed,
                // to properly align the numbers in different rows
                int nDigits = String.format("%d", i).length();
                for (int j = 0; j < nDigits; j++) {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }

            // Print the numbers
            for (int i = row; i > 0; i--) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
}
