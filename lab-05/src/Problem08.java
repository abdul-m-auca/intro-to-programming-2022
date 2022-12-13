public class Problem08 {
    public static final int TABLE_SIZE = 9;

    public static void main(String[] args) {
        System.out.println("Multiplication table");

        // Print the top row
        System.out.print("  ");
        for (int i = 1; i <= TABLE_SIZE; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Print the dividing dashes
        for (int i = 1; i <= TABLE_SIZE * 2 + 1; i++) {
            System.out.print(" -");
        }
        System.out.println();

        // Print the rows
        for (int i = 1; i <= TABLE_SIZE; i++) {
            System.out.printf("%d|", i);

            // Print columns in each row
            for (int j = 1; j <= TABLE_SIZE; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
