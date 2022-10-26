import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = 0.1;

        double s = 0;

        s += x;
        s += x;
        s += x;
        s += x;
        s += x;
        s += x;
        s += x;
        s += x;
        s += x;
        s += x;

        //if (s==1.0)
        if (Math.abs(s - 1) <= 1E-9) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal ");
            System.out.println(s);
        }
    }
}
