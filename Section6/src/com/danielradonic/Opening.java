package com.danielradonic;

public class Opening {
    private double width;
    private double height;
    private boolean openClose;

    public Opening(double width, double height, boolean openClose) {
        this.width = width;
        this.height = height;
        this.openClose = openClose;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setOpenClose() {
        if (this.openClose) {
            this.openClose = false;
            System.out.println("Closed");
        } else {
            this.openClose = true;
            System.out.println("Open");
        }
    }
}
