package ControlFlow;

/**
 * Created by LynnTeng on 2019/3/13.
 */
public class SwitchInChar {
    public static void main(String[] args) {
        char letter = 'C';
        switch (letter) {
            case 'A':
                System.out.println(letter + " is found");
                break;
            case 'B':
                System.out.println(letter + " is found");
                break;
            case 'C':
                System.out.println(letter + " is found");
                break;
            case 'D':
                System.out.println(letter + " is found");
                break;
            case 'E':
                System.out.println(letter + " is found");
                break;
            default:
                System.out.println("Not found");
        }
    }
}
