package tournament.comparators;

import java.util.Comparator;

import tournament.data.Player;

/**
 * Comparator for sorting players by ranking and name.
 */
public class PlayerRankingComparator implements Comparator<Player>{
    /**
     * Compares two players based on their ranking. If rankings are equal, compares by name.
     *
     * @param p1 the first player to compare
     * @param p2 the second player to compare
     * @return a negative integer, zero, or a positive integer if the first player's ranking
     *         is less than, equal to, or greater than the second player's ranking
     */
    @Override
    public int compare(Player p1, Player p2){
        int result;
        result = Double.compare(p1.getRanking(), p2.getRanking());
        if(result == 0)
        {
            result = p1.getName().compareTo(p2.getName());
        }
        return result;
    }
}