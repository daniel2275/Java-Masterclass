package com.danielradonic;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arraySort = getIntegers();

        System.out.println("Unsorted array:");
        printArray(arraySort);

        sortIntegers(arraySort);
        System.out.println("Sorted array");
        printArray(arraySort);
    }


    public static int[] getIntegers() {
        int size = -1;

        do {
            System.out.println("How many numbers: \r");
            while (!sc.hasNextInt()) {
                String input = sc.next();
                System.out.printf("\"%s\" Not a valid number.%n", input);
            }
            size = sc.nextInt();
        } while (size < 0);

        int[] arrayNumbers = new int[size];

        for (int i = 0; i < arrayNumbers.length; i++ ) {
            System.out.println("Enter number: \r");
            arrayNumbers[i] = sc.nextInt();
        }

        return arrayNumbers;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++ ) {
            System.out.println(array[i]);
        }
    }



    public static int[] sortIntegers(int[] array) {
    int temp;
        for (int i = 0; i < array.length;i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

}