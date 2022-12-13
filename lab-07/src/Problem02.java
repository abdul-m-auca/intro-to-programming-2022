import java.util.*;

public class Problem02 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            // Prompt for month and year
            int month = readInt("Month: ", "Invalid month", 1, 12);
            int year = readInt("Year: ", "Invalid year", 1, 10000);

            // Display the number of days
            System.out.printf("Days: %d%n", getNumberOfDays(year, month));
        }
    }

    static int getNumberOfDays(int year, int month) {
        int[] nDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};

        if (isLeapYear(year) && month == 2) {
            return 28;
        }

        return nDays[month - 1];
    }

    static int readInt(String prompt, String errorMessage, int minValue, int maxValue) {
        System.out.print(prompt);
        if (!input.hasNextInt()) {
            System.exit(0);
        }

        int value = input.nextInt();
        if (value < 1 || value > maxValue) {
            System.out.println(errorMessage);
            System.exit(1);
        }

        return value;
    }

    static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 1;
    }
}
