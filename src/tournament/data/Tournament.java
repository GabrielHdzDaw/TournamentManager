package tournament.data;

/**
 * Represents a tournament with a name, associated game, and prize.
 */
public abstract class Tournament {
    String name;
    String associatedGame;
    double prize;

    /**
     * Constructs a tournament with the specified name, associated game, and prize.
     *
     * @param name the name of the tournament
     * @param associatedGame the game associated with the tournament
     * @param prize the prize amount for the tournament
     */
    public Tournament(String name, String associatedGame, double prize){
        this.name = name;
        this.associatedGame = associatedGame;
        this.prize = prize;
    }
    /**
     * Returns the name of the tournament.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name of the tournament.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Returns the game associated with the tournament.
     *
     * @return the associated game
     */
    public String getAssociatedName() {
        return associatedGame;
    }
    /**
     * Sets the game associated with the tournament.
     *
     * @param associatedGame the game to set
     */
    public void setAssociatedgame(String associatedGame) {
        this.associatedGame = associatedGame;
    }
    /**
     * Returns the prize amount for the tournament.
     *
     * @return the prize
     */
    public double getPrize() {
        return prize;
    }
    /**
     * Sets the prize amount for the tournament.
     *
     * @param prize the prize to set
     */
    public void setPrize(double prize) {
        this.prize = prize;
    }
    /**
     * Returns a string representation of the tournament.
     *
     * @return a string describing the tournament
     */
    @Override
    public String toString() {
        return name + " (" + associatedGame + ")";
    }
}