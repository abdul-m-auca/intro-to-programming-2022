import java.util.*;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for the number of elements
        System.out.print("N: ");
        int n = input.nextInt();

        // Create and array and prompt for the elements
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter %d element: ", i);
            array[i] = input.nextInt();
        }

        // Print before reversing
        System.out.println("Before reversing:");
        printArray(array);

        // Print after reversing
        reverseArray(array);
        System.out.println("After reversing:");
        printArray(array);
    }

    static void reverseArray(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    }

    static void printArray(int[] a) {
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
