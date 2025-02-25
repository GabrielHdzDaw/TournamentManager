package tournament.data;

import java.util.Scanner;

public class MixedTournament extends Tournament{
    String gameMode;
    public MixedTournament(String name, String associatedName, int prize, String gameMode) {
        super(name, associatedName, prize);
        setGameMode(gameMode);
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        if (gameMode.equals("1v1") || gameMode.equals("5v5")) {
            this.gameMode = gameMode;
        } else {
            //TODO EXCEPTION CLASS
            throw new IllegalArgumentException("Invalid game mode. Valid modes are '1v1' and '5v5'.");
        }
    }
    @Override
    public String toString() {
        return super.toString() + gameMode;
    }
}