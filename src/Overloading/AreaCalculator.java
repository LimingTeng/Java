package Overloading;

/**
 * Created by LynnTeng on 2019/3/13.
 */
public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        double area = radius * radius * (Math.PI);
        return area;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        double area = x * y;
        return area;
    }
}
