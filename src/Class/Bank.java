package Class;

/**
 * Created by LynnTeng on 2019/3/14.
 */
public class Bank {
    private String accountNumber;
    private int balance;
    private String name;
    private String email;
    private String phoneNumber;

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
