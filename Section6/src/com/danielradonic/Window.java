package com.danielradonic;

public class Window extends Opening{
    private String type;

    public Window(double width, double height, String type) {
        super(width, height, false );
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
