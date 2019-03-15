package Class;

/**
 * Created by LynnTeng on 2019/3/13.
 */
public class Main {

    public static void main(String[] args) {
        // Car: create an object
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
        System.out.println("-------------------------------");

        // SimpleCalculator:
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());
        System.out.println("--------------------------------");

        // Person:
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("full name = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        System.out.println("***************");

        person.setFirstName("John");
        person.setAge(18);
        System.out.println("full name = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("full name = " + person.getFullName());
        System.out.println("--------------------------------");

        // Bank account:
        Bank amex = new Bank();
        System.out.println("Now your balance is $" + amex.deposit(500));
        System.out.println("Now your balance is $" + amex.withdraw(100));
    }
}
