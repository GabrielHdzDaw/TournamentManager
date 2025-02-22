package tournament.data;

import java.util.Scanner;

public abstract class Tournament {
    String name;
    String associatedName;
    int prize;
    public Tournament(String name, String associatedName, int prize){
        this.name = name;
        this.associatedName = associatedName;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssociatedName() {
        return associatedName;
    }

    public void setAssociatedName(String associatedName) {
        this.associatedName = associatedName;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return name + " (" + associatedName + ")";
    }
}