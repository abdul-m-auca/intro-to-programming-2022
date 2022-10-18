import java.util.Locale;
import java.util.*;

public class Problem02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("number of points? ");

        double points = input.nextDouble();

        //<, >, ==, !=, <=, >=

        if (points < 40) {
            System.out.println("You failed “Intro to Programming”!!!");
            System.out.println("You can take it again in the fall semester next year.");
        } else {
            System.out.println("You passed “Intro to Programming”!!!");
            System.out.println("You should take “Object-Oriented Programming” in the next semester");
        }
    }
}
