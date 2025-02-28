package tournament.data;

/**
 * Represents a tournament where players compete individually.
 */
public class IndividualTournament extends Tournament{
    /**
     * Constructs an IndividualTournament with the specified name, associated game, and prize.
     *
     * @param name the name of the tournament
     * @param associatedGame the game associated with the tournament
     * @param prize the prize amount for the tournament
     */
    public IndividualTournament(String name, String associatedGame, double prize) {
        super(name, associatedGame, prize);
    }
    /**
     * Returns a string representation of the individual tournament.
     *
     * @return a string describing the tournament
     */
    @Override
    public String toString() {
        return "Individual tournament - " + super.toString() + " - Prize: " + prize + "€";
    }
}