package com.danielradonic;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBodyOri {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBodyOri> satellites;

    public HeavenlyBodyOri(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBodyOri moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBodyOri> getSatellites() {
        return new HashSet<>(satellites);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((HeavenlyBodyOri) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode called");
        return this.name.hashCode() + 57;
    }
}



