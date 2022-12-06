import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Your coordinate: ");
        int userX = input.nextInt();

        System.out.print("Coordinate of 1st point: ");
        int X1 = input.nextInt();

        System.out.print("Coordinate of 2st point: ");
        int X2 = input.nextInt();

        //DRY do not repeat yourself

        int d1 = myAbs(X1 - userX);
        int d2 = myAbs(X2 - userX);

        if (d1 < d2) {
            System.out.println("1st is closer. Distance is " + d1);
        } else if (d2 < d1) {
            System.out.println("2nd is closer. Distance is " + d2);
        } else {
            System.out.println("Distance is the same " + d1);
        }
    }

    //method
    static int myAbs(int n) {
        if (n < 0) {
            n = -n;
        }
        return n;
    }
}
