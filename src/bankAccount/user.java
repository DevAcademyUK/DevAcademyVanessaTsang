package bankAccount;

public class user {

    private String username; // this is the username object and method/action.
    private String password;

    private String cAccount;
    private String jAccount;
    private String sAccount;

    private int cBalance;
    private int jBalance;
    private int sBalance;

    public user(String username, String password, String cAccount, String jAccount, String sAccount, int cBalance, int jBalance, int sBalance) { // this is the constructor.
        this.username = username;
        this.password = password;
        this.setcAccount(cAccount);
        this.setjAccount(jAccount);
        this.setsAccount(sAccount);
        this.setcBalance(cBalance);
        this.setjBalance(jBalance);
        this.setsBalance(sBalance);
    }

    protected String checkCurrentAccBalance() {
        return getcAccount();
    }

    protected String checkJointAccBalance() {
        return getjAccount();
    }

    protected String checkSavingAccBalance() {
        return getsAccount();
    }

    public String depositCurrentAcc() {
        return getcAccount();
    }

    public String depositJointAcc() {
        return getjAccount();
    }

    public String depositSavingAcc() {
        return getsAccount();
    }

    public String withdrawCurrentAcc() {
        return getcAccount();
    }

    public String withdrawJointAcc() {
        return getjAccount();
    }

    public String withdrawSavingAcc() {
        return getsAccount();
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

    public int getcBalance() {
        return cBalance;
    }

    public void setcBalance(int cBalance) {
        this.cBalance = cBalance;
    }

    public int getjBalance() {
        return jBalance;
    }

    public void setjBalance(int jBalance) {
        this.jBalance = jBalance;
    }

    public int getsBalance() {
        return sBalance;
    }

    public void setsBalance(int sBalance) {
        this.sBalance = sBalance;
    }
}
