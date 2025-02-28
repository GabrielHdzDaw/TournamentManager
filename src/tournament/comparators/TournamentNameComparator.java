package tournament.comparators;

import tournament.data.Tournament;

import java.util.Comparator;

/**
 * Comparator for sorting tournaments by name.
 */
public class TournamentNameComparator implements Comparator<Tournament> {
    /**
     * Compares two tournaments based on their name.
     *
     * @param t1 the first tournament to compare
     * @param t2 the second tournament to compare
     * @return a negative integer, zero, or a positive integer if the first tournament's name
     *         is less than, equal to, or greater than the second tournament's name
     */
    @Override
    public int compare(Tournament t1, Tournament t2){
        return t1.getName().compareTo(t2.getName());
    }
}