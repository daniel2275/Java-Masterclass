package com.danielradonic;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, BodyTypes bodyType, double orbitalPeriod) {
        this.key = new Key (name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if ((obj instanceof HeavenlyBody)) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }
        return false;

    }

    @Override
    public int hashCode() {
//        System.out.println("Hashcode called");
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

    @Override
    public String toString() {
        return "{" +
                "name=" + this.key.getName() +
                ", Type=" + this.key.getBodyType() +
                ", orbitalPeriod=" + this.orbitalPeriod +
                ", satellites=" + this.satellites +
                '}';
    }

    public static final class Key {      // Key class
        private String name;
        private BodyTypes bodyType;


        public Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Key)) return false;
            Key key = (Key) o;
            return name.equals(key.name) && bodyType == key.bodyType;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, bodyType) + 57;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "name='" + name + '\'' +
                    ", bodyType=" + bodyType +
                    '}';
        }
    }

}



