import java.util.*;

public class Problem21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the data
        int threshold = input.nextInt();
        int newlyInfected = input.nextInt();
        int spreadCoefficient = input.nextInt();

        // Determine the day when the threshold will be exceeded
        int day = 0;
        int infected = newlyInfected;
        while (infected <= threshold) {
            newlyInfected *= spreadCoefficient;
            infected += newlyInfected;
            day++;
        }

        // Display the result
        System.out.println(day);
    }
}
