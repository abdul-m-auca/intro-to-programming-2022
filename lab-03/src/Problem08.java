import java.util.Scanner;

public class amoto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three integers
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();


        // Sort numbers
        if (number2 < number1) {
            int t = number1;
            number1 = number2;
            number2 = t;
        }
        if (number2 < number3) {
            int t = number2;
            number2 = number3;
            number3 = t;
        }
        if (number3 < number2) {
            int t = number2;
            number2 = number3;
            number3 = t;
        }
        System.out.println(number1 + " " + number2 + " " + number3);
    }
}