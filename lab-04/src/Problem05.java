import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfDaysInMonth = 0;
        String monthOfName = "unknown ";

        System.out.print("Year? ");
        int year = input.nextInt();

        System.out.print("Month? ");
        int month = input.nextInt();

        switch (month) {
            case 1:
                monthOfName = "January ";
                numberOfDaysInMonth = 31;
                break;
            case 2:
                monthOfName = "February ";
                numberOfDaysInMonth =
        }

    }
}
