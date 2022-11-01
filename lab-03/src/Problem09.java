import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computer = (int)(Math.random() * 3);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = input.nextInt();

        System.out.print("The computer is ");

        switch (computer) {
            case 0 -> System.out.print("scissor.");
            case 1 -> System.out.print("rock.");
            case 2 -> System.out.print("paper.");
        }

        System.out.print(" You are ");

        switch (user) {
            case 0 -> System.out.print("scissor");
            case 1 -> System.out.print("rock");
            case 2 -> System.out.print("paper ");
        }

        if (computer == user)
            System.out.println(" too. It is a draw");
        else {
            boolean win = (user == 0 && computer == 2) ||
                    (user == 1 && computer == 0) ||
                    (user == 2 && computer == 1);

            else
                System.out.println(". You lose");
        }
    }
}