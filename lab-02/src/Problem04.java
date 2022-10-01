import java.util.*;
public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Length in inches? ");

        int inches = input.nextInt();
        double centimeters = inches*2.54;

        //results

        System.out.println(inches + " in. " + "= " + centimeters + " cm.");
    }
}
