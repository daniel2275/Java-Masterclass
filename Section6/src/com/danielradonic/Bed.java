package com.danielradonic;

public class Bed {
    private double size;
    private String type;

    public Bed(double size, String type) {
        this.size = size;
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}
