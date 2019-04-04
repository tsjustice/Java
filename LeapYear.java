public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        }
        if ((year % 4) == 0){
            if ((year % 100) == 0){
                if ((year % 400) == 0){
                    return true;
                } else {
                    return false;
                }

            } else {
                return true;
            }

        } else {
            return false;
        }
    }
    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        if (month == 2) {
            boolean leapYear = isLeapYear(year);
            if (leapYear) {
                return 29;
            } else {
                return 28;
            }
        }
        switch (month) {
            case 1:
                days = 31;
            case 2:
                days = 28;
            case 3:
                days = 31;
            case 4:
                days = 30;
            case 5:
                days = 31;
            case 6:
                days = 30;
            case 7:
                days = 31;
            case 8:
                days = 31;
            case 9:
                days = 30;
            case 10:
                days = 31;
            case 11:
                days = 30;
            case 12:
                days = 31;
        }
        return days;
    }
}
