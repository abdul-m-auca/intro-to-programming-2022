import java.util.Scanner;
public class Problem03 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("A four-digit integer? ");
        int digits = in.nextInt();
        System.out.println("The sum of all digits is " + sumDigits(digits));
    }
    public static int sumDigits(long n) {
        int result = 0;

        while(n > 0) {
            result += n % 10;
            n /= 10;
        }

        return result;
    }

}