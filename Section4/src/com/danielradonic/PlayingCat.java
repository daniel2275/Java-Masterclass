package com.danielradonic;

public class PlayingCat {
    public static boolean isCatPlaying (boolean summer, int temperature) {
        return  ((temperature >= 25) && (temperature <= 45 && summer || temperature <= 35));
    }
}
