/**
 * Created by LynnTeng on 2019/3/12.
 */
public class TeenNumberChecker {
    public static boolean hasTeen (int x, int y, int z) {
        if ((x >= 13 && x <= 19) || (y >= 13 && y <= 19) || (z >= 13 && z <= 19)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen (int num) {
        if (num >= 13 && num <= 19) return true;
        return false;
    }
}
