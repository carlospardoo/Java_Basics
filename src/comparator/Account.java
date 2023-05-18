package comparator;

import java.io.Serializable;

public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final double NOT_ENOUGH_MONEY = -1D;

    private int id;

    private String accountName;

    private String firstname;

    private String lastname;

    private double balance;

    private double transferredMoney;

    public Account(String accountName){
        this.accountName = accountName;
        this.balance = 0D;
        this.transferredMoney = 0D;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double balance) {

        this.balance += balance;

        return this.balance;

    }

    public double getTransferredMoney() {
        return transferredMoney;
    }

    public double transferMoney(double transferredMoney) {

        if(this.balance < transferredMoney)
            return NOT_ENOUGH_MONEY;

        this.balance -= transferredMoney;
        this.transferredMoney += transferredMoney;

        return this.balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", balance=" + balance +
                ", transferredMoney=" + transferredMoney +
                '}';
    }
}
