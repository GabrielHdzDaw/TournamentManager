package tournament.comparators;

import tournament.data.Match;

import java.util.Comparator;

/**
 * Comparator for sorting matches by the name of their associated tournament.
 */
public class MatchTournamentNameComparator implements Comparator<Match> {
    /**
     * Compares two matches based on the name of their associated tournament.
     *
     * @param m1 the first match to compare
     * @param m2 the second match to compare
     * @return a negative integer, zero, or a positive integer if the first match's tournament name
     *         is less than, equal to, or greater than the second match's tournament name
     */
    @Override
    public int compare(Match m1, Match m2){
        return m1.getTournament().getName().compareTo(m2.getTournament().getName());
    }
}