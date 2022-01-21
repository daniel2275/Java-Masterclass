package com.danielradonic;

public class FirstLastDigitSum {
    public static int sumFirstAndLast (int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int first = 0;
        sum += number % 10;

        while(number > 0) {
            first = number;
            number /= 10;
        }

        sum += first;

        return sum;
    }
}
