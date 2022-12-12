import java.util.Scanner;

public class Practice {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = readInt("year", "Incorrect number", 1, 100000);
        int month = readInt("month", "Incorrect number", 1, 12);

        System.out.println("Number of days" + GetNumberOfDays(year, month));

    }

    static int GetNumberOfDays(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return isLeap(year) ? 29 : 28;
        }
    }

    static int readInt(String prompt, String errorMessage, int minvalue, int maxvalue) {
        System.out.print(prompt);
        int res = inp.nextInt();
        if (res < minvalue || res > maxvalue) {
            System.out.println(errorMessage);
            System.exit(1);
        }
        return res;
    }

    static boolean isLeap(int year) {
        return (year % 400 == 0 || year % 4 == 0 || year % 100 != 0);
    }
}
