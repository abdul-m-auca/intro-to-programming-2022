import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = input.next();

        int letter = a.length() - 2;

        System.out.print("h");
        for (int i = 0; i < 2 * letter; ++i) {
            System.out.print("e");
        }
        System.out.print("y");

    }
}
