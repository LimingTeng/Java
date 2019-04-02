package DataStructure_Array;

import java.util.Scanner;

/**
 * Created by LynnTeng on 2019/4/2.
 */
public class FindMin {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] array = readIntegers(count);
        int minimum = findMin(array);
        System.out.println("Minimum number of array is " + minimum);
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter an array of " + count + " counts.\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
