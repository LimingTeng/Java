package OOP_Project;

/**
 * Created by LynnTeng on 2019/3/28.
 */
public class HealthyBurger extends BaseBurger {
    private int healthyAdditions;

    public HealthyBurger(String rollType, String meat, int price, int additions) {
        super(rollType, meat, price);
        if (healthyAdditions <= 2) {
            this.healthyAdditions = additions;
        } else {
            this.healthyAdditions = 2;
        }
    }

    @Override
    public Additions getAdditionalPrice() {

        return additions;
    }
}
