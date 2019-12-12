public class Bank {
    private Account[] acct;
    private int numAcct;

    public Bank(){
        acct = new Account[10];
    }
    public void addAccount(Account ac){
        acct[numAcct++] = ac;
    }
    public Account getAccount(int index){
        return this.acct[index];
    }
    public int getNumAccount(){
        return this.numAcct;
    }

}
