package com.springKafka.sprinKafka.payload;

public class User {
    private int id;
    private int currentScore;

    private int totalWickets;
    private String latestWicket;

    private String currentBatsMan;
    private int SixCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public int getTotalWickets() {
        return totalWickets;
    }

    public void setTotalWickets(int totalWickets) {
        this.totalWickets = totalWickets;
    }

    public String getLatestWicket() {
        return latestWicket;
    }

    public void setLatestWicket(String latestWicket) {
        this.latestWicket = latestWicket;
    }

    public String getCurrentBatsMan() {
        return currentBatsMan;
    }

    public void setCurrentBatsMan(String currentBatsMan) {
        this.currentBatsMan = currentBatsMan;
    }

    public int getSixCount() {
        return SixCount;
    }

    public void setSixCount(int sixCount) {
        SixCount = sixCount;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", currentScore=" + currentScore +
                ", totalWickets=" + totalWickets +
                ", latestWicket='" + latestWicket + '\'' +
                ", currentBatsMan='" + currentBatsMan + '\'' +
                ", SixCount=" + SixCount +
                '}';
    }
}
