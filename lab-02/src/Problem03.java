import java.util.Scanner;
public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A four digit integer? ");
        int number = input.nextInt();

        int sum =0;
        while (number!=0) {
            sum = sum +number %10;
            number = number /10;
            System.out.println("the sum of all digits"+ sum);
        }

    }
}
