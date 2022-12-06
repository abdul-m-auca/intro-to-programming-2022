import java.util.*;

public class Problem13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the number of bids
        int nBids = input.nextInt();
        input.nextLine();

        // Read through the bids and determine the winner
        String winnerName = input.nextLine();
        int winnerBid = input.nextInt();
        input.nextLine();
        for (int i = 1; i < nBids; i++) {
            String candidateName = input.nextLine();
            int candidateBid = input.nextInt();
            input.nextLine();

            if (candidateBid > winnerBid) {
                winnerBid = candidateBid;
                winnerName = candidateName;
            }
        }

        // Display the winner
        System.out.println(winnerName);
    }
}
