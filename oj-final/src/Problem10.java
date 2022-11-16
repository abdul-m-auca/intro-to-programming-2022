import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int sum = n;

        for (int i = 0; i < k; i++) {
            n += 10;
            sum += n;
        }
        System.out.println(sum);
    }
}
