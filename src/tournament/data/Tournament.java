package tournament.data;

import java.util.Scanner;

public abstract class Tournament {
    String name;
    String associatedGame;
    double prize;
    public Tournament(String name, String associatedName, double prize){
        this.name = name;
        this.associatedGame = associatedName;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssociatedName() {
        return associatedGame;
    }

    public void setAssociatedName(String associatedName) {
        this.associatedGame = associatedName;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return name + " (" + associatedGame + ")";
    }
}