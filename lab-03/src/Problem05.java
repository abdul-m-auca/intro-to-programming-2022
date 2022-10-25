import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("points? ");

        double points = input.nextDouble();

        if (points < 0 || 100 < points) {
            System.out.println(" is not in permitted range. ");
        } else if (90 <= points) {
            System.out.println("Grade: A");
        } else if (80 <= points) {
            System.out.println("Grade: B");
        } else if (70 <= points) {
            System.out.println("Grade: C");
        } else if (60 <= points) {
            System.out.println("Grade: D");
        } else if (0 <= points) {
            System.out.println("Grade: F");
        }
    }
}
