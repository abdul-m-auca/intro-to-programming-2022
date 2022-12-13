import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int nShifts = input.nextInt();

        int shiftySum = number;
        for (int i = 0; i < nShifts; i++) {
            number *= 10;
            shiftySum += number;
        }

        System.out.println(shiftySum);
    }
}
