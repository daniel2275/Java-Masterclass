package com.danielradonic;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }


        while (goal > 0) {
            if (bigCount > 0 && (goal - 5) >= 0) {
                goal -= 5;
                bigCount--;
            } else if (smallCount > 0) {
                goal -= 1;
                smallCount -= 1;
            } else {
                return false;
            }
        }
        return true;
    }
}
