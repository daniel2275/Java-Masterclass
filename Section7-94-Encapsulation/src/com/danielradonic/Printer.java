package com.danielradonic;

public class Printer {
    private int tonerLevel;
    private int PagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >-1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.PagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return PagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int fillToner(int tonerLevel){
        if (this.tonerLevel + tonerLevel <= 100 && tonerLevel > 0) {
            this.tonerLevel += tonerLevel;
            System.out.println("Filled toner up to " + this.tonerLevel + "% percent");
            return this.tonerLevel;
        } else {
            System.out.println("Incorrect refill amount");
            return -1;
        }
    }

    public void printPage(){
        if (isDuplex && this.tonerLevel > 1) {
            System.out.print("Printing duplex page");
            this.tonerLevel -= 2; // account for toner consumption
            this.PagesPrinted++;
            System.out.println(" - Remaining toner " + this.tonerLevel + "%");
        } else if (this.tonerLevel > 0 && !isDuplex) {
            System.out.print("Printing single page");
            this.tonerLevel -= 1; // account for toner consumption
            this.PagesPrinted++;
            System.out.println(" - Remaining toner " + this.tonerLevel + "%");
        } else {
            System.out.println("Remaining toner: " + this.tonerLevel + "%, not enough to continue printing");
        }
    }
}
