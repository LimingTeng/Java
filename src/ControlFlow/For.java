package ControlFlow;

/**
 * Created by LynnTeng on 2019/3/13.
 */
public class For {

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static void main(String[] args) {
      //for (init(start); condition(end); increment)
        for (int i = 0; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
    }
}
