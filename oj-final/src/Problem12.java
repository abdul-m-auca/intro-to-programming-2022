import java.util.*;

public class Problem12 {
    public static final int POINT_VALUE = 5;
    public static final int FOUL_VALUE = -3;
    public static final int GOLD_RATING = 41;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of players
        int nPlayers = input.nextInt();

        // To keep track of the number of players with rating greater than 40
        int nGoldPlayers = 0;

        // Go through each player's statistics and determine the gold players
        for (int i = 0; i < nPlayers; i++) {

            // Get the number of scored points and fouls of each player
            int nPoints = input.nextInt();
            int nFouls = input.nextInt();

            // Calculate the rating
            int rating = nPoints * POINT_VALUE + nFouls * FOUL_VALUE;

            // Determine if the player is gold and update the counter
            if (rating >= GOLD_RATING) {
                nGoldPlayers++;
            }
        }

        // Display the number of gold players and add a plus sign if the team is a gold team
        System.out.printf("%d%s%n", nGoldPlayers,
                nGoldPlayers == nPlayers ? "+" : "");
    }
}
