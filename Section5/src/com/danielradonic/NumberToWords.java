package com.danielradonic;

public class NumberToWords {
    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int numRev = reverse(number);



        for (int i = 0; i < getDigitCount(number); i++) {
            switch (numRev % 10) {
                case 0 -> System.out.print("Zero ");
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
            }
            numRev /= 10;
        }

        System.out.println();

    }

    public static int reverse (int number){

        int tempNumber = number;
        int reversed = 0;

        while (tempNumber != 0) {
            reversed *= 10;
            reversed += tempNumber % 10;
            tempNumber  /= 10;
        }

        return reversed;
    }

    public static int getDigitCount (int number) {
        if (number < 0) {
            return -1;
        }

        int count = 1;

        while (number > 9) {
            number /= 10;
            count ++;
        }

        return count;
    }
}
