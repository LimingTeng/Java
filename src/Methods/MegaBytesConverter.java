/**
 * Created by LynnTeng on 2019/3/12.
 */
public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int mega = kiloBytes / 1024;
        int remaining = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + mega + " MB and " + remaining + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }
}
