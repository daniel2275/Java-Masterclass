package com.danielradonic;

import java.util.ArrayList;

public class League<T  extends Team> {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (team.getColor() != null) {
            if (teams.contains(team)) {
                System.out.println(team.getName() + " is already in " + this.name + " league");
                return false;
            } else {
                teams.add(team);
                System.out.println("Added " + team.getName() + " to " + this.name + " league");
                return true;
            }
        } else {
            System.out.println("the group " + team.getName() + " is not in a team, cannot join " + this.name + " league");
            return false;
        }
    }

    public void ranking() {
        T t1, t2;
        int count = 0;

        for (int i = 0; i < teams.size(); i++) {
            t1 = teams.get(i);
            int score1 = t1.getWon();
            for (int j = 0; j < teams.size(); j++) {
                t2 = teams.get(j);
                int score2 = t2.getWon();

                if (t1.getColor().equals(t2.getColor())) {
                    if (score1 < score2 && i < j) {
                        teams.set(i, t2);
                        teams.set(j, t1);
                        break;
                    }
                }
            }
        }

        System.out.println("\rRanking for " + this.name + " League");
        System.out.println("Red team");
        for(T red: teams) {
            if(red.getColor().equals("Red")){
                count++;
                System.out.println(count + ".\tTeam: " + red.getName()
                + "\t Won: " + red.getWon() + " Lost: " + red.getLost());
            }
        }

        System.out.println("Blue team");
        for(T blue: teams) {
            if(blue.getColor().equals("Blue")){
                count++;
                System.out.println(count + ".\tTeam: " + blue.getName()
                        + "\t Won: " + blue.getWon() + " Lost: " + blue.getLost());
            }
        }
    }

}
