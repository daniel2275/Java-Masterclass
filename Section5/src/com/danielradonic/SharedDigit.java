package com.danielradonic;

public class SharedDigit {
    public static boolean hasSharedDigit (int numberOne, int numberTwo) {
        if (numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99) {
            return false;
        }

        int digit = 0;


        while (numberOne > 0) {
            digit = numberOne % 10;
            numberOne = numberOne / 10;

            int tempTwo = numberTwo;

            while (tempTwo > 0) {
                if (digit == (tempTwo % 10)) {
                    return true;
                }
                tempTwo = tempTwo / 10;
            }
        }
        return false;
    }
}
