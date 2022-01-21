package com.danielradonic;


public class Main {

    public static void main(String[] args) {
//        char aToE = 'D';
//
//        switch (aToE) {
//
//            case 'A': case 'B': case 'C': case 'D': case 'E':
//                System.out.println("Found: " + aToE);
//                break;
//            default:
//                System.out.println("Not found");
//                break;
//            DayOfTheWeekChallenge.printDayOfTheWeek(3);
//            DayOfTheWeekChallenge.printDayOfTheWeekIf (1);

//        System.out.println(NumbersOfDaysInMonth.isLeapYear(9000));
//        System.out.println(NumbersOfDaysInMonth.getDaysInMonth(2, -2019));
//       for (int i = 2 ; i < 9; i++) {
//           System.out.println("10000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//       }

//       for (int i = 8 ; i >= 2; i--) {
//            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//       }

//        int count = 0;
//        for (int i=10; i < 50; i++) {
//            if (isPrime(i)) {
//                System.out.println("found: " + i);
//                count++;
//                if (count == 3) {
//                    break;
//                }
//            }
//        }

//    int sum = 0;
//    int count = 0;
//    for (int i = 1; i <= 1000; i++ ) {
//        if (i % 3 == 0 && i % 5 == 0) {
//            sum += i;
//            System.out.println("Number: " + i);
//            count++;
//        }
//
//        if (count==5) {
//            break;
//        }
//    }
//    System.out.println("Sum: " + sum);

//        int number = 4;
////        int finishNumber = 20;
////        int count = 0;
////
////        while (number <= finishNumber) {
////            if (!isEvenNumber(number)) {
////
////                number++;
////                continue;
////            }
////
////            count++;
////            System.out.println("Even number" + number);
////            if (count == 5) {
////                System.out.println("Total number of even numbers: " + count);
////                break;
////            }
////            number++;
////        }

//        System.out.println(DigitSumChallenge.SumDigits(125));

//NumberPalindrome.isPalindrome(-2001002);

//FirstLastDigitSum.sumFirstAndLast(125);

//        System.out.println(LastDigitChecker.hasSameLastDigit (41, 22, 71));
//        System.out.println(LastDigitChecker.hasSameLastDigit (22, 23, 34));
//        System.out.println(LastDigitChecker.hasSameLastDigit (9, 99, 999));

//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(1010, 10));

//        FactorPrinter.printFactors(10);

//        PerfectNumber.isPerfectNumber(28);

//        System.out.println(NumberToWords.reverse(-92));
//        System.out.println(NumberToWords.getDigitCount(0));
//        NumberToWords.numberToWords(1907200);


//        System.out.println(FlourPacker.canPack(1,0,5));


//        System.out.println(LargestPrime.getLargestPrime(21));

//DiagonalStar.printSquareStar(11);


//         ReadingUserInputChallenge.readNumbers();

//        MinAndMaxInputChallenge.readMinMax();

//    InputCalculator.inputThenPrintSumAndAverage();

        System.out.println(PaintJob.getBucketCount(2.75,3.25,2.5,1));


    }

    public static double calculateInterest (double amount, double interestRate){
        return(amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

//        for(int i=2; i <= n/2; i++) {
        for(int i=2; i <= (long) Math.sqrt(n) ; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEvenNumber (int number) {
        return (number % 2 == 0);
    }

    }



