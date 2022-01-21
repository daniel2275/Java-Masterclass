package com.danielradonic;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void readMinMax(){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        int min = 0;
//        int max = 0;
//        boolean flag = false;

        Scanner minMaxScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number");
            boolean isInt = minMaxScanner.hasNextInt();

            if (isInt) {
                int number = minMaxScanner.nextInt();
//                if (max < number || flag) {
                if (max < number) {
                    max = number;
                }
//                if (min > number || flag) {
                if (min > number) {
                    min = number;
                }
//                flag = true;
                minMaxScanner.nextLine();
            } else {
                break;
            }

        }

        System.out.println("Min: " + min + " Max: " + max);

        minMaxScanner.close();
    }
}
