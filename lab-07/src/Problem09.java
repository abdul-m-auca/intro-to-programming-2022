import java.util.*;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for 10 numbers
        double[] numbers = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        // Display the index of the smallest element
        System.out.println("Index of the smallest element: " + indexOfSmallestElement(numbers));
    }

    public static int indexOfSmallestElement(double[] array) {
        double min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
