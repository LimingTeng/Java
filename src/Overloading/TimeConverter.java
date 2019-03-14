package Overloading;

/**
 * Created by LynnTeng on 2019/3/13.
 */
public class TimeConverter {

    private static final String INVALID_MESSAGE = "Invalid value";

    private static String getDurationString(int min, int sec) {
        if (min < 0 || sec < 0 || sec > 59) {
            System.out.println(INVALID_MESSAGE);
            return INVALID_MESSAGE;
        } else {
            int hr = min / 60;
            min = min % 60;
            System.out.println(hr + "h " + min + "m " + sec + "s");
            return (hr + "h " + min + "m " + sec + "s");
        }
    }

    private static String getDurationString(int sec) {
        if (sec < 0) {
            System.out.println(INVALID_MESSAGE);
            return INVALID_MESSAGE;
        } else {
            int min = sec / 60;
            sec = sec % 60;
            return getDurationString(min, sec);
        }
    }

    public static void main(String[] args) {
        getDurationString(66, 55);
        getDurationString(1000);
    }
}
