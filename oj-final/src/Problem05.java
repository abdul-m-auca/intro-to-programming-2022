import java.util.Scanner;
public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int g = input.nextInt();
        int t = input.nextInt();
        int n = input.nextInt();
        int allowedWeight = (g - t) * 9 / 10;
        int overallExtraWeight = 0;
        for (int i =0; i < n; i++ ){
            int extraWeight = input.nextInt();
            overallExtraWeight += extraWeight;
    }
}
