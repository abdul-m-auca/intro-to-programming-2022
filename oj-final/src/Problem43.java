import java.util.Scanner;

public class Problem43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] sumOfRows = new int[4];
        int[] sumOfCol = new int[4];

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                int number = input.nextInt();
                sumOfRows[r] += number;
                sumOfCol[c] += number;
            }
        }

        boolean isMagic = true;

        for (int i = 1; i < 4; i++) {
            if (sumOfRows[0] != sumOfRows[i]) {
                isMagic = false;
                break;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (sumOfRows[0] != sumOfCol[i]) {
                isMagic = false;
                break;
            }

        }
        if (isMagic) {
            System.out.println("Magic");
        } else {
            System.out.println("not Magic");
        }
    }
}
