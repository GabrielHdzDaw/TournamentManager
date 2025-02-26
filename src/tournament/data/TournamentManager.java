package tournament.data;

public class TournamentManager {
    Player[] registeredPlayers;
    Team[] registeredTeams;
    Tournament[] tournaments;
    Match[] matches;

    public TournamentManager()
    {
        registeredPlayers=new Player[10];
        registeredTeams=new Team[5];
        tournaments=new Tournament[3];
        matches = new Match[0];
    }

    public void initialize() {
    }

    public Player findPlayer(String username){
        for(Player p : registeredPlayers)
        {
            if (p.getName().equals(username))
            {
                return p;
            }
        }
        //usar excepcion o null
        return null;
        //TODO EXCEPTION CLASS
        //(throw new PlayerNotFoundException("Player not found: " + username);
    }



}
