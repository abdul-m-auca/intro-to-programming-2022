import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //month input
        int month = input.nextInt();
        ///day input
        int day = input.nextInt();

        if (month < 2 || (month == 2 && day < 18)) {
            System.out.print("Before");
        } else if (month > 2 || (month == 2 && day > 18)) {
            System.out.print("After");
        }

    }
}
