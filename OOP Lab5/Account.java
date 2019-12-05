public class Account{
    /* Attribute */
    protected double balance;
    protected String name;
    /* Constructor */
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    /* methods */
    public void deposit(double a){
        if (a < 0){
            System.out.println("Input number must be a positive integer.");
        }
        else{
            this.balance += a;
            System.out.println(a + " baht is deposited to " + this.name + ".");
        }
    }
    public void withdraw(double a){
        if (a < 0){
            System.out.println("Input number must be a positive integer.");
        }
        else if (this.balance - a > 0){
            this.balance -= a;
            System.out.println(a + " baht is withdrawn from " + this.name + ".");
        }
        else{
            System.out.println("Not enough money!");
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public double getBalance(){
        return this.balance;
    }
    public void showAccount(){
        System.out.println(this.name + " account has " + this.balance + " baht.");
    }
}