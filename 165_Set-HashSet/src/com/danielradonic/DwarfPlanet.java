package com.danielradonic;

public class DwarfPlanet extends HeavenlyBody{
    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, BodyTypes.DWARF_PLANET, orbitalPeriod);
    }
}
