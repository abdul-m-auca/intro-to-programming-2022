import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String month = input.next();

        int day = input.nextInt();

        if (month.contains("OCT") && day == 31 || month.contains("DEC") && day == 25) {
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }
    }
}
