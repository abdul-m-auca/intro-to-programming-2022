import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if (a % b == 0)
            System.out.print("yes");
        else
            System.out.print("no");
    }
}