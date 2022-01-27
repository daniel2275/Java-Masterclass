package com.danielradonic;

public class Suv extends Car{
    private String model;

    public Suv(String make,  int doors, String engine, String model) {
        super(make, 0, 0, doors, engine, 0);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setSpeed(int speed) {
        if (speed > -40 && speed < 183) {
            super.setSpeed(speed);
        } else {
            System.out.println("Invalid speed");
        }
    }

    @Override
    public void setGear(int gear){
        if (gear > -1 && gear < 5 ) {
            super.setGear(gear);
        } else {
            System.out.println("Invalid gear");
        }
    }

}
