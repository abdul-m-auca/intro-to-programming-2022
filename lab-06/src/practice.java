import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number?");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(" is a palindrome");
        } else {
            System.out.println(" is not a palindrome");
        }
    }

    public static int reverse(int number) {
        int nDigits = String.format("%d", number).length();

        int numberReversed = 0;

        for (int i = 0; i < nDigits; i++) {
            numberReversed += number % 10 * Math.pow(10, nDigits - 1 - i);
        }
        return numberReversed;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}