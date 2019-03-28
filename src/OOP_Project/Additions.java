package OOP_Project;

/**
 * Created by LynnTeng on 2019/3/28.
 */
public class Additions {
    private int additionItems;

    public Additions(int additionItems) {
        if (additionItems <= 4) {
            this.additionItems = additionItems;
        } else {
            this.additionItems = 4;
        }
    }

    public int getAdditionPrice() {
        int additionPrice;
        additionPrice = additionItems * 2;
        return additionPrice;
    }
}
