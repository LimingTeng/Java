package AbstractClass;

/**
 * Created by LynnTeng on 2019/4/30.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void breathe();

    public String getName() {
        return name;
    }
}
