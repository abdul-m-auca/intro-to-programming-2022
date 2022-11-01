import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int result = (number >= 5550000) && (number < 5560000) ? 1 : 0;

        System.out.print(result);
    }
}