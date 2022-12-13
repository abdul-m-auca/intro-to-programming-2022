import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for ten numbers
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Display all the distinct numbers
        int[] distinctNumbers = eliminateDuplicates(numbers);
        System.out.print("The distinct numbers are: ");
        for (int distinctNumber : distinctNumbers) {
            System.out.print(distinctNumber + " ");
        }
        System.out.println();
    }

    public static int[] eliminateDuplicates(int[] list) {
        int nDuplicates = 0;
        boolean[] isDuplicate = new boolean[list.length];

        // Go through each element of the list
        for (int i = 0; i < list.length; i++) {
            // Check if it's a duplicate
            for (int j = 0; j < i; j++) {
                if (list[j] == list[i]) {
                    isDuplicate[i] = true;
                    nDuplicates++;
                    break;
                }
            }
        }

        // Create new array and insert all non-duplicate elements from the list
        int[] distinctElements = new int[list.length - nDuplicates];
        int j = 0;
        for (int i = 0; i < list.length; i++) {
            if (!isDuplicate[i]) {
                distinctElements[j] = list[i];
                j++;
            }
        }

        return distinctElements;
    }

}
