import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //month input
        int month = input.nextInt();
        ///day input
        int day = input.nextInt();
        //in january or before february 18
        if (month < 2 || (month == 2 && day < 18)) {
            System.out.println("Before");
        }
        //March-December or after February
        else if (month > 2 || (month == 2 && day > 18)) {
            System.out.println("After");
        } else {
            System.out.println("Special");
        }

    }
}
