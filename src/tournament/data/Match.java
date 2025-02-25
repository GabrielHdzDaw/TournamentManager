package tournament.data;

public class Match {
    Tournament tournament;
    String result;
    Participant participant1;
    Participant participant2;

    public Match(Tournament tournament, String result, Participant participant1, Participant participant2)
    {
        this.tournament=tournament;
        this.result="pending";
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
            isValid=


        }
    }
    @Override
    public String toString() {
        return "Match in " + tournament.toString() + " - " +
                participant1.toString() + " vs. " + participant2.toString() +
                " - Result: " + result;
    }
}
