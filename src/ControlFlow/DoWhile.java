package ControlFlow;

/**
 * Created by LynnTeng on 2019/3/13.
 */
public class DoWhile {
    public static void main(String[] args) {
        int count = 6;
        // do...will be executed at least once
        do {
            System.out.println("Count value was " + count);
            count ++;
        } while (count != 6);
    }
}
