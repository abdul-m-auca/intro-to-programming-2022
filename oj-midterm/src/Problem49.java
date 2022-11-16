import java.util.*;

public class Problem49 {
    public static final int PEOPLE_FED_PER_PIZZA = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of people with certain pizza preferences
        int pepperoniLovers = input.nextInt();
        int cheeseLovers = input.nextInt();
        int vegetarianLovers = input.nextInt();

        // Calculate the number of each type of pizza needed
        int pepperoniPizzas = (int) Math.ceil((double) pepperoniLovers / PEOPLE_FED_PER_PIZZA);
        int cheesePizzas = (int) Math.ceil((double) cheeseLovers / PEOPLE_FED_PER_PIZZA);
        int vegetarianPizzas = (int) Math.ceil((double) vegetarianLovers / PEOPLE_FED_PER_PIZZA);

        // Calculate and display the total number of pizzas ordered
        int pizzasTotal = pepperoniPizzas + cheesePizzas + vegetarianPizzas;
        System.out.println(pizzasTotal);
    }
}