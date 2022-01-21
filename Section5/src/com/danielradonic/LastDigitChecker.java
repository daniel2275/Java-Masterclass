package com.danielradonic;

public class LastDigitChecker {
    public static boolean hasSameLastDigit (int numOne, int numTwo, int numThree) {
        if (!(isValid(numOne) && isValid(numTwo) && isValid(numThree))) {
            return false;
        }

        int digitOne = numOne % 10;
        int digitTwo = numTwo % 10;
        int digitThree = numThree % 10;

        if (digitOne == digitTwo || digitOne == digitThree || digitThree == digitTwo) {
            return true;
        }
        return false;
    }

    public static boolean isValid (int number) {
        return  (number >= 10 && number <= 1000) ;
    }
}
