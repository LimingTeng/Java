package AbstractClass;

/**
 * Created by LynnTeng on 2019/4/30.
 */
public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println(getName() + " is not good at flying, but can swim instead");
    }
}
