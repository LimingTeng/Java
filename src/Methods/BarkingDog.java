/**
 * Created by LynnTeng on 2019/3/12.
 */
public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        while (hourOfDay >= 0 && hourOfDay <= 23) {
            if (barking == false) {
                return false;
            } else {
                if (hourOfDay >= 8 && hourOfDay <= 22) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        shouldWakeUp(true, 8);
    }
}
