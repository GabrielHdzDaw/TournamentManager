package tournament.data;

import tournament.comparators.PlayerRankingComparator;
import tournament.comparators.TeamRankingComparator;
import tournament.exceptions.CustomException;
import java.util.Arrays;
import java.util.Random;

/**
 * Manages tournaments, players, teams, and matches.
 */
public class TournamentManager {
    Player[] registeredPlayers;
    Team[] registeredTeams;
    Tournament[] tournaments;
    Match[] matches;
    Random random;

    /**
     * Constructs a TournamentManager with default arrays for players, teams, tournaments, and matches.
     */
    public TournamentManager() {
        registeredPlayers = new Player[10];
        registeredTeams = new Team[5];
        tournaments = new Tournament[3];
        matches = new Match[10];
        random = new Random();
    }

    /**
     * Returns the registered players.
     *
     * @return the registered players
     */
    public Player[] getRegisteredPlayers() {
        return registeredPlayers;
    }
    /**
     * Returns the registered teams.
     *
     * @return the registered teams
     */
    public Team[] getRegisteredTeams() {
        return registeredTeams;
    }
    /**
     * Returns the tournaments.
     *
     * @return the tournaments
     */
    public Tournament[] getTournaments() {
        return tournaments;
    }
    /**
     * Returns the matches.
     *
     * @return the matches
     */
    public Match[] getMatches() {
        return matches;
    }
    /**
     * Initializes the TournamentManager with predefined data.
     *
     * @throws CustomException if there is an error initializing the data
     */
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
            System.out.println("Error entering participants in teams.");
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
    /**
     * Finds a player by their name.
     *
     * @param userName the name of the player to find
     * @return the player with the specified name
     * @throws CustomException if the player is not found
     */
    public Player findPlayer(String userName) throws CustomException{
        for (Player p : registeredPlayers) {
            if (p.getName().equals(userName)) {
                return p;
            }
        }
        throw new CustomException("Player not found: " + userName);
    }
    /**
     * Finds a team by their name.
     *
     * @param teamName the name of the team to find
     * @return the team with the specified name
     * @throws CustomException if the team is not found
     */
    public Team findTeam(String teamName) throws CustomException{
        for (Team t : registeredTeams) {
            if (t.getName().equals(teamName)) {
                return t;
            }
        }
        throw new CustomException("Team not found: " + teamName);
    }
    /**
     * Displays all available tournaments.
     */
    public void showTournaments() {
        for (Tournament t : tournaments) {
                System.out.println(t);
        }
    }
    /**
     * Displays players sorted by ranking.
     */
    public void playerRanking() {
        Arrays.sort(registeredPlayers, new PlayerRankingComparator());

        System.out.println("Player Ranking:");
        for (Player p : registeredPlayers) {
            if (p != null) {
                System.out.println(p.getName() + " - Ranking: " + p.getRanking());
            }
        }
    }
    /**
     * Displays teams sorted by average ranking.
     */
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