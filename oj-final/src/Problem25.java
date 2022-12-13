import java.util.*;

public class Problem25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the number of test cases
        int nTestCases = input.nextInt();

        // Compute the number of appliances that can be powered for each case
        for (int i = 0; i < nTestCases; i++) {
            int nStrips = input.nextInt();
            int nAppliances = 0;

            // Count the number of operable appliances given the number of outlets on each strip
            for (int j = 1; j <= nStrips; j++) {
                nAppliances += input.nextInt();

                // If it's not the last strip, its one outlet needs to power another outlet
                if (j < nStrips) {
                    nAppliances--;
                }
            }

            // Display the result
            System.out.println(nAppliances);
        }
    }
}
