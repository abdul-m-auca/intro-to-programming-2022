public class Problem05 {
    public static void main(String[] args) {

        // Create arrays
        int[] a1 = new int[5];
        int[] a2 = new int[10];
        int[] a3 = new int[10];
        int[] a4 = new int[10];
        int[] a5 = new int[15];

        // Initialize arrays with random values
        initializeArrayRandomly(a1, 1, 20);
        initializeArrayRandomly(a2, 1, 20);
        initializeArrayRandomly(a3, 1, 20);
        initializeArrayRandomly(a4, 1, 20);
        initializeArrayRandomly(a5, 1, 20);

        // Print each array before and after sorting
        testArraySorting(a1, 1);
        testArraySorting(a2, 2);
        testArraySorting(a3, 3);
        testArraySorting(a4, 4);
        testArraySorting(a5, 5);
    }

    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int minIndex = i;

            // Find the minimum from i to length - 1
            for (int j = i + 1; j < a.length; j++) {
                if (min > a[j]) {
                    min = a[j];
                    minIndex = j;
                }
            }

            // Swap the a[i] with the minimum if necessary
            if (minIndex != i) {
                a[minIndex] = a[i];
                a[i] = min;
            }
        }
    }

    static void printArray(int[] a) {
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static void initializeArrayRandomly(int[] a, int low, int high) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (low + Math.random() * high);
        }
    }

    static void testArraySorting(int[] a, int i) {
        System.out.printf("%d. Before sorting: ", i);
        printArray(a);
        System.out.print("   After sorting: ");
        selectionSort(a);
        printArray(a);
    }
}
