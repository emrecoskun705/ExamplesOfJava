public class SumOddRange {

    public static boolean isOdd(int number) {
        return (number % 2 == 1);
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        if((start < 0) || (end < 0)) {
            return -1;
        }

        if(start==end && !isOdd(start)) {
            return 0;
        }

        for(int i=start; i<=end; i++) {
            if(isOdd(i)) {
                sum += i;
            }
        }

        if(sum == 0) {
            return -1;
        }
        return sum;

    }
}
