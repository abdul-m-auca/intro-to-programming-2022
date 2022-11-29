import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        for (int i = x; i <= y; i += 60){
            System.out.println("All positions change in year "+ i);
        }
    }
}
