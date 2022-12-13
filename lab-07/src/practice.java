import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nInt = new int[100];

        System.out.print("Enter a number of integers: ");

        int number = 0;
        while ((number = input.nextInt()) != 0) {
            nInt[number - 1]++;
        }

        for (int i = 0; i < 100; i++) {
            System.out.printf("%d occurs %d time%s%d", i + 1, nInt[i], nInt[1] > 1 ? "s" : " ");
        }
    }
}
