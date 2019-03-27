package Composition;

/**
 * Created by LynnTeng on 2019/3/26.
 */
public class Motherboard {
    private String model;
    private String manufacture;
    private String bios;
    private int ramSlot;
    private int cardSlot;

    public Motherboard(String model, String manufacture, String bios, int ramSlot, int cardSlot) {
        this.model = model;
        this.manufacture = manufacture;
        this.bios = bios;
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getBios() {
        return bios;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public int getCardSlot() {
        return cardSlot;
    }
}
