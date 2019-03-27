package Composition;

/**
 * Created by LynnTeng on 2019/3/26.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    public void drawLogo() {
        //getMonitor().drawPixelAt(1200, 1500, "yellow");
        /*
        * Access variable directly, because actually we don't need these getters below
        * */
        monitor.drawPixelAt(1200, 50, "yellow");
    }

//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
