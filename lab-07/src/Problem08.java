import java.util.*;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[101];

        // Read the scores and count their sum
        int sum = 0;
        int nScores = 0;
        int score;
        while ((score = input.nextInt()) >= 0) {
            sum += score;
            nScores++;
            scores[score]++;
        }

        // Compute the average
        int average = (int) Math.round((double) sum / nScores);

        // Count the scores below the average
        int nBadScores = 0;
        for (int i = 0; i < average; i++) {
            nBadScores += scores[i];
        }

        // Count the scores above/equal to the average
        int nGoodScores = 0;
        for (int i = average; i < scores.length; i++) {
            nGoodScores += scores[i];
        }

        // Display the results
        System.out.println("Average: " + average);
        System.out.println("Good scores: " + nGoodScores);
        System.out.println("Bad scores: " + nBadScores);
    }
}
