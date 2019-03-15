package Inheritance;

/**
 * Created by LynnTeng on 2019/3/14.
 */
public class Main {
    public static void main(String[] args) {
        // Animal, Dog, Fish
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long sikly");
        dog.eat();
        dog.walk();
        //dog.run();
        System.out.println("---------------------------");

        // Vehicle, Car, Outlander
        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}
