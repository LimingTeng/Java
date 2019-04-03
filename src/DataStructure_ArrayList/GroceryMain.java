package DataStructure_ArrayList;

import java.util.Scanner;

/**
 * Created by LynnTeng on 2019/4/2.
 */
public class GroceryMain {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryItem();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - Print choice options.");
        System.out.println("\t 1 - Print the list of grocery items.");
        System.out.println("\t 2 - Add an item to the list.");
        System.out.println("\t 3 - Modify an item in the list.");
        System.out.println("\t 4 - Remove an item in the list.");
        System.out.println("\t 5 - Search for an item in the list.");
        System.out.println("\t 6 - Quit the application");
    }

    public static void addItem() {
        System.out.println("Please enter new grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter the item number you want to modify: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo - 1, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter the item number you want to remove: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Enter the item you want to search: ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found item " + searchItem + " in our shopping list.");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}
