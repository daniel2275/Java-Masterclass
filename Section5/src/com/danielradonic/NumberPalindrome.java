package com.danielradonic;

public class NumberPalindrome {
    public static boolean isPalindrome (int number){
        int reverse = 0;
        int numberToCompare = number;

        while (numberToCompare != 0) {
            int digit = (numberToCompare % 10);
            reverse *= 10;
            reverse += digit;
            numberToCompare /= 10;
        }

        return (number == reverse);
    }
}
