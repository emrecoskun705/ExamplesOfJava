public class LargestPrime {

    public static int getLargestPrime(int number) {
        if(number <= 1) {
            return -1;
        }

        int prime = 2;
        int greatestNumber = 0;
        while (prime <= number) {
            if (number % prime != 0) {
                prime++;
            } else {
                number /= prime;
                greatestNumber = prime;
            }
        }
        return greatestNumber;
    }

}
