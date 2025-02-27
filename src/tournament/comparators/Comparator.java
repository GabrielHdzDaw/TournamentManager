package tournament.comparators;

import java.util.Comparator;
import tournament.data.Player;
import tournament.data.Team;

public class Comparators {
    public static class PlayerRankingComparator implements Comparator<Player> {
        @Override
        public int compare(Player p1, Player p2) {
            return Float.compare(p2.getRanking(), p1.getRanking());
        }
    }
    public static class TeamRankingComparator implements Comparator<Team> {
        @Override
        public int compare(Team t1, Team t2) {
            return Double.compare(t2.getAverageRanking(), t1.getAverageRanking());
        }
    }
}