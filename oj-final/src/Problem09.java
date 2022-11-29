import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int year = input.nextInt();
            int month = input.nextInt();
            int day = input.nextInt();

            if (2007 - year > 18) {
                System.out.println("Yes");
            } else if (2007 - year == 18 && month == 2 && day <= 27) {
                System.out.println("Yes");
            } else if (2007 - year == 18 && month == 1) {
                System.out.println("Yes");
            } else if (2007 - year < 18) {
                System.out.println("No");
            } else if (2007 - year == 18 && month == 2 && day == 28) {
                System.out.println("No");
            } else if (2007 - year == 18 && month > 2) {
                System.out.println("No");
            }
        }
    }
}
