package com.danielradonic;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public  void deposit (double amount) {
        if (balance + amount > 0) {
            System.out.println("Deposited: " + amount + " Your new balance is: " + (balance + amount));
            balance += amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public  void withdraw (double amount) {
        if (balance - amount >= 0) {
            System.out.println("Withdrawn: " + amount + " Your new balance is: " + (balance - amount));
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

}
