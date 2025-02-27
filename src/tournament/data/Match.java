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
    public void setResult(String result) {
        this.result = result;
    }
    @Override
    public String toString() {
        return "Match in " + tournament + " - " +
                participant1 + " vs. " + participant2 +
                " - Result: " + result;
    }
}