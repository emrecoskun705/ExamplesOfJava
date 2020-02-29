public class NumberToWords {

    public static void numberToWords(int number) {
        if(number == 0) {
            System.out.println("Zero");
        }

        int realNumber = number;
        number = reverse(number);

        if(number < 0) {
            System.out.println("Invalid Value");
        } else {
            while (number > 0) {
                int digit = number % 10;
                number = number / 10;
                if (digit == 1) {
                    System.out.println("One");
                } else if (digit == 2) {
                    System.out.println("Two");
                } else if (digit == 3) {
                    System.out.println("Three");
                } else if (digit == 4) {
                    System.out.println("Four");
                } else if (digit == 5) {
                    System.out.println("Five");
                } else if (digit == 6) {
                    System.out.println("Six");
                } else if (digit == 7) {
                    System.out.println("Seven");
                } else if (digit == 8) {
                    System.out.println("Eight");
                } else if (digit == 9) {
                    System.out.println("Nine");
                } else if (digit == 0) {
                    System.out.println("Zero");
                }
            }

            if(getDigitCount(realNumber) != getDigitCount(reverse(realNumber))) {
                int cnt = getDigitCount(realNumber)- getDigitCount(reverse(realNumber));
                for(int i=0; i<cnt; i++)
                System.out.println("Zero");
            }

        }
    }

    public static int reverse(int number) {
        int newNumber = 0;
        int realNumber = number;
        number = Math.abs(number);

        int digit = getDigitCount(number) - 1;
        while(number > 0) {
            int lastDigit = number % 10;
            newNumber += lastDigit * Math.pow(10,digit);
            digit--;
            number = number / 10;
        }
        if (realNumber < 0) {
            newNumber = newNumber * (-1);
        }
        return newNumber;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        int count = 0;
        while(number > 0) {
            number = number / 10;
            count++;
        } if (count == 0) {
            return 1;
        }

        return count;
    }
}
