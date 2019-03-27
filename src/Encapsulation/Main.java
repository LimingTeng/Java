package Encapsulation;

/**
 * Created by LynnTeng on 2019/3/27.
 */
public class Main {
    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("Time", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
