package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte myByteValue = 100;
        short myShortValue = 30000;
        int myIntValue = 2100000000;
        long myNewLongValue = (50000 + ( (long) ((myByteValue + myShortValue + myIntValue)) * 10));
        System.out.println("myNewLongValue = " + myNewLongValue);


        byte ByteValue = 10;
        short ShortValue = 20;
        int IntValue = 50;


        long longTotal = (50000 + 10L * (ByteValue + ShortValue + IntValue));
        System.out.println("longTotal = " + longTotal);
    }
}
