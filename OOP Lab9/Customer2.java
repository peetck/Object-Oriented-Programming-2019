import java.util.*;
public class Customer2{
    private String firstName, lastName;
    private ArrayList<Account> acct;
    private int numOfAccount;

    public Customer2 (String f, String l){
        this.firstName = f;
        this.lastName = l;
        acct = new ArrayList<Account>();
    }
    public Customer2(){
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
        return this.acct.get((index));
    }
    public void addAccount(Account acct){
        this.acct.add(acct);
    }
    public int getNumOfAccount(){
        return this.acct.size();
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