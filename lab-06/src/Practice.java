import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Your coordinate: ");
        int userX = input.nextInt();

        System.out.println("Your first coordinate: ");
        int X1 = input.nextInt();

        System.out.println("Your second coordinate: ");
        int X2 = input.nextInt();

        int d1 = myAbs(X1 - userX);
        int d2 = myAbs(X2 - userX);


        if (d1 < d2) {
            System.out.println("Distance is closer to first. Distance is" + d1);
        } else if (d2 < d1) {
            System.out.println("Distance is closer to second. Distance is " + d2);
        } else {
            System.out.println("Distance is the same" + d1);
        }
    }

    static int myAbs(int n) {
        if (n < 0) {
            n = -n;
        }
        return n;
    }
}
