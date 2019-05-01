package Generics;

import java.util.ArrayList;

/**
 * Created by LynnTeng on 2019/5/1.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("Lydia");
        items.add(4);
        items.add(5);
        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }
}
