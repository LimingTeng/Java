package ControlFlow;

/**
 * Created by LynnTeng on 2019/3/13.
 */
public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int Year) {
        if (Year >= 1 && Year <= 9999) {
            if ((Year % 4 == 0 && Year % 100 != 0) || Year % 400 == 0) {
                return true;
            }
        }
        return  false;
    }

    public static int getDaysInMonth(int month, int year){


        if (month <1 || month >12 || year <1 || year > 9999) return -1;
        else if (month == 1) return 31;
        else if (month == 2 && isLeapYear(year)) return 29;
        else if (month == 2 && !isLeapYear(year)) return 28;
        else if (month == 3) return 31;
        else if (month == 4 ) return 30;
        else if (month == 5 ) return 31;
        else if (month == 6 ) return 30;
        else if (month == 7) return 31;
        else if (month == 8 ) return 31;
        else if (month == 9 ) return 30;
        else if (month == 10) return 31;
        else if (month == 11 ) return 30;
        else return 31;
    }


    public static void main(String[] args) {
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
    }
}
