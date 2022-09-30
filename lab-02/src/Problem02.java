import java.util.Scanner;
public class Problem02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1st value? ");
        int a = input.nextInt();

        System.out.print("2nd value? ");
        int b = input.nextInt();


        System.out.printf("Before swapping: a = %d, b = %d;%n",a, b);
        System.out.printf("After swapping: a = %d, b = %d;%n",b, a);
    }
}
