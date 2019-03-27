package Composition;

/**
 * Created by LynnTeng on 2019/3/26.
 */
public class Main {
    public static void main(String[] args) {
        // PC, Case, Dimensions, Monitor, Motherboard, Resolution:
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", "v2.44", 4, 6);

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();

        //
    }
}
