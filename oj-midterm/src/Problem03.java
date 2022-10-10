import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int youngest = in.nextInt(),
                middle = in.nextInt(),
                diff = middle - youngest,
                oldest = middle + diff;
        System.out.println(oldest);
    }
}