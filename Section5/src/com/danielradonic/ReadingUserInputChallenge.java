package com.danielradonic;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void readNumbers() {
        int count = 0;
        int sum = 0;
        Scanner numberScanner = new Scanner(System.in);

        while (count < 10) {

            System.out.println("Enter number #" + count + ":");
            boolean isAnInt = numberScanner.hasNextInt();

            if (isAnInt) {
                int number = numberScanner.nextInt();
//                System.out.println("Your Number is: " + number + "\n");
                count++;
                sum += number;
            } else {
                System.out.println("Invalid Number" + "\n");
            }

            numberScanner.nextLine();
        }
        System.out.println("Sum: " + sum + "\n");
        numberScanner.close();
    }


}

