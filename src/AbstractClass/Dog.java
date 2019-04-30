package AbstractClass;

/**
 * Created by LynnTeng on 2019/4/30.
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathe in, breathe out, repeat");

    }
}
