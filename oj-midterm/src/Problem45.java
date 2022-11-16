import java.util.*;

public class Problem45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get starting and ending points of two clips
        int start1 = input.nextInt();
        int end1 = input.nextInt();
        int start2 = input.nextInt();
        int end2 = input.nextInt();

        // Determine if two clips overlap
        if (start1 < start2 ? end1 > start2 : end2 > start1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}