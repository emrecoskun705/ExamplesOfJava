public class TeenNumberChecker {

    public static boolean hasTeen(int a, int b, int c) {
        return (a <= 19 && a >= 13) || (b <= 19 && b >= 13) || (c <= 19 && c >= 13 ) ;
    }

    public static boolean isTeen(int c) {
        return (c <= 19 && c >= 13);
    }
}
