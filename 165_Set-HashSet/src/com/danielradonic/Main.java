package com.danielradonic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();

    private static Set<HeavenlyBody> planets = new HashSet<>();
    private static Set<HeavenlyBody> moons = new HashSet<>();

    public static void main(String[] args) {

//        HeavenlyBody temp = new Planet("Mercury",  145 );
//        solarSystem.put(temp.getKey().getName() + temp.getBodyType(), temp);
//        planets.add(temp);
//
//        temp = new Moon("Mercury",  145 );
//        solarSystem.put(temp.getKey().getName() + temp.getBodyType(), temp);
//        moons.add(temp);


        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter


        // moon called jupiter
        tempMoon = new Moon("Jupiter", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter


        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for(HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getKey().getName());
        }

        System.out.println("Moons");
        for(Map.Entry<HeavenlyBody.Key, HeavenlyBody> solBody : solarSystem.entrySet() ) {
            if (solBody.getKey().getBodyType() == HeavenlyBody.BodyTypes.MOON)
                System.out.println("\t" + solBody.getKey().getName());
        }

        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars", HeavenlyBody.BodyTypes.PLANET ));
        System.out.println("Moons of " + body.getKey().getName());
        for(HeavenlyBody jupiterMoon: body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getKey().getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        body = solarSystem.get(HeavenlyBody.makeKey("Jupiter", HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of " + body.getKey().getName());
        for(HeavenlyBody jupiterMoon: body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getKey().getName());
        }


        HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
        planets.add(pluto);

        System.out.println("Planets");
        for(HeavenlyBody planet : planets) {
//            System.out.println("\t" + planet.getKey().getName());
            System.out.println(planet);
        }

        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(pluto));
        System.out.println(pluto.equals(earth1));

        solarSystem.put(pluto.getKey(), pluto);
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));


        System.out.println();
        System.out.println("The solar system contains");
        for(HeavenlyBody heavenlyBody: solarSystem.values()) {
            System.out.println(heavenlyBody);
        }


//        System.out.println("All Moons");
//        for(HeavenlyBody moon : moons) {
//            System.out.println("\t" + moon.getKey().getName());
//        }



//        for(HeavenlyBody planet: planets) {
//            System.out.println(planet.getKey().getName() + ": " + planet.getOrbitalPeriod());
//        }
//
//        for(HeavenlyBody moon: moons) {
//            System.out.println(moon.getKey().getName() + ": " + moon.getOrbitalPeriod());
//        }

//        printSolarSystem(solarSystem);

//        for(HeavenlyBody solarSystem : body) {
//            System.out.println(moon.getKey().getName() + ": " + moon.getOrbitalPeriod());
//        }



        Object o = new Object();
        o.equals(o);
        "pluto".equals("");

    }

    public static void printSolarSystem(Map<String, HeavenlyBody> bodies) {
        for (String name : bodies.keySet()) {
            System.out.println(" key : " + name + " \n\tName: " + bodies.get(name).getKey().getName() + " Body type: " + bodies.get(name).getKey().getBodyType() );
        }
    }
}
