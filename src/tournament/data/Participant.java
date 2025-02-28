package tournament.data;

/**
 * Represents a participant in a tournament, which can be a player or a team.
 */
public abstract class Participant {
    String name;

    /**
     * Constructs a participant with the specified name.
     *
     * @param name the name of the participant
     */
    public Participant(String name) {
        this.name = name;
    }
    /**
     * Returns the name of the participant.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name of the participant.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}