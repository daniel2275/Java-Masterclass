package com.danielradonic;


class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("Car -> Starting engine");
    }

    public void accelerate() {
        System.out.println("Car -> Accelerating Car");
    }

    public void brake() {
        System.out.println("Car -> stopped");
    }
}

class Fiat extends Car{

    public Fiat(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void accelerate() {
        System.out.println("Fiat -> Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Fiat -> Stopping");
    }

    @Override
    public void startEngine() {
        System.out.println("Fiat -> Starting engine");
    }
}

class Ford extends Car {
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void accelerate() {
        System.out.println("Ford -> Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Ford -> Stopping");
    }

    @Override
    public void startEngine() {
        System.out.println("Ford -> Starting engine");
    }
}

    class Honda extends Car {
        public Honda(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public void startEngine() {
            System.out.println(getClass().getSimpleName() + " -> Start Engine");
        }

        @Override
        public void accelerate() {
            System.out.println("Honda -> accelerate");
        }

        @Override
        public void brake() {
            System.out.println("Honda -> brake");
        }
    }


    public class Main {

    public static void main(String[] args) {

        Car car =new Car("Base car",4);
        car.startEngine();
        car.accelerate();
        car.brake();



        Fiat fiat =new Fiat("Chronos",4);
        fiat.startEngine();
        fiat.accelerate();
        fiat.brake();

        Ford ford =new Ford("Falcon",8);
        ford.startEngine();
        ford.accelerate();
        ford.brake();

        Honda honda =new Honda("Civic",16);
        honda.startEngine();
        honda.accelerate();
        honda.brake();

    }



}


