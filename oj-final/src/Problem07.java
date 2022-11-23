import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rounds = input.nextInt();
        int AllAntoniosPoints = 100;
        int AllDavidPoints = 100;
        for (int i = 0; i < rounds; i++) {
            int antoniosPoints = input.nextInt();
            int davidsPoints = input.nextInt();
            if (antoniosPoints > davidsPoints) {
                AllDavidPoints -= antoniosPoints;
            } else if (antoniosPoints < davidsPoints) {
                AllAntoniosPoints -= davidsPoints;

            }
        }
        System.out.println(AllAntoniosPoints);
        System.out.println(AllDavidPoints);
    }
}