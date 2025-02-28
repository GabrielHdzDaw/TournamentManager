package tournament.data;

import tournament.exceptions.CustomException;

import java.util.Arrays;
import java.util.Random;

public class TournamentManager {
    Player[] registeredPlayers;
    Team[] registeredTeams;
    Tournament[] tournaments;
    Match[] matches;
    Random random;

    public TournamentManager() {
        registeredPlayers = new Player[10];
        registeredTeams = new Team[5];
        tournaments = new Tournament[3];
        matches = new Match[10];
        random = new Random();
    }
    public Player[] getRegisteredPlayers() {
        return registeredPlayers;
    }

    public Team[] getRegisteredTeams() {
        return registeredTeams;
    }

    public Tournament[] getTournaments() {
        return tournaments;
    }

    public Match[] getMatches() {
        return matches;
    }
    public void initialize() throws  CustomException{
        registeredPlayers[0] = new Player("Wiwi", 80, 2500);
        registeredPlayers[1] = new Player("Mary", 100, 3000);
        registeredPlayers[2] = new Player("Hienn", 90, 2750);
        registeredPlayers[3] = new Player("Eli", 60, 1789);
        registeredPlayers[4] = new Player("Tarmont", 30, 1456);
        registeredPlayers[5] = new Player("Rhador", 47, 2450);
        registeredPlayers[6] = new Player("Soleil", 38, 2453);
        registeredPlayers[7] = new Player("xOpossum", 100, 3500);
        registeredPlayers[8] = new Player("Surky", 68, 2345);
        registeredPlayers[9] = new Player("BuJoker", 99, 2999);

        registeredTeams[0] = new Team("Team Chafatronics");
        registeredTeams[1] = new Team("Team Wowi");
        registeredTeams[2] = new Team("Team Seikret");
        registeredTeams[3] = new Team("Team Glaive");
        registeredTeams[4] = new Team("Team Vandal");

        try{
            registeredTeams[0].addPlayer(registeredPlayers[0]);
            registeredTeams[0].addPlayer(registeredPlayers[1]);
            registeredTeams[1].addPlayer(registeredPlayers[2]);
            registeredTeams[1].addPlayer(registeredPlayers[3]);
            registeredTeams[2].addPlayer(registeredPlayers[4]);
            registeredTeams[2].addPlayer(registeredPlayers[5]);
            registeredTeams[3].addPlayer(registeredPlayers[6]);
            registeredTeams[3].addPlayer(registeredPlayers[7]);
            registeredTeams[4].addPlayer(registeredPlayers[8]);
            registeredTeams[4].addPlayer(registeredPlayers[9]);
        } catch (CustomException e){
            System.out.println(e.getMessage());
        }

        tournaments[0] = new IndividualTournament("Masters Solo", "CS:GO", 1000000);
        tournaments[1] = new IndividualTournament("LCS", "LoL", 500000);
        tournaments[2] = new IndividualTournament("World Cup", "Valorant", 1500000);

        for(int i=0;i<matches.length;i++){
            Participant participant1 = registeredPlayers[random.nextInt(registeredPlayers.length)];
            Participant participant2 = registeredPlayers[random.nextInt(registeredPlayers.length)];
            Tournament tournament = tournaments[random.nextInt(tournaments.length)];
            matches[i] = new Match(tournament, participant1, participant2);
        }
    }
    public Player findPlayer(String userName) throws CustomException{
        for (Player p : registeredPlayers) {
            if (p.getName().equals(userName)) {
                return p;
            }
        }
        throw new CustomException("Player not found: " + userName);
    }
    public Team findTeam(String teamName) throws CustomException{
        for (Team t : registeredTeams) {
            if (t.getName().equals(teamName)) {
                return t;
            }
        }
        throw new CustomException("Team not found: " + teamName);
    }
    public void showTournaments() {
        for (Tournament t : tournaments) {
                System.out.println(t);
        }
    }
    public void playerRanking() {
        Arrays.sort(registeredPlayers, (p1, p2) -> Float.compare(p2.getRanking(), p1.getRanking()));

        System.out.println("Player Ranking:");
        for (Player p : registeredPlayers) {
            if (p != null) {
                System.out.println(p.getName() + " - Ranking: " + p.getRanking());
            }
        }
    }
    public void teamRanking() {
        Arrays.sort(registeredTeams, (t1, t2) -> Double.compare(t2.getAverageRanking(), t1.getAverageRanking()));

        System.out.println("Team Ranking:");
        for (Team t : registeredTeams) {
            if (t != null) {
                System.out.println(t.getName() + " - Average Ranking: " + t.getAverageRanking());
            }
        }
    }
}