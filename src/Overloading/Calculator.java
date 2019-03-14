package Overloading;

/**
 * Created by LynnTeng on 2019/3/12.
 */
public class Calculator {

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid value");
            return -1;
        }
        double centimeters = (12 * feet + inches) * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + "centimeters");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inch) {
        if (inch < 0) return -1;
        int feet = inch / 12;
        int remainingInches = inch % 12;
        System.out.println(inch + " inches = " + feet + "feet, " + remainingInches + "inches");
        double centimeters = calcFeetAndInchesToCentimeters(feet, remainingInches);
        return centimeters;
    }

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(12);
    }
}
