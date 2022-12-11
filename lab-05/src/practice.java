import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        int nGrade = 0;
        int grade = input.nextInt();

        while (grade != 0) {
            sum += grade;
            ++nGrade;
            grade = input.nextInt();
        }
        if (grade != 0) {
            System.out.printf("%.1f%n", sum / nGrade);
        } else {
            System.out.println("No data");
        }
    }

}