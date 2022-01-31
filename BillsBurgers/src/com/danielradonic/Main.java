package com.danielradonic;

public class Main {

    public static void main(String[] args) {

        Hamburger baseBurger = new Hamburger("Big Mac", "Sausage","Sandwich" ,25);
        System.out.println();
        baseBurger.Addition1("Lettuce",5);
        baseBurger.Addition2("Tomato",7);
        baseBurger.Addition3("Carrot",3);
        baseBurger.Addition4("Pickles",10);
        System.out.println();
        System.out.println("Total burger price: " + baseBurger.addItems());

        HealthyBurger healthyBurger = new HealthyBurger  ("GreenBurger","Cow", 50);
        System.out.println();
        healthyBurger.Addition1("Lettuce",5);
        healthyBurger.Addition2("Tomato",7);
        healthyBurger.Addition3("Carrot",3);
        healthyBurger.Addition4("Pickles",10);
        healthyBurger.Addition5("Onions",2);
        healthyBurger.Addition6("Cheese",6);
        System.out.println();
        System.out.println("Total burger price: " + healthyBurger.addItems());

        DeluxeHamburger deluxehamburger = new DeluxeHamburger("McMax", "Pig", "Toasted", 65);
        System.out.println();
        deluxehamburger.Addition1("Tomato",7);
    }
}
