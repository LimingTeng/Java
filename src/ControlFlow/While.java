package ControlFlow;

/**
 * Created by LynnTeng on 2019/3/13.
 */
public class While {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        // Identical For Loop:
        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }
    }
}
