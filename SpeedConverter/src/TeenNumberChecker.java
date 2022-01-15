public class TeenNumberChecker {
    public static boolean hasTeen (int numOne,int numTwo, int numThree) {
        return (isTeen(numOne) || isTeen(numTwo) || isTeen(numThree));
    }

    public static boolean isTeen (int num) {
        return (num >= 13 && num <=19);
    }
}
