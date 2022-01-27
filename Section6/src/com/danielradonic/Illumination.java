package com.danielradonic;

public class Illumination {
    private String type;
    private boolean onOff;

    public Illumination(String type) {
        this.type = type;
        this.onOff = false;
    }

    public String getType() {
        return type;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void switchOnOff() {
        if (this.onOff) {
            this.onOff = false;
            System.out.println("Light turned off");
        } else {
            this.onOff = true;
            System.out.println("Light turned on");
        }

    }
}
