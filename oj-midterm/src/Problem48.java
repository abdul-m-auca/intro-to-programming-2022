import java.util.Scanner;

public class Problem48{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();
        int t = in.nextInt();
        if(Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2))<=t || Math.sqrt(Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2))<=t) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}