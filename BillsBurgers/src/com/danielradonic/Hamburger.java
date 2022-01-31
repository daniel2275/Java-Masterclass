package com.danielradonic;

public class Hamburger {
    private String name;
    private String breadType;
    private String meat;
    private double price;
    private String addition1;
    private double additionPrice1;
    private String addition2;
    private double additionPrice2;
    private String addition3;
    private double additionPrice3;
    private String addition4;
    private double additionPrice4;

    public Hamburger(String name, String meat, String breadType, double price) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }

    public void Addition1(String additionName, double price) {
        this.addition1 = additionName;
        this.additionPrice1 = price;
    }

    public void Addition2(String additionName, double price) {
        this.addition2 = additionName;
        this.additionPrice2 = price;
    }

    public void Addition3(String additionName, double price) {
        this.addition3 = additionName;
        this.additionPrice3 = price;
    }

    public void Addition4(String additionName, double price) {
        this.addition4 = additionName;
        this.additionPrice4 = price;
    }

    public double addItems() {
        double total = this.price;
        if (this.addition1 != null) {
            System.out.println("->" + this.addition1 + " price: " + this.additionPrice1);
            total += this.additionPrice1;
        }
        if (this.addition2 != null) {
            System.out.println("->" + this.addition2 + " price: " + this.additionPrice2);
            total += this.additionPrice2;
        }
        if (this.addition3 != null) {
            System.out.println("->" + this.addition3 + " price: " + this.additionPrice3);
            total += this.additionPrice3;
        }
        if (this.addition4 != null) {
            System.out.println("->" + this.addition4 + " price: " + this.additionPrice4);
            total += this.additionPrice4;
        }

        return total;
    }



    public String getName() {
        return name;
    }
}


