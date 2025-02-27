package tournament.data;

public class Player extends Participant {
    int level;
    float ranking;

    public Player(String name, int level, float ranking) {
        super(name);
        setLevel(level);
        this.ranking = ranking;
    }

    public float getRanking() {
        return ranking;
    }
    public void setRanking(float ranking) {
        this.ranking = ranking;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        if (level < 1 || level > 100) {
            throw new IllegalArgumentException("Level must be between 1 and 100.");
        }
        this.level = level;
    }
    @Override
    public String toString(){
        return "Player: " + name + " - Level: " + level + " - Ranking: " + ranking;
    }
}
