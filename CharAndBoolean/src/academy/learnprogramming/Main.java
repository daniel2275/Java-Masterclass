package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D'; // 16 bits - 2 bytes (1 byte for Unicode)
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
