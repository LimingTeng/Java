package Interface;

/**
 * Created by LynnTeng on 2019/4/16.
 */
public interface ITelephone {
    /*
    * I'm creating what's called the Signature.
    * Not defining the actual code itself,
    * that still goes into the class that inherits this interface.
    * */
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
