package tournament.data;

import tournament.exceptions.CustomException;

/**
 * Represents a team participating in a tournament.
 */
public class Team extends Participant{
    static final int MAX_PLAYERS = 5;
    static final int MIN_PLAYERS = 2;
    Player[] players;
    int playerCount;

    /**
     * Constructs a team with the specified name.
     *
     * @param name the name of the team
     */
    public Team(String name) {
        super(name);
        this.players = new Player[MAX_PLAYERS];
        playerCount = 0;
    }
    /**
     * Returns the players in the team.
     *
     * @return the players
     */
    public Player[] getPlayers() {
        return players;
    }
    /**
     * Sets the players in the team.
     *
     * @param players the players to set
     */
    public void setPlayers(Player[] players) {
        this.players = players;
    }
    /**
     * Adds a player to the team.
     *
     * @param player the player to add
     * @throws CustomException if the team is full
     */
    public void addPlayer(Player player) throws CustomException{
        if (playerCount >= MAX_PLAYERS){
            throw new CustomException("Cannot add more players. The team is full.");
        }
        players[playerCount] = player;
        playerCount++;
    }
    /**
     * Returns the average ranking of the team.
     *
     * @return the average ranking
     */
    public float getAverageRanking() {
        if (playerCount == 0) return 0;
        float totalRanking = 0;
        for (int i = 0; i < playerCount; i++) {
            totalRanking += players[i].getRanking();
        }
        return totalRanking / playerCount;
    }
    /**
     * Returns a string representation of the team.
     *
     * @return a string describing the team
     */
    @Override
    public String toString() {
        String teammates = "";
        for(Player p:players) {
            teammates += " " + p;
        }
        return name + " - Members:" + players.length + "/5 " + teammates;
    }
}