package tournament.data;

public class Match {
    Tournament tournament;
    String result;
    Participant participant1;
    Participant participant2;

    public Match(Tournament tournament, Participant participant1, Participant participant2)
    {
        this.tournament=tournament;
        result="Pending";
        this.participant1=participant1;
        this.participant2=participant2;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }

    public Participant getParticipant1() {
        return participant1;
    }

    public void setParticipant1(Participant participant1) {
        this.participant1 = participant1;
    }

    public Participant getParticipant2() {
        return participant2;
    }

    public void setParticipant2(Participant participant2) {
        this.participant2 = participant2;
    }

    public boolean validateParticipants(){

        boolean isValid = false;

        if(tournament instanceof IndividualTournament){
            isValid = participant1 instanceof Player && participant2 instanceof Player;
        } else if (tournament instanceof TeamTournament){
            isValid = participant1 instanceof Team && participant2 instanceof Team;
        } else if (tournament instanceof MixedTournament){
            MixedTournament mixedTournament = (MixedTournament) tournament;
            if(mixedTournament.getGameMode().equals("1v1")){
                isValid = participant1 instanceof Player && participant2 instanceof Player;
            } else if (tournament instanceof TeamTournament){
                isValid = participant1 instanceof Team && participant2 instanceof Team;
            }
        }
        return isValid;
    }
    @Override
    public String toString() {
        return "Match in " + tournament.toString() + " - " +
                participant1.toString() + " vs. " + participant2.toString() +
                " - Result: " + result;
    }
}