package com.danielradonic;

public class NightStand {
    private String position;
    private Illumination lamp;

    public NightStand(String position, Illumination lamp) {
        this.position = position;
        this.lamp = lamp;
    }

    public String getPosition() {
        return position;
    }

    public Illumination getLamp() {
        return lamp;
    }
}
