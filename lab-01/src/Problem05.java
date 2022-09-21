import java.util.Scanner;
public class Problem05 {
    public static void main(String[] args) {
        // we need it to read two integer values
        Scanner input = new Scanner(System.in);

        System.out.print("1st double? ");
        // int is a type, "a" is a variable of type int
        double a = input.nextDouble();

        System.out.print("2st double? ");
        double b = input.nextDouble();
        double sum = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;
        double rem = a % b;

        System.out.println(a + " + " +b + " = " + sum);
        System.out.println(a + " - " +b + " = " + sub);
        System.out.println(a + " * " +b + " = " + mul);
        System.out.println(a + " / " +b + " = " + div);
        System.out.println(a + " % " +b + " = " + rem);

    }
}
