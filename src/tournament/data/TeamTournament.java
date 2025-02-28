package tournament.data;

/**
 * Represents a tournament where players compete in teams.
 */
public class TeamTournament extends Tournament{
    int playersPerTeam;

    /**
     * Constructs a TeamTournament with the specified name, associated game, prize, and players per team.
     *
     * @param name the name of the tournament
     * @param associatedGame the game associated with the tournament
     * @param prize the prize amount for the tournament
     * @param playersPerTeam the number of players per team
     */
    public TeamTournament(String name, String associatedGame, double prize, int playersPerTeam) {
        super(name, associatedGame, prize);
        this.playersPerTeam = playersPerTeam;
    }
    /**
     * Returns the number of players per team.
     *
     * @return the number of players per team
     */
    public int getPlayersPerTeam() {
        return playersPerTeam;
    }
    /**
     * Sets the number of players per team.
     *
     * @param playersPerTeam the number of players per team to set
     */
    public void setPlayersPerTeam(int playersPerTeam) {
        this.playersPerTeam = playersPerTeam;
    }
    /**
     * Returns a string representation of the team tournament.
     *
     * @return a string describing the tournament
     */
    @Override
    public String toString() {
        return "Team tournament - " + super.toString() + " - Players per team: " + playersPerTeam + " - Prize: " + prize + "€";
    }
}