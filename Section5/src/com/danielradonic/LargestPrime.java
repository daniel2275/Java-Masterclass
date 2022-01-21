package com.danielradonic;

public class LargestPrime {
    public static int getLargestPrime(int number){
        if (number < 2) {
            return -1;
        }

        int i;
        long copyOfNumber = number;

        for (i = 2; i <= copyOfNumber; i++) {
            if (copyOfNumber % i == 0) {
                copyOfNumber /= i;
                i--;
            }
        }

        return i;
    }
}
