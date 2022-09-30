import java.util.*;
public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int R = input.nextInt();
        int S = input.nextInt();

        int L = (R*8+S*3)-28;
        //result
        System.out.println(L);
    }
}
