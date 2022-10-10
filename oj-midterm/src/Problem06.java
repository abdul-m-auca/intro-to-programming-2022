import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int weightOfClass = input.nextInt();
        int lengthOfClass = input.nextInt();
        int tileLength = input.nextInt();
        weightOfClass = weightOfClass / tileLength;
        lengthOfClass = lengthOfClass / tileLength;

        int maxNumberOfTiles = weightOfClass * lengthOfClass;

        System.out.print(maxNumberOfTiles);
    }
}