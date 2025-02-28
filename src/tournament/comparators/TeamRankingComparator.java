package tournament.comparators;

import tournament.data.Team;
import java.util.Comparator;

/**
 * Comparator for sorting teams by their average ranking in descending order.
 */
public class TeamRankingComparator implements Comparator<Team> {
    /**
     * Compares two teams based on their average ranking.
     *
     * @param t1 the first team to compare
     * @param t2 the second team to compare
     * @return a negative integer, zero, or a positive integer if the first team's average ranking
     *         is greater than, equal to, or less than the second team's average ranking
     */
    @Override
    public int compare(Team t1, Team t2){
        return Double.compare(t2.getAverageRanking(), t1.getAverageRanking());
    }
}