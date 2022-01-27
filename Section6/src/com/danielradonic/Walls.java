package com.danielradonic;

public class Walls {
    private double width;
    private double height;
    private String color;

    public Walls(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}
