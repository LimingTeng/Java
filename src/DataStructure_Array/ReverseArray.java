package DataStructure_Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by LynnTeng on 2019/4/2.
 */
public class ReverseArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the count of an array: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] array = getArray(count);
        System.out.println("The original array is " + Arrays.toString(array));

        reverse(array);
        System.out.println("The reversed array is " + Arrays.toString(array));
    }

    public static int[] getArray(int count) {
        int[] array = new int[count];
        System.out.println("Enter an array of " + count + " count: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
