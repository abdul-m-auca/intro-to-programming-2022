import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int angle1 = input.nextInt();
        int angle2 = input.nextInt();
        int angle3 = input.nextInt();

        int sum = angle1 + angle2 + angle3;

        if (sum > 180) {
            System.out.println("Error");
        } else if (sum < 180) {
            System.out.println("Error");
        } else if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
            System.out.println("Equilateral");
        } else if (angle1 == angle2 || angle2 == angle3 || angle3 == angle1) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}