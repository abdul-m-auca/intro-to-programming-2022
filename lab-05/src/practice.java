import java.util.Scanner;

public class practice {
    public static final int TABLE_SIZE = 9;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //mul
        System.out.println("multiplication table");

        // draw the top
        System.out.print(" ");
        for (int i = 1; i <= TABLE_SIZE; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // draw the dash
        for (int i = 0; i < TABLE_SIZE * 2 + 1; i++) {
            System.out.printf(" -");
        }
        System.out.println();

        // draw the row
        for (int i = 1; i <= TABLE_SIZE; i++) {
            System.out.printf("%d|", i);
            for (int j = 1; j <= TABLE_SIZE; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}