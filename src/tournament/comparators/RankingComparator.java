package tournament.comparators;

import java.util.Comparator;
import tournament.data.Player;
import tournament.data.Team;

public class RankingComparator {
    public static Comparator<Player> playerRankingComparator() {
        return (p1, p2) -> Float.compare(p2.getRanking(), p1.getRanking());
    }

    public static Comparator<Team> teamRankingComparator() {
        return (t1, t2) -> Double.compare(t2.getAverageRanking(), t1.getAverageRanking());
    }
}
