public class Problem10 {
    public static void main(String[] args) {

        // Print the table
        System.out.printf("%-10s m(i)%n", "i");
        System.out.println("------------------");

        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-10d %7.4f%n", i, m(i));
        }
    }

    public static double m(int i) {
        double res = 0;
        for (int j = 1; j <= i; j++) {
            res += (double) j / (j + 1);
        }
        return res;
    }
}
