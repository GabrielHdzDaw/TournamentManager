package tournament.comparators;

import tournament.data.Player;
import tournament.data.Team;

import java.util.Comparator;

public class TeamRankingComparator implements Comparator<Team> {
    @Override
    public int compare(Team t1, Team t2){
        return Double.compare(t2.getAverageRanking(), t1.getAverageRanking());
    }
}
