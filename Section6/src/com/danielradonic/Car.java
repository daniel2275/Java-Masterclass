package com.danielradonic;

public class Car extends Vehicle {
    private int doors;
    private String engine;
    private int gear;

    public Car(String make,  int steer, int speed, int doors, String engine, int gear) {
        super(make, 4, steer, speed);
        this.doors = doors;
        this.engine = engine;
        this.gear = gear;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
