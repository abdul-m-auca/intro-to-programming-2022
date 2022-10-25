import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.print("Enter three integer numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();


        int t;
        // Sort numbers
        if (number2 < number1) {
            t = number1;
            number1 = number2;
            number2 = t;
        }
        if (number3 < number1) {
            t = number1;
            number1 = number3;
            number3 = t;
        }
        if (number3 < number2) {
            t = number2;
            number2 = number3;
            number3 = t;
        }
        System.out.println(number1 + " " + number2 + " " + number3);
    }
}