import java.util.Scanner;

public class Problem02 {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = readInt("year: ", "incorrect year", 1, 100000);
        int month = readInt("month: ", "incorrect month", 1, 12);
    }

    static int GetNumberOfDays(int year, int month) {
        switch (month) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 1p
        }
    }

    static int readInt(String prompt, String errorMessage, int minValue, int maxValue) {
        System.out.print(prompt);

        int res = inp.nextInt();
        if (res < minValue || maxValue < res) {
            System.out.println(errorMessage);
            System.exit(1);
        }
    }
}
