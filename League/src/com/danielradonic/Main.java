package com.danielradonic;

public class Main {

    public static void main(String[] args) {
        BlueTeams Azules = new BlueTeams("Azul",1 );
        BlueTeams Sky = new BlueTeams("Sky", 1);
        RedTeams Rojo = new RedTeams("Rojos", 0);
        RedTeams Hell = new RedTeams("Hells", 0);
        RedTeams Rapid = new RedTeams("Speeders", 2);

        Azules.winLostTied(2,3,1);
        Sky.winLostTied(4,3,1);
        Rojo.winLostTied(2,4,0);
        Hell.winLostTied(4,2,2);

        League Lobos = new League<>("Wolfs");
        League Ovejas = new League<>("Sheep");

        Lobos.addTeam(Azules);
        Lobos.addTeam(Rojo);
        Lobos.addTeam(Sky);
        Lobos.addTeam(Rojo);
        Lobos.addTeam(Hell);
        Ovejas.addTeam(Rapid);

        Lobos.ranking();
    }

}
