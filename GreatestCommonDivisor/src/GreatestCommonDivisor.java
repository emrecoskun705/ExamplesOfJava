public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }

        if((first % second == 0)) {
            return second;
        } else if (second % first == 0){
            return first;
        }

        if (second < first) {
            int temp = first;
            first = second;
            second = temp;
        }

        int greatest= 0;
        for(int i=1; i<=(first/2); i++) {
            if ((first % i == 0) && (second % i == 0)) {
                greatest = i;
            }
        }

        return greatest;
    }
}
