package tournament.data;

import java.util.Scanner;

public class IndividualTournament extends Tournament{
    public IndividualTournament(String name, String associatedGame, double prize) {
        super(name, associatedGame, prize);
    }
    @Override
    public String toString() {
        return "Individual tournament - " + super.toString() + " - Prize: " + prize + "€";
    }
}