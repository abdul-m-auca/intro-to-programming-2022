import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Year? ");

        int year = input.nextInt();

        if (year <= 0) {
            System.out.println("Incorrect number of year " + year);
            System.exit(1);
        }
        System.out.print("Month? ");
        int month = input.nextInt();
        if (month < 1 || 12 < month) {
            System.out.println("Incorrect number of year " + year);
            System.exit(1);
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Number of days: 31 ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number of days: 30");
            default:
                boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
                System.out.println("Number of days: " + (isLeapYear ? 29 : 28));
                break;
        }
    }
}
