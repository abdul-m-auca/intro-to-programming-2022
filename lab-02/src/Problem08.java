import java.util.Scanner;
public class Problem08 {
    public static void main(String[] args) {
        //Create new Scanner object
        Scanner input = new Scanner(System.in);
        final double KilogramPerPound = 0.454;
        // prompt to enter the numbers in pounds

        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        // convert pound into kilograms
        double kilograms = pounds * KilogramPerPound;
        //Display the results

        System.out.println(pounds + " pounds is " + kilograms +" kilograms ");


    }
}
