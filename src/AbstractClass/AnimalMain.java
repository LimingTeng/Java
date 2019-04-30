package AbstractClass;

/**
 * Created by LynnTeng on 2019/4/30.
 */
public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Penguin");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}
