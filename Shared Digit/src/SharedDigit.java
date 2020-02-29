public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 < 10) || (number1 > 99) || (number2 < 10) || (number2 > 99)) {
            return false;
        }

        int fakeNumber2 = number2;
        while(number1 > 0) {
            int digit1 = number1 % 10;
            number1 = number1 / 10;
            fakeNumber2 = number2;
            while (fakeNumber2 > 0) {
                int digit2 = fakeNumber2 % 10;
                fakeNumber2 = fakeNumber2 / 10;
                System.out.println(digit1 + " " + digit2);
                if(digit2 == digit1) {
                    return true;
                }
            }
        }

        return false;
    }
}
