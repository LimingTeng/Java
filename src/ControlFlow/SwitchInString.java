package ControlFlow;

/**
 * Created by LynnTeng on 2019/3/13.
 */
public class SwitchInString {
    public static void main(String[] args) {
        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            // 3 ~ 12 ...
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
