import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("complexity level? ");
        int level = input.nextInt();

        switch (level) {
            case 4:
            case 5:
                System.out.println("You are a pro gamer ");
                break;
            case 2:
            case 3:
                System.out.println("You are an experienced gamer ");
                break;
            case 1:
                System.out.println("You are a beginner ");
                break;
            case 0:
                System.out.println("You are a total newbie ");
                break;
            default:
                System.out.println("Incorrect level number " + level);
                break;
        }
    }
}
