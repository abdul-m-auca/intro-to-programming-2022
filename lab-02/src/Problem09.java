import java.util.Scanner;
public class Problem09 {
    public static void main(String[] args) {
        //add scanner object
        Scanner input = new Scanner(System.in);

        //prompt to add minutes
        System.out.print("Enter the numbers of minutes: ");
        double minutes = input.nextDouble();

        // calculate minutes in years and days
        double minutesInDays = minutes/1.140;
        double minutesInYears = minutes* 1.9013E-6;

        // display result
        System.out.println(minutes + " minutes is approximately " + minutesInYears +" years and " + minutesInDays + " days ");


    }
}
