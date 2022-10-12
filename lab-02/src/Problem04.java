import java.util.*;

public class Problem04 {
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Length in inches? ");

        double inches = input.nextInt();
        double lengthInCm = CM_PER_INCH * 2.54;

        //results

        System.out.println("%.2f in. = %.2f cm%n", inches, lengthInCm);
    }
}
