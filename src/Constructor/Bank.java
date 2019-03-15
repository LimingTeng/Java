package Constructor;

/**
 * Created by LynnTeng on 2019/3/14.
 */
public class Bank {
    private String accountNumber;
    private int balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Bank() {
        // this call another constructor
        this("00000", 0, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor");
    }

    public Bank(String name, String email, String phoneNumber) {
        this("99999", 100, name, email, phoneNumber);
    }

    public Bank(String accountNumber, int balance, String name, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int deposit(int input) {
        System.out.println("Your input is $" + input);
        this.balance += input;
        return this.balance;
    }

    public int withdraw(int output) {
        System.out.println("Your output is $" + output);
        if (output > this.balance) {
            System.out.println("Sorry, your funds are insufficient");
            return -1;
        } else {
            this.balance -= output;
            return this.balance;
        }
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
