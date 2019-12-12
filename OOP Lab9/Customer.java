public class Customer{
    private String firstName, lastName;
    private Account acct[];
    private int numOfAccount;

    public Customer (String f, String l){
        this.firstName = f;
        this.lastName = l;
        this.acct = new Account[5];
    }
    public Customer (){
        this("","");
    }
    public void setFirstName(String f){
        this.firstName = f;
    }
    public void setLastName(String l){
        this.lastName = l;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public Account getAccount(int index){
        return this.acct[index];
    }
    public void addAccount(Account acct){
        this.acct[numOfAccount++] = acct;
    }
    public int getNumOfAccount(){
        return this.numOfAccount;
    }
    public String toString(){
        return this.firstName + " " + this.lastName + " has " + getNumOfAccount() + " accounts.";
    }
    public boolean equals(Customer c){
        if(firstName.equals(c.getFirstName()) & lastName.equals(c.getLastName())){
            return true;
        }else{
            return false;
        }
    }
}