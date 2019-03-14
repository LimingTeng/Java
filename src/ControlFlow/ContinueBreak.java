package ControlFlow;

/**
 * Created by LynnTeng on 2019/3/13.
 */
public class ContinueBreak {

    public static boolean isEvenNumber (int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;

        while(number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number is " + number);
        }
    }
}
