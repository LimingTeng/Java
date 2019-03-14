/**
 * Created by LynnTeng on 2019/3/12.
 */
public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        }
        else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.print("Invalid Value");
        }
        else {
            System.out.print(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
