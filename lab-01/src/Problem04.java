import java.util.Scanner;
public class Problem04 {
    public static void main(String[] args) {
        // we need it to read two integer values
        Scanner input = new Scanner(System.in);

        System.out.print("1st int? ");
        // int is a type, "a" is a variable of type int
        int a = input.nextInt();

        System.out.print("2st int? ");
        int b = input.nextInt();
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int rem = a % b;

        System.out.println(a + " + " +b + " = " + sum);
        System.out.println(a + " - " +b + " = " + sub);
        System.out.println(a + " * " +b + " = " + mul);
        System.out.println(a + " / " +b + " = " + div);
        System.out.println(a + " % " +b + " = " + rem);

    }
}
