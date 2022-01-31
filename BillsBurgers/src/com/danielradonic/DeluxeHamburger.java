package com.danielradonic;

public class DeluxeHamburger extends Hamburger{

    // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
    // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
    // object is created, and then prevent other additions being made.
    //  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
    // plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
    // burger (base price + all additions)
    // For the two additional classes this may require you to be looking at the base class for pricing and then
    // adding totals to final price.


    public DeluxeHamburger(String name, String meat, String breadType, double price) {
        super(name, meat, breadType, price);
        super.Addition1("Chips", 3);
        super.Addition2("Drink", 10);
    }

    @Override
    public void Addition1(String additionName, double price) {
        System.out.println("No additions for deluxe burger");
    }

    @Override
    public void Addition2(String additionName, double price) {
        System.out.println("No additions for deluxe burger");
    }

    @Override
    public void Addition3(String additionName, double price) {
        System.out.println("No additions for deluxe burger");
    }

    @Override
    public void Addition4(String additionName, double price) {
        System.out.println("No additions for deluxe burger");
    }
}
