package Encapsulation;

/**
 * Created by LynnTeng on 2019/3/27.
 */
public class Main {
    public static void main(String[] args) {
        // EnhancedPlayer:
        EnhancedPlayer player = new EnhancedPlayer("Time", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());
        System.out.println("-------------------------------------------------");

        // Printer:
        Printer printer = new Printer(50, true);
        System.out.println("initial page count = " + printer.getPagePrinter());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + printer.getPagePrinter());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + printer.getPagePrinter());

    }
}
