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
        System.out.print("Months? ");

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
                System.out.println(" Number of days: " + (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28));
                /*if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("Number of days: 29");
                } else {
                    System.out.println("Number of days: 28");
                }*/
                break;
        }
    }
}
