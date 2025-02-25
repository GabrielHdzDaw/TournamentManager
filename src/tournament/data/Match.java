package tournament.data;

public class Match {
    Tournament tournament;
    String result;

    public Match(Tournament tournament, String result)
    {
        this.tournament=tournament;
        this.result=result;
    }
    public void setResult(String result) {
        this.result = result;
    }
}
