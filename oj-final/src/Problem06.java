import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double w = input.nextInt();
        double h = input.nextInt();
        double l = Math.pow(w * w + h * h, 0.5);
        for (int i = 0; i < n; i++) {
            int match = input.nextInt();
            if (match <= l) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
