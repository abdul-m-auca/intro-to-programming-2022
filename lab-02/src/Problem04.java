import java.util.*;

public class Problem04 {
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Length in inches? ");

        double inches = input.nextDouble();
        double lengthInCm = CM_PER_INCH * 2.54;

        //results

        System.out.printf("%.2f in. = %.2f cm%n", inches, lengthInCm);
    }
}
