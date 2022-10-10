import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int eyeDesign = input.nextInt();
        int noseDesign = input.nextInt();
        int mouthDesign = input.nextInt();

        int possibleDesigns = eyeDesign * noseDesign * mouthDesign;

        System.out.print(possibleDesigns);
    }
}