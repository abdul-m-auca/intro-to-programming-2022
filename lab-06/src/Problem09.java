public class Problem09 {
    public static void main(String[] args) {

        // Print the table
        System.out.printf("%-12s estimatePi(i)%n", "i");
        System.out.println("--------------------------");
        printRow(1);
        printRow(101);
        printRow(201);
        printRow(301);
        printRow(401);
        printRow(501);
        printRow(601);
        printRow(701);
        printRow(801);
        printRow(901);
    }

    public static double estimatePi(int i) {
        double dependentFactor = 0;
        for (int j = 1; j <= i; j++) {
            dependentFactor += Math.pow(-1, j + 1) / (2 * j - 1);
        }

        return 4 * dependentFactor;
    }

    public static void printRow(int i) {
        System.out.printf("%-12d %.4f%n", i, estimatePi(i));
    }
}
