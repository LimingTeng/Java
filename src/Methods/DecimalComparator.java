/**
 * Created by LynnTeng on 2019/3/12.
 */
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
        if (num1 * num2 < 0) {
            return false;
        } else {
            int num1Int = (int) (num1 * 1000);
            int num2Int = (int) (num2 * 1000);
            if (num1Int == num2Int) return true;
            return false;
        }
    }

    public static void main (String[] args) {
        areEqualByThreeDecimalPlaces(3.175, 3.176);
    }
}
