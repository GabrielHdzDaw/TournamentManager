package tournament.data;

import java.util.Scanner;

public class IndividualTournament extends Tournament{

    public IndividualTournament(String name, String associatedName, int prize) {
        super(name, associatedName, prize);
    }

    @Override
    public String toString() {
        return super.toString() + " $" + prize;
    }
}