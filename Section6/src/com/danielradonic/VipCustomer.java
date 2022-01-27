package com.danielradonic;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }

    public VipCustomer() {
        this("Default Name", 20000, "DefaultEmail@default.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Default@Email.com");
    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


}
