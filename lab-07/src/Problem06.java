import java.util.*;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for number of students
        System.out.print("Enter the number of students: ");
        int nStudents = input.nextInt();

        // Read the scores
        int[] scores = new int[nStudents];
        System.out.printf("Enter %d scores: ", nStudents);
        for (int i = 0; i < nStudents; i++) {
            scores[i] = input.nextInt();
        }

        // Determine the best score
        int bestScore = getBestScore(scores);

        // Display the grades for each student
        for (int i = 0; i < nStudents; i++) {
            System.out.printf("Student %d score is %d and grade is %s%n",
                    i, scores[i], getGrade(scores[i], bestScore));
        }
    }

    static String getGrade(int score, int bestScore) {
        if (score >= bestScore - 10) {
            return "A";
        } else if (score >= bestScore - 20) {
            return "B";
        } else if (score >= bestScore - 30) {
            return "C";
        } else if (score >= bestScore - 40) {
            return "D";
        } else {
            return "F";
        }
    }

    static int getBestScore(int[] scores) {
        int bestScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }
        return bestScore;
    }
}
