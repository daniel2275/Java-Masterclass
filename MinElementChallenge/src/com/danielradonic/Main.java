package com.danielradonic;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int elements = readInteger();
        int[] array = readElements(elements);
        System.out.println("Min= " + findMin(array));
        sc.close();
    }

    private static int readInteger() {
        System.out.println("Enter count:");
        int number = sc.nextInt();
        sc.nextLine();

        return number;
    }

    private static int[] readElements(int count){
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length ; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
