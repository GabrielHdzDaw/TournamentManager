package tournament.data;

/**
 * Represents a match between two participants in a tournament.
 */
public class Match {
    Tournament tournament;
    String result;
    Participant participant1;
    Participant participant2;

    /**
     * Constructs a match with the specified tournament, participants, and a default result of "Pending".
     *
     * @param tournament the tournament associated with the match
     * @param participant1 the first participant in the match
     * @param participant2 the second participant in the match
     */
    public Match(Tournament tournament, Participant participant1, Participant participant2)
    {
        this.tournament=tournament;
        result="Pending";
        this.participant1=participant1;
        this.participant2=participant2;
    }
    /**
     * Returns the tournament associated with the match.
     *
     * @return the tournament
     */
    public Tournament getTournament() {
        return tournament;
    }
    /**
     * Returns the result of the match.
     *
     * @return the result
     */
    public String getResult() {
        return result;
    }
    /**
     * Sets the result of the match.
     *
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }
    /**
     * Returns a string representation of the match.
     *
     * @return a string describing the match
     */
    @Override
    public String toString() {
        return "Match in " + tournament + " - " +
                participant1 + " vs. " + participant2 +
                " - Result: " + result;
    }
}