package Constructor;

/**
 * Created by LynnTeng on 2019/3/14.
 */
public class Main {

    public static void main(String[] args) {

        // Bank:
        Bank amex = new Bank();
        //Bank amex = new Bank("12345", 0, "Lydia", "tengliming@gmail.com", "(206) 123-4567");
        System.out.println("Account number: " + amex.getAccountNumber());
        System.out.println("Balance: " + amex.getBalance());
        Bank chase = new Bank("Tim", "time@email.com", "(206) 111-5555");
        System.out.println(chase.getAccountNumber() + " name " + chase.getName());
        System.out.println("--------------------------------");

        // VipCustomer:
        VipCustomer lydia = new VipCustomer();
        System.out.println(lydia.getName());

        VipCustomer ethan = new VipCustomer("ethan", "2500");
        System.out.println(ethan.getName());

        VipCustomer tim = new VipCustomer("tim", "1000", "tim@gmail.com");
        System.out.println(tim.getName());
        System.out.println(tim.getEmail());
        System.out.println("--------------------------------");

        // Wall Area:
        Wall wall = new Wall(5, 4);
        System.out.println("area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
        System.out.println("--------------------------------");

        // Point:
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0, 0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2, 2) = " + first.distance(2, 2));

        Point point = new Point();
        System.out.println("distance() = " + point.distance());
        System.out.println("--------------------------------");

        // Floor, Carpet, Calculator:
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());
        System.out.println("--------------------------------");

        // ComplexNumber:
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real() = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real() = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        number.subtract(one);
        System.out.println("one.real() = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
    }
}
