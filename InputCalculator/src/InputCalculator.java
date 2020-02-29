import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        float sum = 0;
        float counter = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {

                double average =(double)(sum / counter);
                average = Math.round(average);
                int newSum = (int) sum;
                int newAverage = (int) average;

                System.out.println("SUM = " + newSum + " AVG = " + newAverage);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
