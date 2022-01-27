package com.danielradonic;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(1,false);
        System.out.println("Toner level " + printer.getTonerLevel() + "%" ) ;
        printer.printPage();
        printer.printPage();
        printer.fillToner(-10);
        printer.fillToner(110);
        printer.fillToner(10);
        printer.printPage();
        System.out.println("Total pages " + printer.getPagesPrinted());

        System.out.println("-----------------------------------------------------");

        Printer printerDuplex = new Printer(1,true);
        System.out.println("Toner level " + printerDuplex.getTonerLevel() + "%" ) ;
        printerDuplex.printPage();
        printerDuplex.fillToner(3);
        printerDuplex.printPage();
        printerDuplex.printPage();
        printerDuplex.fillToner(4);
        printerDuplex.printPage();
        printerDuplex.printPage();
        printerDuplex.fillToner(10);
        System.out.println("Total pages " + printerDuplex.getPagesPrinted());
    }
}
