import java.util.*;

public class Problem11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of entries
        int nNumbers = input.nextInt();

        // Determine the minimum number of all given numbers
        double min = input.nextDouble();
        for (int i = 1; i < nNumbers; i++) {
            min = Math.min(min, input.nextDouble());
        }

        // Display the minimum number
        System.out.printf("%.2f%n", min);
    }
}
