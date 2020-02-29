public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }

        int sum = 0;
        int firstDigit = number % 10;

        if(number / 10 == 0) {
            return number*2;
        }

        // last digit ,,, sum of first and last digit
         while(number > 0) {
             number = number / 10;
             System.out.println(number);
             if (number < 10) {
                 sum = (number + firstDigit);
                 return sum;
             }
         }
         return sum;

    }
}
