package com.danielradonic;

public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int cylinders) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        if (this.engine) {
            this.engine = false;
            System.out.println("Stopping engine");
        } else {
            this.engine = true;
            System.out.println("Starting engine");
        }
    }

    public void accelerate() {
        if (this.engine) {
            
        }

    }

}
