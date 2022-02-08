package com.danielradonic;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer (String customerName, double initialTransaction) {
        Customer checkCustomer = findCustomer(customerName);
        if (checkCustomer == null) {
            Customer newCustomer = new Customer(customerName,initialTransaction);
            customers.add(newCustomer);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName,double transaction) {
        Customer foundCustomer = findCustomer(customerName);
        if (foundCustomer != null) {
            foundCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customers){
            if (customer.getName().equals(customerName)){
                return customer;
            }
        }
        return null;
    }


}
