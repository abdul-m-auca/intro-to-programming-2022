import java.util.*;

public class Problem24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the number of sides of both dice
        int nSides1 = input.nextInt();
        int nSides2 = input.nextInt();

        // Count the number of ways to get the sum 10
        int nSums10 = 0;
        for (int dice1 = 1; dice1 <= nSides1; dice1++) {
            for (int dice2 = 1; dice2 <= nSides2; dice2++) {
                if (dice1 + dice2 == 10) {
                    nSums10++;
                }
            }
        }

        // Display the result
        System.out.printf("There %s %d way%s to get the sum 10.", nSums10 == 1 ? "is" : "are",
                nSums10, nSums10 == 1 ? "" : "s");
    }
}
