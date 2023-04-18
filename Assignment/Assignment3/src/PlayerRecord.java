public class PlayerRecord {

    //Instant Variable
    private String playerName;
    private String positionOfPlayer;
    private String teamName;
    private int gamesPlayed;
    private int goalsScored;
    private int assists;
    private int penaltyMinutes;
    private int shotsOnGoal;
    private int gameWinningGoals;

    //Constructor
    public PlayerRecord(String playerName, String position, String teamName, int gamesPlayed, int goalsScored, int assists, int penaltyMinutes, int shotsOnGoal, int gameWinningGoals){
        this.playerName = playerName;
        this.positionOfPlayer = position;
        this.teamName = teamName;
        this.gamesPlayed = gamesPlayed;
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.penaltyMinutes = penaltyMinutes;
        this.shotsOnGoal = shotsOnGoal;
        this.gameWinningGoals = gameWinningGoals;
    }

    //Getters
    public String getPlayerName(){
        return playerName;
    }
    public String getPositionOfPlayer(){
        return positionOfPlayer;
    }
    public String getTeamName(){
        return teamName;
    }
    public int getGamesPlayed(){
        return gamesPlayed;
    }
    public int getGoalsScored(){
        return goalsScored;
    }
    public int getAssists(){
        return assists;
    }
    public int getPenaltyMinutes(){
        return penaltyMinutes;
    }
    public int getShotsOnGoal(){
        return shotsOnGoal;
    }
    public int getGameWinningGoals(){
        return gameWinningGoals;
    }
}
