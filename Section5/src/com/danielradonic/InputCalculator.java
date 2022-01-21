package com.danielradonic;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long avg;


        while (true) {
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else  {
                break;
            }
            scanner.nextLine();
        }

        avg = Math.round((double) sum / count);

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}

// average = Math.round((double) sum/count);
//        average = Math.round(11.0/3)); // sum is a double, i.e. 11.0
//        average = Math.round(3.66666); // calculation is a double of 3.66666
//        average = Math.round(4); // rounding up so get 4 not 3!!!
//        average = 4; // correct answer
