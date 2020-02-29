public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999) || (year < 1)) {
            return false;
        }
        if (year % 4 == 0){
            if ((year % 400 != 0) && (year % 100 == 0)) {
                return false;
            }return true;
        } return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999) || (year < 1)) {
            return -1;
        }
        int dayOfMonth = 0;
        switch (month) {
            case 1:
                dayOfMonth = 31;
                break;
            case 2:
                dayOfMonth = 28;
                break;
            case 3:
                dayOfMonth = 31;
                break;
            case 4:
                dayOfMonth = 30;
                break;
            case 5:
                dayOfMonth = 31;
                break;
            case 6:
                dayOfMonth = 30;
                break;
            case 7:
                dayOfMonth = 31;
                break;
            case 8:
                dayOfMonth = 31;
                break;
            case 9:
                dayOfMonth = 30;
                break;
            case 10:
                dayOfMonth = 31;
                break;
            case 11:
                dayOfMonth = 30;
                break;
            case 12:
                dayOfMonth = 31;
                break;
        }
        if (isLeapYear(year) && (month == 2)) {
            dayOfMonth = 29;
        }
        return dayOfMonth;
    }
}
