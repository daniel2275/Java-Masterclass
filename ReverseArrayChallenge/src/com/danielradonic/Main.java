package com.danielradonic;



import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] array = {2,3,1,6,5,9,7};

        reverse(array);

//        int [] reversed = array.clone();
//
//        reversed = reverseNew(reversed);
//
//        System.out.println("Original: " + Arrays.toString(array));
//        System.out.println("\rReversed: " + Arrays.toString(reversed));

    }


    private static int[] reverseNew(int[] array) {
        int count = 0;
        int[] reverseArray = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[count] = array[i];
            count++;
        }
        return reverseArray;
    }


    private static void reverse(int [] array) {
        System.out.println("Array = " + Arrays.toString(array));

        int maxItems = array.length - 1;
        int halfItems = array.length / 2;

        for (int i = 0; i < halfItems; i++) {
            int temp = array[i];
            array[i] = array[maxItems - i];
            array[maxItems - i] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
