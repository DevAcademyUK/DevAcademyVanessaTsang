package bankAccount;

/*
 * this user class holds the information of the user's banking details such as username, password, balances, and types
 * of accounts.
 */

public class User {

    private String username; // this is the username object and method (also known as the action).
    private String password; // this is the password object and method/action (also known as the action).

    private String cAccount;
    private String jAccount;
    private String sAccount;

    private double cBalance;
    private double jBalance;
    private double sBalance;

    public User(String username, String password, String cAccount, String jAccount, String sAccount, double cBalance, double jBalance, double sBalance) { // this is the constructor.
        this.username = username;
        this.password = password;
        this.setcAccount(cAccount);
        this.setjAccount(jAccount);
        this.setsAccount(sAccount);
        this.setcBalance(cBalance);
        this.setjBalance(jBalance);
        this.setsBalance(sBalance);
    }

    protected double checkCurrentAccBalance() {
        return cBalance;
    }

    protected double checkJointAccBalance() {
        return jBalance;
    }

    protected double checkSavingAccBalance() {
        return sBalance;
    }

    public double depositCurrentAcc(double amount) {
        cBalance += amount;
        return cBalance;
    }

    public double depositJointAcc(double amount) {
        jBalance += amount;
        return jBalance;
    }

    public double depositSavingAcc(double amount) {
        sBalance += amount;
        return sBalance;
    }

    public double withdrawCurrentAcc(double amount) {
        cBalance -= amount;
        return cBalance;
    }

    public double withdrawJointAcc(double amount) {
        jBalance -= amount;
        return jBalance;
    }

    public double withdrawSavingAcc(double amount) {
        sBalance -= amount;
        return sBalance;
    }

    public String getcAccount() {
        return cAccount;
    }

    public void setcAccount(String cAccount) {
        this.cAccount = cAccount;
    }

    public String getjAccount() {
        return jAccount;
    }

    public void setjAccount(String jAccount) {
        this.jAccount = jAccount;
    }

    public String getsAccount() {
        return sAccount;
    }

    public void setsAccount(String sAccount) {
        this.sAccount = sAccount;
    }

    public double getcBalance() {
        return cBalance;
    }

    public void setcBalance(double cBalance) {
        this.cBalance = cBalance;
    }

    public double getjBalance() {
        return jBalance;
    }

    public void setjBalance(double jBalance) {
        this.jBalance = jBalance;
    }

    public double getsBalance() {
        return sBalance;
    }

    public void setsBalance(double sBalance) {
        this.sBalance = sBalance;
    }
}
