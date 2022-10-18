import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        String s = input.next();
        int n2 = input.nextInt();

        if (s.compareTo("Infront") == 0) {
            System.out.print(n1 - n2);
        } else {
            System.out.print(n1 + n2);
        }
    }
}