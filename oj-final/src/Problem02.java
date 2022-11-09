import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= a; ++i) {

            String word = input.nextLine();
            if (i % 2 == 1) {
                System.out.println(word);
            }
        }
    }
}
