import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Eyafee Al Hossain (B00868052)
 */

public class NhlStats {
    private List<PlayerRecord> playerRecordList;
    private HashMap<String, Integer> mostPenaltyMinutes;
    private HashMap<String, Integer> mostGameWinningGoals;

    public NhlStats(){
        this.playerRecordList = new List<PlayerRecord>();
        this.mostPenaltyMinutes = new HashMap<String, Integer>();
        this.mostGameWinningGoals = new HashMap<String, Integer>();
    }

    //METHOD
    public void add(PlayerRecord playerRecord){
        playerRecordList.add(playerRecord);
    }
    public boolean isEmpty(){
        return playerRecordList.isEmpty();
    }
    public PlayerRecord first(){
        return playerRecordList.first();
    }
    public PlayerRecord next(){
        return playerRecordList.next();
    }
    public void mostPoint(){
        PlayerRecord playerRecord1 = playerRecordList.first();
        int initial;
        int max = 0;
        while(playerRecord1 != null){
            initial = playerRecord1.getGoalsScored() + playerRecord1.getAssists();
            if(initial>max){
                max = initial;
            }
            playerRecord1 = playerRecordList.next();
        }
        PlayerRecord playerRecord2 = playerRecordList.first();
        String nameOfPlayer;
        String nameOfTeam;
        while(playerRecord2 != null){
            if(playerRecord2.getGoalsScored() + playerRecord2.getAssists() == max){
                nameOfPlayer = playerRecord2.getPlayerName();
                nameOfTeam = playerRecord2.getTeamName();

                System.out.println("Player Name: " + nameOfPlayer);
                System.out.println("Team Name: " + nameOfTeam);
                System.out.println();
            }
            playerRecord2 = playerRecordList.next();
        }
    }
    public void mostAggressivePlayer() {
        PlayerRecord playerRecord1 = playerRecordList.first();
        int initial;
        int max = 0;
        while (playerRecord1 != null) {
            initial = playerRecord1.getPenaltyMinutes();
            if (initial > max) {
                max = initial;
            }
            playerRecord1 = playerRecordList.next();
        }
        PlayerRecord playerRecord2 = playerRecordList.first();
        String nameOfPlayer;
        String nameOfTeam;
        String position;
        while (playerRecord2 != null) {
            if (playerRecord2.getPenaltyMinutes() == max) {
                nameOfPlayer = playerRecord2.getPlayerName();
                nameOfTeam = playerRecord2.getTeamName();
                position = playerRecord2.getPositionOfPlayer();
                System.out.println("Player Name: " + nameOfPlayer);
                System.out.println("Team Name: " + nameOfTeam);
                System.out.println("Position: " + position);
                System.out.println();
            }
            playerRecord2 = playerRecordList.next();
        }
    }
    public void mostValuablePlayer(){
        PlayerRecord playerRecord1 = playerRecordList.first();
        int initial;
        int max = 0;
        while(playerRecord1 != null){
            initial = playerRecord1.getGameWinningGoals();
            if(initial > max){
                max = initial;
            }
            playerRecord1 = playerRecordList.next();
        }
        PlayerRecord playerRecord2 = playerRecordList.first();
        String nameOfPlayer;
        String nameOfTeam;
        while(playerRecord2 != null){
            if(playerRecord2.getGameWinningGoals() == max){
                nameOfPlayer = playerRecord2.getPlayerName();
                nameOfTeam = playerRecord2.getTeamName();
                System.out.println("Player Name: " + nameOfPlayer);
                System.out.println("Team Name: " + nameOfTeam);
                System.out.println();
            }
            playerRecord2 = playerRecordList.next();
        }
    }
    public void mostPromisingPlayer(){
        PlayerRecord playerRecord1 = playerRecordList.first();
        int initial;
        int max = 0;
        while(playerRecord1 != null){
            initial = playerRecord1.getShotsOnGoal();
            if(initial>max){
                max = initial;
            }
            playerRecord1 = playerRecordList.next();
        }
        PlayerRecord playerRecord2 = playerRecordList.first();
        String nameOfPlayer;
        String nameOfTeam;
        while(playerRecord2 != null){
            if(playerRecord2.getShotsOnGoal() == max){
                nameOfPlayer = playerRecord2.getPlayerName();
                nameOfTeam = playerRecord2.getTeamName();
                System.out.println("Player Name: " + nameOfPlayer);
                System.out.println("Team Name: " + nameOfTeam);
                System.out.println();
            }
            playerRecord2 = playerRecordList.next();
        }
    }
    public void mostPenaltyMinutes(){
        PlayerRecord playerRecord1 = playerRecordList.first();
        while(playerRecord1 != null){
            mostPenaltyMinutes.putIfAbsent(playerRecord1.getTeamName(), 0);
            playerRecord1 = playerRecordList.next();
        }
        PlayerRecord playerRecord2 = playerRecordList.first();
        while(playerRecord2 != null){
            mostPenaltyMinutes.replace(playerRecord2.getTeamName(), mostPenaltyMinutes.get(playerRecord2.getTeamName()) + playerRecord2.getPenaltyMinutes());
            playerRecord2 = playerRecordList.next();
        }
        int maxValue = Collections.max(mostPenaltyMinutes.values());
        String teamName;
        for (Map.Entry<String, Integer> entry: mostPenaltyMinutes.entrySet()){
            if(entry.getValue() == maxValue){
                teamName = entry.getKey();
                System.out.println("Team Name: " + teamName);
                System.out.println();
            }
        }
    }
    public void mostGameWinningGoals(){
        PlayerRecord playerRecord1 = playerRecordList.first();
        while(playerRecord1 != null){
            mostGameWinningGoals.putIfAbsent(playerRecord1.getTeamName(), 0);
            playerRecord1 = playerRecordList.next();
        }
        PlayerRecord playerRecord2 = playerRecordList.first();
        while(playerRecord2 != null){
            mostGameWinningGoals.replace(playerRecord2.getTeamName(), mostGameWinningGoals.get(playerRecord2.getTeamName()) + playerRecord2.getGameWinningGoals());
            playerRecord2 = playerRecordList.next();
        }
        int maxValue = Collections.max(mostGameWinningGoals.values());
        String teamName;
        for (Map.Entry<String, Integer> entry: mostGameWinningGoals.entrySet()){
            if(entry.getValue() == maxValue){
                teamName = entry.getKey();
                System.out.println("Team Name: " + teamName);
                System.out.println();
            }
        }
    }
}


