package Interface;

/**
 * Created by LynnTeng on 2019/4/16.
 */
public class TelephoneMain {
    public static void main(String[] args) {
        ITelephone lydiasPhone;
        lydiasPhone = new DeskPhone(123456);
        /*
        * We need to find the interface,
        * but the actual class implementation in this case
        * desk phone is the specific functionality for a certain type of telephone.
        * So the interface is there at an abstract level to tell you
        * what methods are valid and have to be actually overridden in an actual class.
        * So that's why you can't actually instantiate it using the Itelephone Interface.
        * You have to actually use the actual class that has overridden that functionality.
        * */
        lydiasPhone.powerOn();
        lydiasPhone.callPhone(123456);
        lydiasPhone.answer();

        /*
        * Now set MobilePhone as a different class but it still worked.
        * */
        lydiasPhone = new MobilePhone(234567);
        lydiasPhone.powerOn();
        lydiasPhone.callPhone(234567);
        lydiasPhone.answer();
    }
}
