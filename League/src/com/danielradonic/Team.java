package com.danielradonic;

public abstract class Team {
     private String name;
     private String color;
     private int won = 0;
     private int lost = 0;
     private int tied = 0;

    public Team(String name, int redOrBlue) {
        this.name = name;
        setColor(redOrBlue);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(int redOrBlue) {
        switch (redOrBlue) {
            case 0 -> this.color = "Red";
            case 1 -> this.color = "Blue";
            default -> this.color = null;
        }
        this.color = color;
    }

    public void winLostTied(int won, int lost, int tied) {
        this.won += won;
        this.lost += lost;
        this.tied += tied;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }
}
