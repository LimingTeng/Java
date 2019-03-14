package ControlFlow;

/**
 * Created by LynnTeng on 2019/3/13.
 */
public class EvenNumber {
    public static boolean isEvenNumber (int num) {
        while (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        isEvenNumber(6);
    }
}
