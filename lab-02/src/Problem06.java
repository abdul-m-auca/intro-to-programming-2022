import java.util.Scanner;
public class Problem06 {
    public static void main(String[] args) {
        //Create new Scanner object
        Scanner input = new Scanner(System.in);

        // prompt to enter double input
        System.out.print("Enter a degree in celsius: ");
        double Celsius = input.nextDouble();

        // convert celsius to Fahrenheit

        double Fahrenheit =9.0/5 *Celsius +32;
        // Display results
        System.out.println(Celsius + " celsius is " + Fahrenheit + " Fahrenheit ");

    }
}
