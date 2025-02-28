package tournament.data;

import tournament.exceptions.CustomException;

/**
 * Represents a player participating in a tournament.
 */
public class Player extends Participant {
    int level;
    float ranking;

    /**
     * Constructs a player with the specified name, level, and ranking.
     *
     * @param name the name of the player
     * @param level the level of the player (must be between 1 and 100)
     * @param ranking the ranking of the player
     * @throws CustomException if the level is invalid
     */
    public Player(String name, int level, float ranking) throws CustomException {
        super(name);
        setLevel(level);
        this.ranking = ranking;
    }
    /**
     * Returns the ranking of the player.
     *
     * @return the ranking
     */
    public float getRanking() {
        return ranking;
    }
    /**
     * Sets the ranking of the player.
     *
     * @param ranking the ranking to set
     */
    public void setRanking(float ranking) {
        this.ranking = ranking;
    }
    /**
     * Returns the level of the player.
     *
     * @return the level
     */
    public int getLevel() {
        return level;
    }
    /**
     * Sets the level of the player.
     *
     * @param level the level to set (must be between 1 and 100)
     * @throws CustomException if the level is invalid
     */
    public void setLevel(int level) throws CustomException {
        if (level < 1 || level > 100) {
            throw new CustomException("Level must be between 1 and 100.");
        }
        this.level = level;
    }
    /**
     * Returns a string representation of the player.
     *
     * @return a string describing the player
     */
    @Override
    public String toString(){
        return "Player: " + name + " - Level: " + level + " - Ranking: " + ranking;
    }
}