package tournament.comparators;

import java.util.Comparator;

import tournament.data.Player;
import tournament.data.Team;

public class PlayerRankingComparator implements Comparator<Player>{
    @Override
    public int compare(Player p1, Player p2){
        return Double.compare(p2.getRanking(), p1.getRanking());
    }
}
