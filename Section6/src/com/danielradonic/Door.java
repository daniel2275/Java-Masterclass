package com.danielradonic;

public class Door extends Opening{
     private String type;

    public Door(double width, double height, String type) {
        super(width, height, false);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
