public class BarkingDog {
    public static boolean shouldWakeUp (boolean barkingDog, int hourOfDay) {
        if (barkingDog && (hourOfDay < 8 && hourOfDay >= 0 || hourOfDay == 23)) {
            return true;
        }
        return false;
    }
}
