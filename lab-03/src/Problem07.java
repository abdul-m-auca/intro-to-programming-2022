import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();

        int futureDay = (today + elapsedDays) % 7;

        System.out.print("Today is ");

        switch (today) {
            case 0 -> System.out.print("Sunday");
            case 1 -> System.out.print("Monday");
            case 2 -> System.out.print("Tuesday");
            case 3 -> System.out.print("Wednesday");
            case 4 -> System.out.print("Thursday");
            case 5 -> System.out.print("Friday");
            case 6 -> System.out.print("Saturday");
        }

        System.out.print(" and the future day is ");


        }
    }
}