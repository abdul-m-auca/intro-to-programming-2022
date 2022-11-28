import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Your coordinate: ");
        int userX = input.nextInt();

        System.out.print("Coordinate of 1st point: ");
        int X1 = input.nextInt();

        System.out.print("Coordinate of 2st point:");
        int X2 = input.nextInt();

        int d1 = X1 - userX;
        if (d1 < 1) {
            d1 = -d1;
        }
        int d2 = X2 - userX;
        if (d2 < 1) {
            d2 = -d2;
        }
    }

    static int myAbs(int n) {
        if (n < 0) {
            n = -n;
        }
    }
}
