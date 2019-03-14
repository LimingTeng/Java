package ControlFlow;

/**
 * Created by LynnTeng on 2019/3/13.
 */
public class Break {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber (int num) {
        while (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
