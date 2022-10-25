import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter values for a, b and c.
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Compute the discriminant of the equation.
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        double equation =  (-b + Math.pow(discriminant, 0.5)) / (2 * a);

        // Compute the real roots of the equation if any.
        System.out.print("The equation has ");
        if (discriminant > 0)
        {
            System.out.println("two roots " + equation + " and " + equation);
        }
        else if (discriminant == 0)
        {
            System.out.println("one root " + equation);
        }
        else
            System.out.println("no real roots");
    }
}