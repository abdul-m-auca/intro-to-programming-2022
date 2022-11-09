import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight of package in pounds" + " ");

        double weight = input.nextDouble();

        double cost;
        if (weight <= 1 && weight > 0) {
            cost = 3.5;
            System.out.println("Cost:" + " " + "$" + cost);


        } else if (weight <= 3 && weight > 1) {
            cost = 5.5;

            System.out.println("Cost:" + " " + "$" + cost);
        } else if (weight <= 10 && weight > 3) {
            cost = 8.5;
            System.out.println("Cost:" + " " + "$" + cost);

        } else if (weight <= 20 && weight > 10) {
            cost = 10.5;
            System.out.println("Cost:" + " " + "$" + cost);
        } else if (weight == 0 || weight < 0) {

            System.out.println("Invalid input.");


        } else {

            System.out.println("The package cannot be shipped.");

        }
    }
}