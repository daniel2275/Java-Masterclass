package com.danielradonic;

public class Printer1 {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer1(int tonerLevel, boolean duplex) {
        if (tonerLevel >-1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if (this.tonerLevel + tonerAmount <= 100 && tonerAmount > 0) {
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = 0;
        if (duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = (pages/2) + (pages%2);
        } else  {
            pagesToPrint = pages;
        }
        pagesPrinted += pagesToPrint;
        System.out.print("Pages printed was " + pagesToPrint + " new total print count for printer = " + pagesPrinted);
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
