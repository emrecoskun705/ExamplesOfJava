public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay == -1 || hourOfDay > 23) {
            return false;
        }

        if (barking) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
