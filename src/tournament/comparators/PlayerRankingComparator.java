package tournament.comparators;

import java.util.Comparator;

import tournament.data.Player;

public class PlayerRankingComparator implements Comparator<Player>{
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