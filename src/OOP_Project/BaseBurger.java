package OOP_Project;

/**
 * Created by LynnTeng on 2019/3/28.
 */
public class BaseBurger {
    private String rollType;
    private String meat;
    private int price;
    public Additions additions;

    public BaseBurger(String rollType, String meat, int price) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public int getBasePrice() {
        System.out.println("The base price is " + this.price);
        return this.price;
    }

    public Additions getAdditionalPrice() {
        additions.getAdditionPrice();
        return additions;
    }

    public int getTotalPrice() {
        int totalPrice;
        totalPrice = this.price + additions.getAdditionPrice();
        System.out.println("The total price is " + totalPrice);
        return totalPrice;
    }
}
