import java.util.*;
public class Problem003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("A four-digit integer? ");

        int n = input.nextInt(); //1234
        int sumOfDigits = 0;
        sumOfDigits += n % 10;
        n/= 10;
        sumOfDigits += n % 10;
        n/= 10;
        sumOfDigits += n % 10;
        n/= 10;
        sumOfDigits += n % 10;
        n/= 10;

        System.out.println("The sum of all digits is" + sumOfDigits);

    }
}
