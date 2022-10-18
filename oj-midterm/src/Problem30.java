import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int angle1 = input.nextInt();
        int angle2 = input.nextInt();
        int angle3 = input.nextInt();

        int sum = angle1 + angle2 + angle3;

        if (sum > 180) {
            System.out.println("error");
        } else if (sum < 180) {
            System.out.println("error");
        } else if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
            System.out.println(" equilateral");
        } else if (angle1 == angle2 || angle2 == angle3 || angle3 == angle1) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }
}