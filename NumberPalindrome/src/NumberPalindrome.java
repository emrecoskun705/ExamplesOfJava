public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int countDigit = 0;
        int aNumber = Math.abs(number);
        int realNumber = number;

        while (aNumber > 0) {
            aNumber = aNumber / 10;
            countDigit++;
        }

        int newNumber = 0;
        for(int i=countDigit; i >= 1; i--) {
            int digit = number % 10;
            number = number / 10;
            newNumber += digit * Math.pow(10, i-1);
        }

        return newNumber == realNumber;
    }
}
