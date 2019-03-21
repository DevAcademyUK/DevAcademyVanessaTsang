package bankAccount;

public class user {

    private String username; // this is the username object and method/action.
    private String password;
    private String cAccount;
    private String jAccount;
    private String sAccount;

    public user(String username, String password, String cAccount, String jAccount, String sAccount) { // this is constructor.
        this.username = username;
        this.password = password;
        this.cAccount = cAccount;
        this.jAccount = jAccount;
        this.sAccount = sAccount;
    }

    protected String checkCurrentAccBalance(){
        return cAccount;
    }

    protected String checkJointAccBalance() {
        return jAccount;
    }

    protected String checkSavingAccBalance() {
        return sAccount;
    }

    public String depositCurrentAcc() {
        return cAccount;
    }

    public String depositJointAcc() {
        return jAccount;
    }

    public String depositSavingAcc() {
        return sAccount;
    }

    public String withdrawCurrentAcc() {
        return cAccount;
    }

    public String withdrawJointAcc() {
        return jAccount;
    }

    public String withdrawSavingAcc() {
        return sAccount;
    }
}
