import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();

        if (s.contains("ss")) {
            System.out.print("hiss");
        } else {
            System.out.print("no hiss");
        }
    }
}
