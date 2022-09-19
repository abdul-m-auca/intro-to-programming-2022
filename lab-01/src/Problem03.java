import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
         String username = input.nextLine();
         System.out.println("Hello, " + username + "!");
        System.out.println("Your name in upper case is "+ username.toUpperCase());
        System.out.println("Your name in lower case is "+ username.toLowerCase());
        System.out.println("Total number of characters is "+ username.length());
    }
}
