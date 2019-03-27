package Composition;

/**
 * Created by LynnTeng on 2019/3/26.
 */
public class Monitor {
    private String model;
    private String manufacture;
    private int size;
    /*
    * Composition: The Resolution class is part of a Monitor,
    * but the Monitor isn't a Resolution.
    * the Monitor has a Resolution.
    * */
    private Resolution nativeResolution;

    public Monitor(String model, String manufacture, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
