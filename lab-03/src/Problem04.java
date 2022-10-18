import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("year? ");
        int year = input.nextInt();


        if (year % 4 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");

        }
    }
}
