package Constructor;

/**
 * Created by LynnTeng on 2019/3/14.
 */
public class VipCustomer {
    private String name;
    private String creditLimit;
    private String email;

    public VipCustomer(String name, String creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String name, String creditLimit) {
        this(name, creditLimit, "default@email.com");
    }

    public VipCustomer() {
        this("defaultName", "defaultCreditLimit", "default@email.com");
    }

    public String getName() {
        return this.name;
    }

    public String getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
