package tournament.data;

import java.util.Arrays;
import tournament.comparators.Comparators.PlayerRankingComparator;
import tournament.comparators.Comparators.TeamRankingComparator;

public class TournamentManager {
    Player[] registeredPlayers;
    Team[] registeredTeams;
    Tournament[] tournaments;
    Match[] matches;

    public TournamentManager() {
        registeredPlayers = new Player[10];
        registeredTeams = new Team[5];
        tournaments = new Tournament[3];
        matches = new Match[0];
    }

    public void initialize() {
    }

    //Find player
    public Player findPlayer(String userName) {
        for (Player p : registeredPlayers) {
            if (p.getName().equals(userName)) {
                return p;
            }
        }
        //TODO EXCEPTION CLASS
        throw new PlayerNotFoundException("Player not found: " + userName);
    }

    //Find team
    public Team findTeam(String teamName) {
        for (Team t : registeredTeams) {
            if (t.getName().equals(teamName)) {
                return t;
            }
        }
        //TODO EXCEPTION CLASS
        throw new TeamNotFoundException("Team not found: " + teamName);
    }

    //Show Tournaments
    public void showTournaments() {
        for (Tournament t : tournaments) {
                System.out.println(t);
        }
    }

    //Shows the players ordered by ranking(from highest to lowest)
    public void playerRanking() {
        Arrays.sort(registeredPlayers, new PlayerRankingComparator());

        System.out.println("Player Ranking:");
        for (Player p : registeredPlayers) {
            if (p != null) {
                System.out.println(p.getName() + " - Ranking: " + p.getRanking());
            }
        }
    }

    //Shows the teams ordered by ranking(from highest to lowest)
    public void teamRanking() {
        Arrays.sort(registeredTeams, new TeamRankingComparator());

        System.out.println("Team Ranking:");
        for (Team t : registeredTeams) {
            if (t != null) {
                System.out.println(t.getName() + " - Average Ranking: " + t.getAverageRanking());
            }
        }
    }

}





