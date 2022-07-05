package com.danielradonic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();


        HeavenlyBody earth = new Planet("Earth", 365);
        solarSystem.put(earth.getKey(), earth);

        HeavenlyBody moon = new Moon("Moon", 27);
        solarSystem.put(moon.getKey(), moon);
        earth.addSatellite(moon);


        for (HeavenlyBody body : solarSystem.values()) {
            System.out.println(body);
        }

        System.out.println(earth.getSatellites());

    }
}
