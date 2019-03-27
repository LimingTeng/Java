package Encapsulation;

/**
 * Created by LynnTeng on 2019/3/27.
 */
public class EnhancedPlayer {
    /*
    * Encapsulation:
    * Make field private
    * And you can Refactor(Rename) any field without changing getters.
    * You will not affect any other code.
    * */
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public int getHealth() {
        return hitPoints;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }


}
