import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Eyafee Al Hossain (B00868052)
 */

public class NhlListDemo {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);

        //Creating nhlStats Object
        NhlStats nhlStats = new NhlStats();

        //Reading inputs
        System.out.println("Enter the filename to read from: ");

        String fileName = in.nextLine();
        File file = new File(fileName);
        Scanner input = new Scanner (file);
        StringTokenizer token;

        while(input.hasNext()){
            String line = input.nextLine();
            token = new StringTokenizer(line, "\t");
            String playerName = token.nextToken();
            String positionOfPlayer = token.nextToken();
            String teamName = token.nextToken();

            int gamesPlayed = Integer.parseInt(token.nextToken());
            int goalsScored = Integer.parseInt(token.nextToken());
            int assisted = Integer.parseInt(token.nextToken());
            int penaltyTimes = Integer.parseInt(token.nextToken());
            int shotsOnGoal = Integer.parseInt(token.nextToken());
            int gameWinningGoals = Integer.parseInt(token.nextToken());

            //Creating player record object
            PlayerRecord playerRecord = new PlayerRecord(playerName, positionOfPlayer, teamName, gamesPlayed, goalsScored, assisted, penaltyTimes, shotsOnGoal, gameWinningGoals);

            //Adding playerRecord with nhlStats list
            nhlStats.add(playerRecord);
        }
        //OUTPUT
        System.out.println("NHL Results Summary");
        System.out.println();
        System.out.println("Players with highest points and their teams:");
        nhlStats.mostPoint();
        System.out.println("Most aggressive players, their teams and their positions:");
        nhlStats.mostAggressivePlayer();
        System.out.println("Most valuable players and their teams:");
        nhlStats.mostValuablePlayer();
        System.out.println("Most promising players and their teams:");
        nhlStats.mostPromisingPlayer();
        System.out.println("Teams that had the most number of penalty minutes:");
        nhlStats.mostPenaltyMinutes();
        System.out.println("Teams that had the most number of game winning goals:");
        nhlStats.mostGameWinningGoals();
    }
}
