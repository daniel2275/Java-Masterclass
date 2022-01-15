package com.danielradonic;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(130,24));
        System.out.println(getDurationString(244));
    }

    public static String getDurationString (int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String result = addLeadingZeros(hours,"h ") + addLeadingZeros(remainingMinutes,"m ") + addLeadingZeros(seconds,"s ");

        return  result;
    }

    public static String addLeadingZeros(int value, String time) {
        if (value < 10) {
            return "0" + value + time;
        } else {
            return value + time;
        }

    }

    public static String getDurationString (int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
