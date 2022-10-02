import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int population = 312032486 + (((31536000 / 7) - (31536000 / 13)
                + (31536000 / 45)) * years);
        System.out.println("The population in " + years + "years is " + population);



    }
}
