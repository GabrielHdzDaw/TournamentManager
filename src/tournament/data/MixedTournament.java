package tournament.data;

import tournament.exceptions.CustomException;

public class MixedTournament extends Tournament{
    String gameMode;
    public MixedTournament(String name, String associatedGame, double prize, String gameMode) throws CustomException {
        super(name, associatedGame, prize);
        setGameMode(gameMode);
    }
    public String getGameMode() {
        return gameMode;
    }
    public void setGameMode(String gameMode) throws CustomException{
        if (gameMode.equals("1v1") || gameMode.equals("5v5")) {
            this.gameMode = gameMode;
        } else {
            throw new CustomException("Invalid game mode. Valid modes are '1v1' and '5v5'.");
        }
    }
    @Override
    public String toString() {
        return "Mixed Tournament - " + super.toString() + " - Game mode: " + gameMode + " - Prize: " + prize + "€";
    }
}