package com.danielradonic;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int[] arraySort = getIntegers(7);

        System.out.println("Unsorted array:");
        printArray(arraySort);

        sortIntegers(arraySort);
        System.out.println("Sorted array");
        printArray(arraySort);
    }


    public static int[] getIntegers(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNumbers = new int[size];

        for (int i = 0; i < arrayNumbers.length; i++ ) {
            System.out.println("Enter number: \r");
            arrayNumbers[i] = sc.nextInt();
        }

        return arrayNumbers;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++ ) {
            System.out.println("Element " + i + " contents " + array[i]);
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