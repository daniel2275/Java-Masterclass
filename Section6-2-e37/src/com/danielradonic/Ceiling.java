package com.danielradonic;

public class Ceiling {
    // 3) Create a class with the name Ceiling. There are two member variables for this one, height, and paintedColor, both of type int. there should also be a constructor which accepts both member variables as parameters. there are also two additional methods which should be defined: getHeight() shall return the value of height and getPaintedColor() should return the value of paintedColor.

    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
