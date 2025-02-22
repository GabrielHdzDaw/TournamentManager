package tournament.data;

import java.util.Arrays;

public class Team {
    Player[] players;
    String name;

    public Team(Player[] players, String name) {
        this.players = players;
        this.name = name;
    }
    public Player[] getPlayers() {
        return players;
    }
    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public String toString() {
        String teammates = "";
        for(Player p:players) {
            teammates += p + "\n";
        }
        return "Team" + name +
                " - Members: " + players.length + "/5 " +
                teammates;
    }
}
