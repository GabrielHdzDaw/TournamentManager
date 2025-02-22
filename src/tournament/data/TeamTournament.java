package tournament.data;

import java.util.Scanner;

public class TeamTournament extends Tournament{
    int playersPerTeam;

    public TeamTournament(String name, String associatedName, int prize, int playersPerTeam) {
        super(name, associatedName, prize);
        this.playersPerTeam = playersPerTeam;
    }

    public int getPlayersPerTeam() {
        return playersPerTeam;
    }

    public void setPlayersPerTeam(int playersPerTeam) {
        this.playersPerTeam = playersPerTeam;
    }

    @Override
    public String toString() {
        return super.toString() + playersPerTeam + " vs " + playersPerTeam;
    }
}