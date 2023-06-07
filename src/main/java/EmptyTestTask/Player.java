package EmptyTestTask;

public class Player {
    private final String playerName;
    private int playerScore;

    public Player(String name) {
        this.playerName = name;
        this.playerScore = 0;
    }

    public int getScore() {
        return playerScore;
    }

    public void addToScore(int points) {
        assert points >= 0;
        this.playerScore += points;
    }

    public String getName() {
        return playerName;
    }
}
