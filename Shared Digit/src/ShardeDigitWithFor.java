public class ShardeDigitWithFor {

    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 < 10) || (number1 > 99) || (number2 < 10) || (number2 > 99)) {
            return false;
        }

        int fakeNumber2 = number2;
        for(int i=0; i<2; i++) {
            int digit1 = number1 % 10;
            number1 = number1 / 10;
            fakeNumber2 = number2;
            for(int j=0; j<2; j++) {
                int digit2 = number2 % 10;
                fakeNumber2 = fakeNumber2 /10;
                System.out.println(digit1 + " " + digit2);
                if (digit1 == digit2) {
                    return true;
                }
            }
        }

        return false;
    }
}
