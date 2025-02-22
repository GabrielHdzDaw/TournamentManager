package tournament.data;

import java.util.Scanner;

public class MixedTournament extends Tournament{

    String gameMode;
    public MixedTournament(String name, String associatedName, int prize, String gameMode) {
        super(name, associatedName, prize);
        this.gameMode = gameMode;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    @Override
    public String toString() {
        return super.toString() + gameMode;
    }
}