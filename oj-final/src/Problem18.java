import java.util.*;

public class Problem18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the number of tiles
        int nTiles = input.nextInt();

        // Find the side length of the biggest square that can
        // be built using the tiles
        int sideLength = 1;
        while (Math.pow(sideLength + 1, 2) <= nTiles) {
            sideLength++;
        }

        // Display the result
        System.out.println("The largest square has side length " + sideLength + ".");
    }
}
