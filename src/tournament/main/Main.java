package tournament.main;

import tournament.comparators.MatchTournamentNameComparator;
import tournament.comparators.PlayerRankingComparator;
import tournament.comparators.TeamRankingComparator;
import tournament.comparators.TournamentNameComparator;
import tournament.data.*;
import tournament.exceptions.CustomException;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void ShowMenu(){
        System.out.println("1. View available tournaments ordered by name");
        System.out.println("2. View players information ordered by ranking and name");
        System.out.println("3. View teams information ordered by ranking");
        System.out.println("4. Add a new player to a team");
        System.out.println("5. Find an exact player by name");
        System.out.println("6. Find players");
        System.out.println("7. Find teams");
        System.out.println("8. Show all the matches ordered by tournament name");
        System.out.println("9. Update the result of the matches pending");
        System.out.println("10. Exit");
        System.out.print("Select an option: ");
    }
    public static void viewTournamentOrderedByName(TournamentManager tournamentManager){
        Tournament[] tournaments = tournamentManager.getTournaments();
        Arrays.sort(tournaments, new TournamentNameComparator());

        System.out.println("Tournaments ordered by name: ");
        for(Tournament t : tournaments){
            System.out.println(t);
        }
    }
    public static void viewPlayersOrderedByRankingAndName(TournamentManager tournamentManager){
        Player[] players = tournamentManager.getRegisteredPlayers();
        Arrays.sort(players, new PlayerRankingComparator());

        System.out.println("Players ordered by ranking and name: ");
        for(Player p : players){
            System.out.println(p);
        }
    }
    public static void viewTeamsOrderedByRanking(TournamentManager tournamentManager){
        Team[] teams = tournamentManager.getRegisteredTeams();
        Arrays.sort(teams, new TeamRankingComparator());

        System.out.println("Teams ordered by ranking: ");
        for(Team t : teams){
            System.out.println(t);
        }
    }
    public static void addPlayerToTeam(TournamentManager tournamentManager, Scanner sc) throws CustomException {

        System.out.print("Enter player name: ");
        String playerName = sc.nextLine();

        int playerLevel = 0;
        while(playerLevel > 100 || playerLevel < 1){
            System.out.print("Enter player level (1-100): ");
            try{
                playerLevel = Integer.parseInt(sc.nextLine());
                if(playerLevel > 100 || playerLevel < 1){
                    System.out.println("Error. Please enter a valid level (1-100).");
                }
            }catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid number");
            }
        }

        float playerRanking = -1;
        while (playerRanking<0) {
            System.out.print("Enter player ranking: ");
            try{
                playerRanking = Float.parseFloat(sc.nextLine());
                if(playerRanking<0){
                    System.out.println("Error. PLease enter a valid ranking (0 or above).");
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        Player newPlayer = new Player(playerName, playerLevel, playerRanking);

        System.out.print("Enter a team name: ");
        String teamName = sc.nextLine();

        Team team = tournamentManager.findTeam(teamName);

        try{
            team.addPlayer(newPlayer);
            System.out.println("Player added successfully");
        } catch (CustomException e){
            System.out.println("Error. There's no team with that name.");
        }
    }
    public static void findPlayerByName(TournamentManager tournamentManager, Scanner sc) throws CustomException {
        System.out.print("Enter player name: ");
        String playerName = sc.nextLine();

        Player player = tournamentManager.findPlayer(playerName);
        if(player != null){
            System.out.println("Player found: " + player);
        }else {
            System.out.println("No player found with that name");
        }
    }
    public static void findPlayer(TournamentManager tournamentManager, Scanner sc){
        System.out.print("Enter player name: ");
        String playerName = sc.nextLine();

        Player[] players = tournamentManager.getRegisteredPlayers();
        System.out.println("Players matching " + playerName + ":");

        for(Player p : players){
            if(p.getName().contains(playerName)){
                System.out.println(p);
            }
        }
    }
    public static void findTeam(TournamentManager tournamentManager, Scanner sc){
        System.out.print("Enter team name to search: ");
        String teamName = sc.nextLine().toLowerCase();

        Team[] teams = tournamentManager.getRegisteredTeams();
        System.out.print("Teams matching" + teamName + ":");
        for(Team t : teams){
            if(t.getName().toLowerCase().contains(teamName)){
                System.out.println(t);
            }
        }
    }
    public static void showMatchesOrderedByTournamentName(TournamentManager tournamentManager){
        Match[] matches = tournamentManager.getMatches();
        Arrays.sort(matches, new MatchTournamentNameComparator());

        System.out.println("Matches ordered by tournament name: ");
        for(Match m : matches){
            System.out.println(m);
        }
    }
    public static void updateMatchPendingResult(TournamentManager tournamentManager, Scanner sc){
        Match[] matches = tournamentManager.getMatches();

        System.out.println("Pending matches: ");
        for(int i=0;i<matches.length;i++){
            if(matches[i].getResult().equals("Pending")){
                System.out.println((i+1) + ". " + matches[i]);
            }
        }

        System.out.print("Enter number of match you want to update: ");
        int matchNumber = Integer.parseInt(sc.nextLine());
        boolean verify = true;

        if(matchNumber < 1 || matchNumber>matches.length || !matches[matchNumber-1].getResult().equals("Pending")){
            verify = false;
        }

        if(verify){
            System.out.print("Enter de result: ");
            String result = sc.nextLine();
            matches[matchNumber-1].setResult(result);
            System.out.println("Match result updated successfully.");
        }
    }
    public static void main(String[] args) throws CustomException {
        Scanner sc = new Scanner(System.in);
        TournamentManager tournamentManager = new TournamentManager();
        boolean exit = false;
        int option = 0;

        tournamentManager.initialize();

        while(!exit){
            ShowMenu();
            option = Integer.parseInt(sc.nextLine());

            switch(option){
                case 1:
                    viewTournamentOrderedByName(tournamentManager);
                    break;
                case 2:
                    viewPlayersOrderedByRankingAndName(tournamentManager);
                    break;
                case 3:
                    viewTeamsOrderedByRanking(tournamentManager);
                    break;
                case 4:
                    addPlayerToTeam(tournamentManager, sc);
                    break;
                case 5:
                    findPlayerByName(tournamentManager, sc);
                    break;
                case 6:
                    findPlayer(tournamentManager, sc);
                    break;
                case 7:
                    findTeam(tournamentManager, sc);
                    break;
                case 8:
                    showMatchesOrderedByTournamentName(tournamentManager);
                    break;
                case 9:
                    updateMatchPendingResult(tournamentManager, sc);
                    break;
                case 10:
                    System.out.println("Thank you for using our app! Bye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}