import java.util.Scanner;

public class Problem36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int eyes = input.nextInt();

        if (a >= 3 && eyes <= 4) {
            System.out.println("TroyMartian");
        } else if (a <= 6 && eyes >= 2) {
            System.out.println("VladSaturnian");
        } else if (a <= 2 && eyes <= 3) {
            System.out.println("GraemeMercurian");
        }
    }
}
