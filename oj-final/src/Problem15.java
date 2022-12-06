import java.util.*;

public class Problem15 {
    public static final int OVERTIME_LIMIT = 40;
    public static final double A_TAX_PERCENTAGE = 0;
    public static final double B_TAX_PERCENTAGE = 10;
    public static final double C_TAX_PERCENTAGE = 20;
    public static final double D_TAX_PERCENTAGE = 29;
    public static final double E_TAX_PERCENTAGE = 35;

    public static final int DONATION_AMOUNT = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the number of employees
        int nEmployees = input.nextInt();

        for (int i = 0; i < nEmployees; i++) {
            // Read all the info for the employee
            double rate = input.nextDouble();
            int nHours = input.nextInt();
            input.nextLine();
            String taxCategory = input.nextLine();
            String donation = input.nextLine();

            // Calculate normal hours and overtime hours
            int nNormalHours;
            int nOvertimeHours = 0;
            if (nHours > OVERTIME_LIMIT) {
                nNormalHours = OVERTIME_LIMIT;
                nOvertimeHours = nHours - OVERTIME_LIMIT;
            } else {
                nNormalHours = nHours;
            }

            // Calculate the weekly pay
            double weeklyPay = rate * nNormalHours + rate * nOvertimeHours * 2;

            // Apply taxes
            switch (taxCategory) {
                case "A":
                    weeklyPay -= weeklyPay * A_TAX_PERCENTAGE / 100;
                    break;
                case "B":
                    weeklyPay -= weeklyPay * B_TAX_PERCENTAGE / 100;
                    break;
                case "C":
                    weeklyPay -= weeklyPay * C_TAX_PERCENTAGE / 100;
                    break;
                case "D":
                    weeklyPay -= weeklyPay * D_TAX_PERCENTAGE / 100;
                    break;
                case "E":
                    weeklyPay -= weeklyPay * E_TAX_PERCENTAGE / 100;
                    break;
            }

            // Subtract the donation amount
            if (donation.equals("y")) {
                weeklyPay -= DONATION_AMOUNT;
            }

            // Display the final weekly pay
            System.out.printf("%.2f%n", weeklyPay);
        }
    }
}
