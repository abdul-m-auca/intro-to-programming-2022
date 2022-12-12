import java.util.*;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Determine if it's a palindrome and display the result
        if (isPalindrome(number)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }


    // reverse:  Returns the reversal of an integer
    public static int reverse(int number) {
        // Count the digits
        int nDigits = String.format("%d", number).length();

        // Reverse the number
        int numberReversed = 0;
        for (int i = 0; i < nDigits; i++) {
            numberReversed += number % 10 * Math.pow(10, nDigits - 1 - i);
            number /= 10;
        }

        return numberReversed;
    }


    // isPalindrome:  Returns true if the number is palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
