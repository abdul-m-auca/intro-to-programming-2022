import java.util.*;
public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();
        double h = input.nextDouble();

        double v = Math.PI * r * r * h/ 3;

        System.out.printf("%.2f%n", v);


    }
}
