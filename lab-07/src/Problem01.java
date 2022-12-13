import java.util.*;

public class Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        // Prompt for number of tosses
        System.out.print("N: ");
        int nTosses = input.nextInt();

        int[] results = new int[11];

        // Simulate tosses and count results
        for (int i = 0; i < nTosses; i++) {
            int dice1 = rnd.nextInt(6) + 1;
            int dice2 = rnd.nextInt(6) + 1;
            results[dice1 + dice2 - 2]++;
        }

        // Display the results
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d: %d%n", i + 2, results[i]);
        }
    }
}
