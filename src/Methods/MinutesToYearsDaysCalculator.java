package Overloading;

/**
 * Created by LynnTeng on 2019/3/13.
 */
public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int year = (int)(minutes / (365 * 24 * 60));
            int remainingMin = (int)(minutes % (365 * 24 * 60));
            int day = remainingMin / (24 * 60);
            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(1440);
    }
}
