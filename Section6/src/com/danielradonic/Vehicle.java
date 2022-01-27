package com.danielradonic;

public class Vehicle {
    private String make;
    private int wheels;
    private int steer;
    private int speed;

    public Vehicle(String make, int wheels, int steer, int speed) {
        this.make = make;
        this.wheels = wheels;
        this.steer = steer;
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSteer() {
        return steer;
    }

    public void setSteer(int steer) {
        this.steer = steer;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
