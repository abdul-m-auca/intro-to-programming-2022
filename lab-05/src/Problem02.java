import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Integer? ");
        int n = input.nextInt();

        int sumOfDigits = 0;

        while (n != 0) {
            sumOfDigits += n % 10;
            n /= 10;
        }

        System.out.println("The sum of digits is " + sumOfDigits);

    }
}
