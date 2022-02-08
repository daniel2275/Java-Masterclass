package com.danielradonic;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            Branch newBranch = new Branch(branchName);
            branches.add(newBranch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = this.findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName,initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName,String customerName, double transaction){
        Branch branch = this.findBranch(branchName);
        if (branch != null) {
             return branch.addCustomerTransaction(customerName,transaction);
        }
        return false;
    }


    private Branch findBranch(String branchName){
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName))
                return branch;
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            for (Customer customer : branch.getCustomers()) {
                System.out.println("Customer: " + customer.getName() + "[" + (branch.getCustomers().indexOf(customer) + 1)  + "]");
                if (printTransactions) {
                    System.out.println("Transactions");
                    for (Double transaction : customer.getTransactions()) {
                        System.out.println("[" + (customer.getTransactions().indexOf(transaction) + 1) + "]" + "  Amount " + transaction);
                    }
                }
            }
            return true;
        }
        return false;
    }
}
