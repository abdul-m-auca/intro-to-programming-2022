import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if (a == 0) {
            a = a + 24;
        }

        if (b < 45) {
            a = a - 1;
        }

        if (b < 45) {
            b = b + 60;
        }
        int time = b - 45;

        System.out.print(a + " ");

        System.out.print(time);
    }
}
