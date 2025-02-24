package tournament.data;

public class Player extends Participant {
    byte level;
    float ranking;

    public Player(String name, byte level, float ranking) {
        super(name);
        if(level>=1 && level <=100)
        {
            this.level = level;
        }
        else
        {
            if(level<1)
            {
                this.level = 1;
            }
            else if(level>100)
            {
                this.level=100;
            }
        }
        this.ranking = ranking;
    }

    public float getRanking() {
        return ranking;
    }
    public void setRanking(float ranking) {
        this.ranking = ranking;
    }
    public byte getLevel() {
        return level;
    }
    public void setLevel(byte level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString() + "Level: " + level + "Ranking: " + ranking;
    }
}
