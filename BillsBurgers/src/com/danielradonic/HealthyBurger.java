package com.danielradonic;


public class HealthyBurger extends Hamburger {
    private String addition5;
    private double additionPrice5;
    private String addition6;
    private double additionPrice6;

    public HealthyBurger(String name, String meat, double baseBurgerPrice) {
        super(name, "Cow", "Brown rye bread roll", baseBurgerPrice);
    }


    public void Addition5(String additionName, double price) {
        this.addition5 = additionName;
        this.additionPrice5 = price;
    }

    public void Addition6(String additionName, double price) {
        this.addition6 = additionName;
        this.additionPrice6 = price;
    }

    @Override
    public double addItems() {
        double healthyPrice = super.addItems();
        if (this.addition5 != null) {
            System.out.println("->" + this.addition5 + " price: " + this.additionPrice5);
            healthyPrice +=  this.additionPrice5;
        }
        if (this.addition6 != null) {
            System.out.println("->" + this.addition6 + " price: " + this.additionPrice6);
            healthyPrice +=  this.additionPrice6;
        }

        return healthyPrice;
    }
}