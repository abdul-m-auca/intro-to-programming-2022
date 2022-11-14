import java.util.*;

public class Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        int nGrades = 0;
        int grade = input.nextInt();


        while (grade != 0) {
            sum += grade;
            ++nGrades;
            grade = input.nextInt();
        }

        if (grade != 0) {
            System.out.printf("%.1f%n", sum / nGrades);
        } else {
            System.out.println("No data");
        }
    }
}


