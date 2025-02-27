package tournament.data;

import tournament.exceptions.CustomException;

import java.util.Arrays;

public class Team extends Participant{
    static final int MAX_PLAYERS = 5;
    static final int MIN_PLAYERS = 2;
    Player[] players;
    int playerCount;

    public Team(String name) {
        super(name);
        this.players = new Player[MAX_PLAYERS];
        playerCount = 0;
    }
    public Player[] getPlayers() {
        return players;
    }
    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public void addPlayer(Player player) throws CustomException{
        if (playerCount >= MAX_PLAYERS){
            throw new CustomException("Cannot add more players. The team is full.");
        }
        players[playerCount] = player;
        playerCount++;
    }
    @Override
    public String toString() {
        String teammates = "";
        for(Player p:players) {
            teammates += " " + p;
        }
        return "Team" + name +
                " - Members:" + players.length + "/5 " +
                teammates;
    }
}
