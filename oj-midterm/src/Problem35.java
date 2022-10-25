import java.util.Scanner;

public class Problem35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int speedLimit = input.nextInt();
        int speedOfCar = input.nextInt();

        int fine = 0;
        if (speedOfCar <= speedLimit) {
            System.out.println("Congratulations, you are within the speed limit! ");
        } else if (speedOfCar - speedLimit >= 1 && speedOfCar - speedLimit <= 20) {
            fine = 100;
        } else if (speedOfCar - speedLimit >= 21 && speedOfCar - speedLimit <= 30) {
            fine = 270;
        } else {
            fine = 500;
            System.out.println("You are speeding and your fine is $F " + fine);
        }
    }
}
