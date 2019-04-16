package DataStructure_LinkedList;

import java.util.ArrayList;

/**
 * Created by LynnTeng on 2019/4/15.
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Lydia", 100.00);
        Customer anotherCustomer;
        /*
        * Java was assigning the second customer class to point to the first class.
        * It just save the memory address. It didn't create a separate class
        * */
        anotherCustomer = customer;
        anotherCustomer.setBalance(150.00);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        // Difference with ArrayList: ArrayList can only insert to the position queried
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        System.out.println("Original ArrayList:\n");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);
        System.out.println("Update Added ArrayList:\n");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

    }
}
