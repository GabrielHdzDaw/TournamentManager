package tournament.data;

import tournament.exceptions.CustomException;

/**
 * Represents a tournament that allows both individual and team participation.
 */
public class MixedTournament extends Tournament{
    String gameMode;
    /**
     * Constructs a MixedTournament with the specified name, associated game, prize, and game mode.
     *
     * @param name the name of the tournament
     * @param associatedGame the game associated with the tournament
     * @param prize the prize amount for the tournament
     * @param gameMode the game mode (e.g., "1v1" or "5v5")
     * @throws CustomException if the game mode is invalid
     */
    public MixedTournament(String name, String associatedGame, double prize, String gameMode) throws CustomException {
        super(name, associatedGame, prize);
        setGameMode(gameMode);
    }
    /**
     * Returns the game mode of the tournament.
     *
     * @return the game mode
     */
    public String getGameMode() {
        return gameMode;
    }
    /**
     * Sets the game mode of the tournament.
     *
     * @param gameMode the game mode to set
     * @throws CustomException if the game mode is invalid
     */
    public void setGameMode(String gameMode) throws CustomException{
        if (gameMode.equals("1v1") || gameMode.equals("5v5")) {
            this.gameMode = gameMode;
        } else {
            throw new CustomException("Invalid game mode. Valid modes are '1v1' and '5v5'.");
        }
    }
    /**
     * Returns a string representation of the mixed tournament.
     *
     * @return a string describing the tournament
     */
    @Override
    public String toString() {
        return "Mixed Tournament - " + super.toString() + " - Game mode: " + gameMode + " - Prize: " + prize + "€";
    }
}